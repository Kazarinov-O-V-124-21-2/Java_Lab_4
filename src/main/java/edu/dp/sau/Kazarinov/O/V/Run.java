package edu.dp.sau.Kazarinov.O.V;

import edu.dp.sau.Kazarinov.O.V.model.*;
import edu.dp.sau.Kazarinov.O.V.controller.*;

public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Human universityHead = new Human("John", "Doe", "Smith", Sex.MALE);
        University university = universityCreator.createUniversity("My University", universityHead);

        Human facultyHead = new Human("Alice", "Johnson", "Kate", Sex.FEMALE);
        Faculty faculty = facultyCreator.createFaculty("Engineering", facultyHead);
        university.addFaculty(faculty);

        Human departmentHead = new Human("Linda", "Green", "Ann", Sex.FEMALE);
        Department department = new Department("Computer Science", departmentHead);
        faculty.addDepartment(department);

        Human groupHead = new Human("Mark", "Taylor", "James", Sex.MALE);
        Group group = groupCreator.createGroup("Group A", groupHead);
        department.addGroup(group);

        Student student1 = studentCreator.createStudent("Tom", "Brown", "Lee", Sex.MALE);
        group.addStudent(student1);

        Student student2 = studentCreator.createStudent("Emily", "Davis", "Ruth", Sex.FEMALE);
        group.addStudent(student2);

        university.displayUniversityInfo();
    }
}