import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoThucHanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // YÊU CẦU 1:
        /**
         * 	B1: Nhập id , ISBN, NXB (Nhập mỗi cái riêng biệt, từng cái một)
         * 	B2: Khởi tạo Pattern
         * 	B3: Sử dụng Matcher để kiểm tra id
         * 	B4: sử dụng do…while nếu sai thì phải nhập lại
         * */

        System.out.println("Nhập id của cuốn sách: ");
        String id;
        do {
            id = sc.nextLine();
            Pattern pattern = Pattern.compile("LIB-[0-9]{4}-S");
            boolean result = pattern.matcher(id).matches();
            if(result) {
                System.out.println("Id hợp lệ");
                break;
            } else {
                System.err.println("Sai định dạng, Vui lòng nhập lại");
            }
        } while (true);

        System.out.println("Nhập mã ISBN: ");
        String ISBN;
        do {
            ISBN = sc.nextLine();
            boolean result = Pattern.compile("[0-9]{10}").matcher(ISBN).matches();
            if(result){
                System.out.println("ISBN hợp lệ");
                break;
            }else {
                System.err.println("Sai định dạng, Vui lòng nhập lại");
            }

        } while (true);

        System.out.println("Nhập năm xuất bản:");
        int NXB;
        do {
            NXB = Integer.parseInt(sc.nextLine());
            boolean result = Pattern.compile("[0-9]{4}").matcher(String.valueOf(NXB)).matches();
            if(result){
                Date now = new Date();
                int currentYear = now.getYear() + 1900;
                System.out.println(currentYear);
                if(NXB <= currentYear){
                    System.out.println("NXB hợp lệ");
                    break;
                } else {
                    System.err.println("Năm không được lớn hơn năm hiện tại");
                }
            }else {
                System.err.println("Vui lòng nhập đúng định dạng: ");
            }
        }while (true);

        System.out.println(id);
        System.out.println(ISBN);
        System.out.println(NXB);

    }
}
