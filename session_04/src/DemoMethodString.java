import java.util.Arrays;

public class DemoMethodString {
    public static void main(String[] args) {
        String str = "Hoàng Thiên Sơn MC Tổng kết kỳ II";
        // replace
        str = str.replace("Hoàng Thiên Sơn","Đỗ Thảo Minh");
        System.out.println(str);

        // replace all
        str = str.replaceAll("n","k");
        System.out.println("Sau khi thay thế = "+str);

        // substring
        // Đỗ Thảo Minh
//        str = str.substring(8);
        str = str.substring(8,12);
        System.out.println("Chuỗi sau khi được cắt = "+str);

        // split
        String str2 = "Có công mài sắt có ngày nên kim";
        String[] arrString = str2.split(" ");
//        for (String s:arrString){
//            System.out.println(s);
//        }

        // toCharArray
        char[] arrChar = str2.toCharArray();
        System.out.println(Arrays.toString(arrChar));
    }
}
