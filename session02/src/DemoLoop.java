import java.util.Scanner;

public class DemoLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Quy trình học ở nhà: (In nội dung ra trong 1 tuần)
         * - Làm bài tập về nhà
         * - Chuẩn bị bài
         * - Code theo mẫu
         * */

// =========== DEMO FOR ===============
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Ngày thứ "+(i+1)+": ");
//            System.out.println("Làm bài tập về nhà: Đang làm....");
//            System.out.println("Chuẩn bị bài: Đang đợi...");
//            System.out.println("Code theo mẫu: Đang đợi...");
//            System.out.println("------------------------------------------");
//        }

// =========== DEMO WHILE OR DO WHILE ===============
        // Có chàng trai viết lên cây: Lời xin lỗi -> cô gái tha lỗi thì thôi
//        String answer = "Anh đang nghĩ cái gì vậy";
//        // equals so sánh về giá trị của đối tượng (object)
//        while (!answer.equals("Tha lỗi")) {
//            System.out.println("Lời xin lỗi của một dân chơi");
//            System.out.println("Nhập nội dung muốn nói: ");
//            answer = sc.nextLine();
//        }

        // DO ... WHILE --> sử dụng cần kiểm tra
        // Yêu cầu: Nhập số âm thông báo lỗi và nhập lại | in ra thông tin vừa nhập
        int number = -1;
        do {
            number = sc.nextInt();
            if(number > 0) {
                System.out.println("Số vừa nhập là "+number);
            } else {
                System.err.println("Vui lòng nhập số lớn hơn 0");
            }
        } while (number <= 0);

    }
}
