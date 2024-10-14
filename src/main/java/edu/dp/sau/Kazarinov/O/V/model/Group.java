package edu.dp.sau.Kazarinov.O.V.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {
    private String name;
    private Human head;
    private List<Student> students;

    public Group(String name, Human head) {
        this.name = name;
        this.head = head;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }


    public void displayGroupInfo() {
        System.out.println("      Group: " + getName());
        System.out.println("      Head: " + head.getFirstName() + " " + head.getLastName());
        System.out.println("      Students:");
        for (Student student : students) {
            System.out.println("        " + student.getFirstName() + " " + student.getLastName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name) &&
                Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, students);
    }
}
