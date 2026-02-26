package btth;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        PatientManager patientManager = new PatientManager();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("""
                    1. thêm mới
                    2. xoá
                    3. cập nhật
                    4. tìm kiếm
                    5. hiển thị
                    6. thoát
                    Lựa chọn của bạn: 
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Patient patient = new Patient();
                    System.out.println("Nhập vào tên: ");
                    patient.setName(sc.nextLine());
                    patientManager.add(patient);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    patientManager.display();
                    break;
                case 6:
                    break;
            }
        } while (true);

    }
}
