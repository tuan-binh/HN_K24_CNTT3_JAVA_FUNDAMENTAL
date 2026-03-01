import java.util.*;

public class DemoCollectionMap {
    public static void main(String[] args) {
//        Map<String, String> contactOfGirlFriend = new HashMap<>();
//        contactOfGirlFriend.put("Tuyết","0987654321");
//        contactOfGirlFriend.put("Huyền","2136129878");
//        contactOfGirlFriend.put("Thắng","1234567890");
//        contactOfGirlFriend.put("Long","0987654321");
//        contactOfGirlFriend.put("Duy","8732131231");
//        contactOfGirlFriend.put("Hưng","0987654321");
//        contactOfGirlFriend.put("Sơn","3129083921");
//        contactOfGirlFriend.put(null,"123456789");
//        System.out.println(contactOfGirlFriend);

        Map<String, String> bigFor = new HashMap<>();
        bigFor.put("Hưng", "Photographer");
        bigFor.put("Sơn","Chủ tịch HĐQT");
        bigFor.put("Nhật","Thợ điện");
        bigFor.put("Đức","Bisexual");
        System.out.println(bigFor);

        Set<String> tuDaiThienVuong = bigFor.keySet();

        System.out.println(tuDaiThienVuong);

        Collection<String> slogans = bigFor.values();
        System.out.println(slogans);

        Set<Map.Entry<String,String>> entrySet =  bigFor.entrySet();
        for (Map.Entry<String,String> e : entrySet) {
            if(e.getKey().equals("Đức")) {
                e.setValue(e.getValue() + " Done");
            }
            e.setValue(e.getValue() + " Đã thay đổi");
        }

        System.out.println(bigFor);


        /**
         * - chứa cặp Key và Value
         * - Key - không trùng lặp
         * - các lớp triển khai:
         *      - HashMap
         *      - LinkedHashMap
         *      - TreeMap
         * - phương thức:
         *      - put
         *      - get(key)
         *      - remove
         *      - containsKey
         *      - containsValue
         *      - keySet
         *      - values
         *      - entrySet
         *          - getKey
         *          - getValue
         *          - setValue
         * Bài toán: thông kế
         * */

    }
}
