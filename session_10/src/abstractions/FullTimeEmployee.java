package abstractions;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee() {
    }

    @Override
    public double calSalary() {
        return 8 * super.hourOfMoney;
    }
}
