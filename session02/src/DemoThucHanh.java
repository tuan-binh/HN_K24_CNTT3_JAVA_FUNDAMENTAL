import java.util.Scanner;

public class DemoThucHanh {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("Nhập số lượng sách trả: ");
            int quantity = sc.nextInt();
            System.out.println("Nhập số ngày trả muộn: ");
            int lateDay = sc.nextInt();
            if(lateDay < 5) {
                sum += lateDay * quantity * 2000;
            } else {
                sum += lateDay * quantity * 5000;
            }
        }
        System.out.println("Tổng tiền phạt = "+sum);
    }
}
