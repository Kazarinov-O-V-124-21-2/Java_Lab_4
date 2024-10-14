package edu.dp.sau.Kazarinov.O.V.controller;

import edu.dp.sau.Kazarinov.O.V.model.Student;
import edu.dp.sau.Kazarinov.O.V.model.Sex;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String middleName, Sex sex) {
        return new Student(firstName, lastName, middleName, sex);
    }
}