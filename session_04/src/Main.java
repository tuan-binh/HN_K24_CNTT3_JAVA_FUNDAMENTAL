
public class Main {
    public static void main(String[] args) {
        String str1 = "Long Basketball";
        String str2 = "Long Basketball";
        System.out.println(str1 == str2);
        String str3 = new String("Sơn PickleBall");
        String str4 = new String("Sơn PickleBall");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println("Số lượng ký tư trong từ str3 = "+str3.length());
    }
}