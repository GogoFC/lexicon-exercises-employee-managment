package se.lexicon;

import se.lexicon.model.Employee;
import se.lexicon.model.SalesPerson;
import se.lexicon.model.SystemDeveloper;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        SystemDeveloper goran = new SystemDeveloper("Goran", LocalDate.now());

        System.out.println(goran.getDateHired());
        System.out.println(goran.getSalary());

        SalesPerson amra = new SalesPerson("Amra", LocalDate.of(2023,5,12));
        amra.setAcquiredClients("John");
        amra.setAcquiredClients("George");
        //amra.removeClient("John");

        System.out.println(amra.getAcquiredClients());

        System.out.println(amra.getSalary());
        System.out.println(amra.getBonus());

        //Employee amra2 = new Employee("Amra",LocalDate.now());
        //System.out.println(amra2.getSalary());
        
    }
}