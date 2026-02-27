import java.util.*;

public class DemoCollectionSet {
    public static void main(String[] args) {
//        Set<String> female = new HashSet<>();
//        Set<String> female = new TreeSet<>();
//        female.add("Hà Bích Ngọc");
//        female.add("Hồ Khánh Linh");
//        female.add("Trần Thị Khánh Huyền");
//        female.add("Nguyễn Hữu Đại");
//        for (String s : female) {
//            System.out.println(s);
//        }
//        System.out.println(female);

        // xoá trong quá trình duyệt danh sách
//        for (String s : female) {
//            if(s.equals("Nguyễn Hữu Đại")) {
//                female.remove(s);
//            }
//        }

        // iterator
//        Iterator<String> iterator = female.iterator();
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            if(s.equals("Nguyễn Hữu Đại")) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(female);

        Set<Integer> number1 = new HashSet<>();
        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);
        number1.add(5);
        Set<Integer> number2 = new HashSet<>();
        number2.add(4);
        number2.add(5);
        number2.add(6);
        number2.add(7);
        number2.add(8);
//        number1.addAll(number2);
//        System.out.println("addAll = " + number1);
//        number1.retainAll(number2);
//        System.out.println("retainAll = "+number1);
        number1.removeAll(number2);
        System.out.println("removeAll = "+number1);
    }
}
