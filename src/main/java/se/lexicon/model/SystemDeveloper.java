package se.lexicon.model;

import se.lexicon.model.Employee;

import java.time.LocalDate;

public class SystemDeveloper extends Employee {

    private String[] certificates;

    private String[] languages;

    public SystemDeveloper(String name, LocalDate dateHired) {
        super(name, dateHired);
    }
}
