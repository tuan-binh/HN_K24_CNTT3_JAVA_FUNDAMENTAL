import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> cntt5 = new ArrayList<>();
        cntt5.add(new Student("Hà Bích Ngọc",25,"HN-KS24-CNTT5",false));
        cntt5.add(new Student("Nguyễn Hữu Đại",20,"HN-KS24-CNTT5",true));
        cntt5.add(new Student("Hồ Khánh Linh",21,"HN-KS24-CNTT5",false));
        cntt5.add(new Student("Phạm Thái Sơn",19,"HN-KS24-CNTT5",true));
        cntt5.add(new Student("Lê Thành Tùng",23,"HN-KS24-CNTT5",true));
//        // comparable
//        for (Student s : cntt5) {
//            System.out.println(s);
//        }
//
//        Collections.sort(cntt5);
//        System.out.println("-------------------------------------");
//        for (Student s : cntt5) {
//            System.out.println(s);
//        }
        // comparator
        Comparator<Student> comparatorName = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<Student> comparatorAge = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        };


        for (Student s : cntt5) {
            System.out.println(s);
        }

        cntt5.sort(comparatorAge);

        System.out.println("-------------------------------------");
        for (Student s : cntt5) {
            System.out.println(s);
        }
    }
}