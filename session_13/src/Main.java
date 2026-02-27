import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers1 = new HashSet<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        Set<Integer> numbers2 = new HashSet<>();
        numbers2.add(9);
        numbers2.add(8);
        numbers2.add(7);
        numbers2.add(5);
        System.out.println(numbers1);
        numbers1.removeAll(numbers2);
        System.out.println(numbers1);
    }
}