package edu.dp.sau.Kazarinov.O.V.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty {
    private String name;
    private Human head;
    private List<Department> departments;

    public Faculty(String name, Human head) {
        this.name = name;
        this.head = head;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }


    public void displayFacultyInfo() {
        System.out.println("  Faculty: " + getName());
        System.out.println("  Head: " + head.getFirstName() + " " + head.getLastName());
        System.out.println("  Departments:");
        for (Department department : departments) {
            department.displayDepartmentInfo();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(name, faculty.name) &&
                Objects.equals(head, faculty.head) &&
                Objects.equals(departments, faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, departments);
    }
}
