package btth;

public class Main {
    public static void main(String[] args) {
        Student trananhdung = new Student(1, "Trần Anh Dũng");
        Student dothaominh = new Student(2, "Đỗ Thảo Minh");
        Student hoangthienson = new Student(3, "Hoàng Thiên Sơn");
        Student haquanghuy = new Student(4, "Hà Quang Huy");

        Student.studentCount = 4;

        trananhdung.displayInfo();
        hoangthienson.displayInfo();
        haquanghuy.displayInfo();
        dothaominh.displayInfo();

        Student dangKhanhAn = new Student(5, "Đặng Khánh An");
        Student truongHaCamLinh = new Student(6, "Trương Hà Cảm Linh");

        Student.studentCount = 6;
        dangKhanhAn.displayInfo();
        truongHaCamLinh.displayInfo();

        Student.showTotalStudent();

    }
}
