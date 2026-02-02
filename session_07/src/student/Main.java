package student;

public class Main {
    public static void main(String[] args) {
        Person nguyentienthanh = new Person("Nguyễn Tiến Thành", true, false, true);
        Person dothaominh = new Person("Đỗ Thảo Minh",false,true,true);
        Person hoangthienson = new Person("Hoàng Thiên Sơn",true, true, true);

        System.out.println(nguyentienthanh);
        System.out.println(dothaominh);
        System.out.println(hoangthienson);

        Person.CLASS_NAME = "HN-KS24-CNTT4";

        System.out.println(nguyentienthanh);
        System.out.println(dothaominh);
        System.out.println(hoangthienson);

        Person.thienNguyenDongAm();



    }
}