package abstractions;

public abstract class Employee {

    protected String fullName;
    protected Double hourOfMoney;

    public Employee() {
    }

    public Employee(String fullName, Double hourOfMoney) {
        this.fullName = fullName;
        this.hourOfMoney = hourOfMoney;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Double getHourOfMoney() {
        return hourOfMoney;
    }

    public void setHourOfMoney(Double hourOfMoney) {
        this.hourOfMoney = hourOfMoney;
    }

    public abstract double calSalary();

}
