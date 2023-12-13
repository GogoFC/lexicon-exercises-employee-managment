package se.lexicon.model;

import se.lexicon.model.Employee;

import java.time.LocalDate;
import java.util.ArrayList;

public class SalesPerson extends Employee {

    private String[] clients;

    private ArrayList<String> acquiredClients;

    private double bonus;



    public SalesPerson(String name, LocalDate dateHired) {
        super(name, dateHired);
        this.acquiredClients = new ArrayList<>();
    }

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }
/*
    public String getAcquiredClients() {
        return acquiredClients.toString();
    }

 */

    public ArrayList<String> getAcquiredClients() {
        return acquiredClients;
    }

    /*
    public void setAcquiredClients(ArrayList<String> acquiredClients) {
        this.acquiredClients = acquiredClients;
    }

     */


    public void setAcquiredClients(String acquiredClients) {
        this.acquiredClients.add(acquiredClients);
    }

    public void removeClient(String  removeClient) {
        this.acquiredClients.remove(removeClient);

    }

    public double getBonus() {
        this.bonus = getAcquiredClients().size() * 1000;
        return bonus;
    }

    public void setBonus() {
        //this.bonus = getAcquiredClients().size() * 1000;

        }


}