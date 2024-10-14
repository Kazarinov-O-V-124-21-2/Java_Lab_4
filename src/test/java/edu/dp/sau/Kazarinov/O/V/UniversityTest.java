import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.dp.sau.Kazarinov.O.V.json.JsonManager;
import edu.dp.sau.Kazarinov.O.V.model.*;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityTest {

    @Test
    public void testUniversitySerializationAndDeserialization() {

        University oldUniversity = createTypicalUniversity();


        String filePath = "university.json";
        JsonManager jsonManager = new JsonManager();
        try {
            jsonManager.writeToJson(oldUniversity, filePath);

            jsonManager.displayJsonFromFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            assert false : "Ошибка при записи в файл: " + e.getMessage();
        }


        University newUniversity;
        try {
            newUniversity = jsonManager.readFromJson(filePath, University.class);
        } catch (IOException e) {
            e.printStackTrace();
            assert false : "Ошибка при чтении из файла: " + e.getMessage();
            return;
        }


        assertEquals(oldUniversity, newUniversity, "Университеты должны быть эквивалентны после сериализации и десериализации");
    }


    private University createTypicalUniversity() {

        Human universityHead = new Human("John", "Doe", "Smith", Sex.MALE);
        University university = new University("My University", universityHead);


        Human facultyHead1 = new Human("Alice", "Johnson", "Kate", Sex.FEMALE);
        Faculty faculty1 = new Faculty("Engineering", facultyHead1);

        Human facultyHead2 = new Human("Bob", "Williams", "James", Sex.MALE);
        Faculty faculty2 = new Faculty("Mathematics", facultyHead2);

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);


        addDepartmentsToFaculty(faculty1);
        addDepartmentsToFaculty(faculty2);

        return university;
    }

    private void addDepartmentsToFaculty(Faculty faculty) {

        for (int i = 0; i < 2; i++) {
            Human deptHead = new Human("DeptHead" + (i + 1), "LastName" + (i + 1), "Patronymic" + (i + 1), Sex.MALE);
            Department department = new Department("Department " + (i + 1), deptHead);
            faculty.addDepartment(department);
            addGroupsToDepartment(department);
        }
    }

    private void addGroupsToDepartment(Department department) {

        for (int i = 0; i < 2; i++) {
            Human groupHead = new Human("GroupHead" + (i + 1), "LastName" + (i + 1), "Patronymic" + (i + 1), Sex.MALE);
            Group group = new Group("Group " + (i + 1), groupHead);
            department.addGroup(group);
            addStudentsToGroup(group);
        }
    }

    private void addStudentsToGroup(Group group) {

        for (int i = 0; i < 2; i++) {
            Student student = new Student("Student" + (i + 1), "LastName" + (i + 1), "Patronymic" + (i + 1), Sex.MALE);
            group.addStudent(student);
        }
    }
}
