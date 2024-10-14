package edu.dp.sau.Kazarinov.O.V.controller;

import edu.dp.sau.Kazarinov.O.V.model.Faculty;
import edu.dp.sau.Kazarinov.O.V.model.Human;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
}
