package se.lexicon.data;
import se.lexicon.model.Employee;
import se.lexicon.model.SalesPerson;


public class Payroll implements InterfacePayroll{

    private double payCheck;

    public double getPayCheck() {
        return payCheck;
    }

    public void setPayCheck(double payCheck) {
        this.payCheck = payCheck;
    }
}
