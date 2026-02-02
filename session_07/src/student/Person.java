package student;

public class Person {
    public static String CLASS_NAME = "HN-KS24-CNTT3";

    // Thuộc tính:
    public String fullName;
    public boolean isSleep;
    public boolean isMakeup;
    public boolean isHandsome;

    public Person() {
    }

    public Person(String fullName, boolean isSleep, boolean isMakeup, boolean isHandsome) {
        this.fullName = fullName;
        this.isSleep = isSleep;
        this.isMakeup = isMakeup;
        this.isHandsome = isHandsome;
    }

    public static void thienNguyenDongAm() {
        System.out.println("Chung tay góp sức, 1 cây chẳng làm nên non, 3 cây chụm lại lên hòn núi cao");
    }

    @Override
    public String toString() {
        return "student.Person{" +
                "fullName='" + fullName + '\'' +
                ", isSleep=" + isSleep +
                ", isMakeup=" + isMakeup +
                ", isHandsome=" + isHandsome +
                ", Class Name=" + CLASS_NAME +
                '}';
    }
}
