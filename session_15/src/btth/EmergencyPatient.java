package btth;

import java.util.Scanner;

public class EmergencyPatient extends Patient {
    private int priorityLevel;

    public EmergencyPatient() {
    }

    public EmergencyPatient(int id, String fullName, int age, String medicalCondition, int priorityLevel) {
        super(id, fullName, age, medicalCondition);
        this.priorityLevel = priorityLevel;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public void inputData(Scanner sc) {
        super.inputData(sc);
        System.out.println("Nhập mức độ cần cấp cứu: ");
        this.priorityLevel = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Bệnh nhân cấp cứu");
    }
}
