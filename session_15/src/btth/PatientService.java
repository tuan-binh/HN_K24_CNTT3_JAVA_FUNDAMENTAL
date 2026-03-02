package btth;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PatientService implements IManagement {

    Scanner sc = new Scanner(System.in);
    Queue<Patient> patients = new PriorityQueue<>(Comparator.comparing(Patient::getFullName));

    @Override
    public void add() {
        /**
         * 1. cho người dùng lựa chọn bệnh nhân nào
         * 2. nhập thông tin của loại bệnh bệnh đó
         * 3. thêm vào
         * */
        System.out.println("""
                1. Thêm bệnh nhân khám
                2. Thêm bệnh nhân cấp cứu
                Lựa chọn thêm mới:
                """);
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                Patient patient = new Patient();
                patient.inputData(sc);
                patients.offer(patient);
                break;
            case 2:
                EmergencyPatient emergencyPatient = new EmergencyPatient();
                emergencyPatient.inputData(sc);
                patients.offer(emergencyPatient);
                break;
            default:
                System.err.println("Vui lòng lựa chọn đúng!!!");
        }
    }

    @Override
    public void display() {

    }

    @Override
    public void search() {

    }

    @Override
    public void sort() {

    }
}
