package btth;

public class Patient extends Person implements Comparable<Patient>{

    private String phone;

    public Patient() {
    }

    public Patient(String id, String name, int age, String phone) {
        super(id, name, age);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void displayInfo() {
        System.out.println(super.getId() + " - " + super.getName() + " - " + super.getAge() + " - " + this.phone);
    }

    @Override
    public int compareTo(Patient o) {
        return super.getName().compareToIgnoreCase(o.getName());
    }
}


