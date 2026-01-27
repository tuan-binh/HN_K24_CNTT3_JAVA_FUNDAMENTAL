import java.util.Scanner;


public class DemoArray {
    public static void main(String[] args) {
        /**
         * Lưu danh sách các người tham dự dám cưới của hưng
         * 100;
         * */
        int[] arr = {1, 2, 3};
        String[] visitWedding = new String[100];
        int current = 0;
        // Thêm:
        /**
         * - thêm vào đầu
         *      + từ vị 0 dịnh chuyển sang phải 1 đơn vị index
         * - thêm vào cuối
         *      + gán vào vị trí current
         * - thêm vào vị trí bất kỳ
         *      + từ vị cần chèn dịnh chuyển sang phải
         * */

        /**
         * Hưng sẽ nhập số lượng khách mời:
         *      - Nhập từng tên khách mời vào danh sách
         * */
        /**
         * Vòng lặp
         * NHập Scanner
         * */
        /**
         * B1: Nhập số lượng khách mời
         * B2: Duyệt qua số lượng:
         *      B3: Nhập tên khách mời
         *      B4: Thêm vào mảng và biến current tăng lên
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng khách mời: ");
        int people = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < people; i++) {
            System.out.println("Nhập tên khách mời: ");
            String customer = sc.nextLine();
            visitWedding[current] = customer;
            current++;
        }

        // for each hoặc for thường trong java
        printPeople(visitWedding,current);

        /**
         * XOÁ:
         *      - xoá vị trí đầu
         *      - xoá vị trí cuối
         *      - xoá vị trí bất kỳ
         * */

        System.out.println("Nhập tên khách mời muốn xoá: ");
        String nameDelete = sc.nextLine();
        // Tìm kiếm vị trí index:
        int index = -1;
        for (int i = 0; i < current; i++) {
            if (visitWedding[i].equals(nameDelete)) {
                index = i;
                break;
            }
        }
        // Thực hiện dịch chuyển sang trái
        deletePeople(visitWedding,index,current);
        current--;

        printPeople(visitWedding,current); // Arguments
    }

    public static void printPeople(String[] visit, int current){ // Parameters
        for (int i = 0; i < current; i++) {
            System.out.println(visit[i]);
        }
    }

    public static void deletePeople( String[] visit, int indexDelete, int current ) {
        for (int i = indexDelete; i < current - 1; i++) {
            visit[i] = visit[i + 1];
        }
        visit[current]= null;
    }
}

/**
 * 1. Mảng
 *      - khởi tạo vs khai báo
 *      - Thao tác:
 *          + Thêm
 *              - Đầu
 *              - Cuối
 *              - Vị trí bất kỳ
 *          + Sửa
 *          + Xoá
 *              - Đầu
 *              - Cuối
 *              - Vị trí bất kỳ
 *          + Duyệt
 *              - for thường
 *              - for each
 * 2. Phương thức:
 *      - Cú pháp:
 *      - Tham số & Đối số
 *      - Gọi phương thức
 * 3. Ký thuật làm việc với mảng
 *      - sum
 *      - count
 *      - flag
 *      - max, min
 *      - ...
 * */