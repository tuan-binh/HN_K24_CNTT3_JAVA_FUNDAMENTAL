import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoCollectionSet {
    public static void main(String[] args) {
//        Set<String> triangleGold = new HashSet<>();
//        Set<String> triangleGold = new LinkedHashSet<>();
        Set<String> dsSinhVienDuDieuKienThi = new TreeSet<>();
        dsSinhVienDuDieuKienThi.add("Trịnh Khắc Hưng");
        dsSinhVienDuDieuKienThi.add("Bàng Trọng Tú");
        dsSinhVienDuDieuKienThi.add("Hoàng Thiên Sơn");
//        System.out.println("HashSet = " + triangleGold);
//        System.out.println("LinkedHashSet = " + triangleGold);
        System.out.println("dsSinhVienDuDieuKienThi = " + dsSinhVienDuDieuKienThi);

        Set<String> passOfExam = new TreeSet<>();
        passOfExam.add("Trịnh Khắc Hưng");
        passOfExam.add("Bàng Trọng Tú");
        passOfExam.add("Hoàng Nguyên Đức");

        dsSinhVienDuDieuKienThi.removeAll(passOfExam);
        System.out.println(dsSinhVienDuDieuKienThi);

        /**
         * - không trùng lặp
         * - ko có chỉ số
         * - phương thức:
         *      - add
         *      - remove
         *      - clear
         *      - contains
         *      - isEmpty
         *      - size
         *      - addAll
         *      - retainAll
         *      - removeAll
         * */
    }
}
