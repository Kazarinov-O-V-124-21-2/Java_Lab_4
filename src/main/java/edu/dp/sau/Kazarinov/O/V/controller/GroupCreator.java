package edu.dp.sau.Kazarinov.O.V.controller;

import edu.dp.sau.Kazarinov.O.V.model.Group;
import edu.dp.sau.Kazarinov.O.V.model.Human;

public class GroupCreator {
    public Group createGroup(String name, Human head) {
        return new Group(name, head);
    }
}