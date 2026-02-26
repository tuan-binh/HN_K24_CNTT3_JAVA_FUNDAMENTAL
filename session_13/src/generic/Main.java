package generic;

public class Main {
    public static void main(String[] args) {
        Box<String> myBox1 = new Box<>();
        myBox1.setColor("#ffffff");

        Box<Character> characterBox = new Box<>();
        characterBox.setColor('A');
    }
}
