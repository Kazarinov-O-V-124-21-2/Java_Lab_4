package edu.dp.sau.Kazarinov.O.V.controller;

import edu.dp.sau.Kazarinov.O.V.model.University;
import edu.dp.sau.Kazarinov.O.V.model.Human;

public class UniversityCreator {
    public University createUniversity(String name, Human head) {
        return new University(name, head);
    }
}
