package ch.bbw.sru.cluedo.dataModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataService {

    private List<Person> personList = new ArrayList<>(
            Arrays.asList(
                new Person("Scarlett", "Miss", 23, "Blonde", "Red"),
                new Person("White", "Mrs", 88, "White", "White"),
                new Person("Green","Reverend", 91, "White", "Green"),
                new Person("Mustard", "Colonel", 65, "Brown", "Yellow"),
                new Person("Plum", "Professor", 75, "Grey", "Purple"),
                new Person("Peacock", "Mrs", 83, "White", "Blue")
            )
    );

    public List<Person> getPersons() {
        return personList;
    }
}
