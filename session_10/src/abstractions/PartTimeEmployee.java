package abstractions;

public class PartTimeEmployee extends Employee {

    private int hourOfWork;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String fullName, Double hourOfMoney, int hourOfWork) {
        super(fullName, hourOfMoney);
        this.hourOfWork = hourOfWork;
    }

    public int getHourOfWork() {
        return hourOfWork;
    }

    public void setHourOfWork(int hourOfWork) {
        this.hourOfWork = hourOfWork;
    }

    @Override
    public double calSalary() {
        return hourOfWork * super.hourOfMoney;
    }
}
