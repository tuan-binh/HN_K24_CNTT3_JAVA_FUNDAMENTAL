import java.util.*;

public class DemoCollection {
    public static void main(String[] args) {
        List<String> myFood = new ArrayList<>();
        myFood.add("Bã mía (đè tem)");
        myFood.add("Thịt choá");
        myFood.add("Rau má true milk");
        myFood.add("Thịt mèo ai cập");
        myFood.add("Chí thịt boà");
        for (int i = 0; i < myFood.size(); i++) {
            System.out.println(myFood.get(i));
        }
        ;

        // cập nhật
        myFood.set(2, "Thắng cố");

        for (String a : myFood) {
            System.out.println(a);
        }

        // xoá
        myFood.remove("Bã mía (đè tem)");
        for (String a : myFood) {
            System.out.println(a);
        }


//        LINKEDLIST
        LinkedList<String> oldGirlFriend = new LinkedList<>();
        oldGirlFriend.addFirst("Trần Dần");
        oldGirlFriend.addFirst("Diệp");
        oldGirlFriend.addFirst("Trang");
        oldGirlFriend.addFirst("Linh");
        oldGirlFriend.addFirst("Duyên");
        oldGirlFriend.addFirst("Giang");
        oldGirlFriend.addFirst("Hà");
        oldGirlFriend.addFirst("Huyền");
        oldGirlFriend.addFirst("Thảo");
        oldGirlFriend.addFirst("Ngọc");
        oldGirlFriend.addFirst("Tâm");
        oldGirlFriend.addFirst("Vân");
        oldGirlFriend.addFirst("Nhung");
        oldGirlFriend.addFirst("Tú");
        oldGirlFriend.addLast("Dũng");
        oldGirlFriend.addLast("Sơn");
        oldGirlFriend.addLast("Đức");
        oldGirlFriend.addLast("Quyết");
        oldGirlFriend.addLast("Hưng");
        System.out.println(oldGirlFriend);
        System.out.println(oldGirlFriend.indexOf("Hưng"));
        /**
         *
         * add
         * set
         * remove
         * get
         * isEmpty
         * indexOf
         *
         * */

        // iterator

//        for(String e : oldGirlFriend) {
//            if(e.equals("Trần Dần")) {
//                oldGirlFriend.remove(e);
//            }
//        }

        System.out.println("Trước = " + oldGirlFriend);

//        Iterator<String> iterator = oldGirlFriend.iterator();
//        while (iterator.hasNext()) {
//            String e = iterator.next();
//            System.out.println(e);
//            if (e.equals("Trần Dần")) {
//                iterator.remove();
//            }
//        }

        ListIterator<String> listIterator = oldGirlFriend.listIterator();
        while (listIterator.hasNext()) {
            String e = listIterator.next();
            System.out.println(e);

            if(e.equals("Trần Dần")) {
                listIterator.add("Lẩu Gà Bình Thuận");
            }

        }

        String str = "Tú";


        System.out.println("Sau = " + oldGirlFriend);

    }
}
