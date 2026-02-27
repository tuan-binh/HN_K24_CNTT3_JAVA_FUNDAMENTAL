package btth;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        PatientService patientService = new PatientService(); // lưu và ql bệnh nhân
        Map<String, List<MedicalRecord>> systemHospital = new HashMap<>(); // lưu và ql hồ sơ bệnh án
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("""
                    1. thêm bệnh nhân
                    2. cập nhật bệnh nhân
                    3. xoá bệnh nhân
                    4. hiển thị danh sách bệnh nhân
                    
                    5. thêm hồ sơ
                    6. xem hồ sơ
                    7. xoá hồ sơ
                    
                    8. tìm kiếm bệnh nhân
                    9. sắp xếp bệnh nhân
                    
                    0. Thoát
                    Lựa chọn chức năng:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
//                    patientService.add();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    /**
                     * 1. nhập id bệnh nhân
                     * 2. lấy value của bệnh nhân từ Map (get())
                     * 3. nhập thông tin hồ sơ bệnh án MedicalRecord
                     * 4. thực hiện add
                     * */
                    break;
                case 6:
                    /**
                     * 1. nhập id bệnh nhân
                     * 2. lấy danh sách hồ sơ của bệnh nhân bằng get
                     * 3. duyệt qua danh sách và hiển thị
                     * */
                    break;
                case 7:
                    /**
                     * 1. nhập id bệnh nhân
                     * 2. lấy danh sách hồ sơ
                     * 3. nhập id hồ sơ muốn xoá
                     * 4. thực hiện xoá
                     * */
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 0:
                    break;
                default:
            }

        } while (true);


    }
}
