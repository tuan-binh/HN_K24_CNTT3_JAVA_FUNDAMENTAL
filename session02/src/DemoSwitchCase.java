import java.util.Scanner;

public class DemoSwitchCase {
    public static void main(String[] args) {
        /**
         * gửi vé xe ở HPC (RE)
         *      - xe đạp --> 3000đ
         *      - xe máy --> 5000đ
         *      - ô tô   --> 20000đ
         *      - trực thăng --> free (cổ đông)
         * */

        // Yêu cầu --> tính tiền vé gửi
        // Giải pháp --> Switch case

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phương tiện: ");
        String vehicle = sc.nextLine();
        double priceTicket = 0;
        switch (vehicle) {
            case "xe đạp":
                priceTicket = 3000;
                break;
            case "xe máy":
                priceTicket = 5000;
                break;
            case "ô tô":
                priceTicket = 20000;
                break;
            case "trực thăng":
                priceTicket = 0;
                break;
            default:
                System.err.println("Phương tiện không phù hợp để gửi xe");
        }

        System.out.printf("Vehicle: %s - Giá: %f",vehicle,priceTicket);

    }
}
