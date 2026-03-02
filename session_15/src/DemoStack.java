import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DemoStack {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Stack<Integer> games = new Stack<>();
//        games.add(13);
//
//        do {
//            System.out.println("Vui lòng nhập giá trị muốn thêm: ");
//            int values = sc.nextInt();
//
//            if(games.peek() - 1 == values) {
//                games.push(values);
//            } else {
//                System.err.println("không hợp lệ");
//            }
//        } while (true);

        MyStack<String> bestStudent = new MyStack<>(5);
        bestStudent.push("Nguyễn Văn A");
        bestStudent.push("Trần Thị B");
        bestStudent.push("Hồ Khánh L");
        bestStudent.push("Hoàng Thiên S");
        bestStudent.push("Nguyễn Minh D");
        System.out.println(bestStudent);

    }
}