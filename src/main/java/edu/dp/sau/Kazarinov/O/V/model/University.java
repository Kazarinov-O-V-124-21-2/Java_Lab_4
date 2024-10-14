package edu.dp.sau.Kazarinov.O.V.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University {
    private String name;
    private Human head;
    private List<Faculty> faculties;

    public University(String name, Human head) {
        this.name = name;
        this.head = head;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public void displayUniversityInfo() {
        System.out.println("University: " + getName());
        System.out.println("Head: " + head.getFirstName() + " " + head.getLastName());
        System.out.println("Faculties:");
        for (Faculty faculty : faculties) {
            faculty.displayFacultyInfo();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        University university = (University) o;
        return Objects.equals(name, university.name) &&
                Objects.equals(head, university.head) &&
                Objects.equals(faculties, university.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, faculties);
    }
}
