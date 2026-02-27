import java.util.*;

public class DemoCollectionMap {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
//        Map<String, String> contacts = new LinkedHashMap<>();
//        Map<String, String> contacts = new TreeMap<>();
        contacts.put("Hà Bích Ngọc","0987654321");
        contacts.put("Dỗ Ngọc Dân","1234567890");
        contacts.put("Nguyễn Khắc Hưng","0998877654");
        contacts.put(null,"10938120");
        System.out.println(contacts);

//        Set<String> keys = contacts.keySet();
//        System.out.println(keys);
//
//        Collection<String> values = contacts.values();
//        System.out.println(values);

//        Set<Map.Entry<String,String>> entrySet = contacts.entrySet();
//        for (Map.Entry<String, String> e : entrySet) {
//            System.out.println(e);
//            if(e.getKey().equals("Dỗ Ngọc Dân")) {
//                e.setValue(e.getValue() + " Đã thay đổi");
//            }
//        }
//
//        System.out.println(entrySet);

    }
}
