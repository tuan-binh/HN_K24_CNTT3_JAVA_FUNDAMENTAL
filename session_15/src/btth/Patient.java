package btth;

import java.util.Scanner;
import java.util.Stack;

public class Patient extends Person {

    private String medicalCondition;
    private Stack<String> histories;

    public Patient() {
    }

    public Patient(int id, String fullName, int age, String medicalCondition) {
        super(id, fullName, age);
        this.medicalCondition = medicalCondition;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public void inputData(Scanner sc) {
        System.out.println("Nhập id: ");
        super.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập fullName: ");
        super.setFullName(sc.nextLine());
        System.out.println("Nhập age: ");
        super.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập medicalCondition: ");
        this.medicalCondition = sc.nextLine();
    }

    @Override
    public void showInfo() {
        System.out.printf("[ ID: %d | Name: %s | Age: %d | Medical Condition: %s ]", super.getId(), super.getFullName(), super.getAge(), this.medicalCondition);
        System.out.println("-----------------------------------------------------------------------");
        for (String s : histories) {
            System.out.println(s);
        }
    }
}
