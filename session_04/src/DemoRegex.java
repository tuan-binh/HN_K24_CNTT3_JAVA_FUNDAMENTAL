import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{3,5}");
//        String str = "Khanh1";
//        Matcher matcher = pattern.matcher(str);
//        boolean result = matcher.matches();
//        System.out.println(result);
        // Hãy viết regex email
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+@rikkeieducation+\\.[a-zA-Z]{2,4}");
        String email = "long8ngon@rikkeieducation.com";
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        System.out.println(result);

        String str = "Hello".substring(1, 3);
        System.out.println(str);

    }
}
