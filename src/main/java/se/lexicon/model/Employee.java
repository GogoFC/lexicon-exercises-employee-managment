package se.lexicon.model;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Employee {

    private int id;

    private String name;
    private double salary;

    private LocalDate dateHired;

    private double extraSalary;

    private SalesPerson salesPerson;

    private SystemDeveloper systemDeveloper;






    public Employee(String name, LocalDate dateHired) {
        setName(name);
        setSalary(salary);
        setDateHired(dateHired);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        SalesPerson systemDeveloper1 = new SalesPerson("Dude",LocalDate.now());
        salary = salary + systemDeveloper1.getAcquiredClients().size() * 1000;

        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary + 25000;

        //for (ArrayList<String> array : )
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }
}
