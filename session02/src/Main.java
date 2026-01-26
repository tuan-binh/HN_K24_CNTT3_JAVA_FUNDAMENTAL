import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Vé thăm quan công viên nước: 50.000 VND
         * •	nhỏ 6 - > 70%
         * •	6 -> 18 -> 50%
         * •	18 -> 60 -> 0%
         * •	Trên 60  -> free
         * */
        /**
         * Yêu cầu:
         *      - giảm giá
         * Giải pháp:
         *      - sử dụng if else if
         * Process:
         *      - nhập tuổi để tính giảm giá
         * */
        Scanner sc = new Scanner(System.in);

        // câu dẫn
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        double defaultPrice = 50000;
        if (age < 6) {
            defaultPrice = defaultPrice - (defaultPrice * 0.7);
        } else if (age < 18) {
            defaultPrice = defaultPrice * 0.5;
        } else if (age >= 60) {
            defaultPrice = defaultPrice * 0;
        }

        System.out.printf("Bạn %d và giá phải trả: %f \n",age,defaultPrice);

    }
}