package btth;

public class Student {
    // thuộc tính:
    private int id;
    private String name;

    public static final String SCHOOL_NAME = "Posts And Telecommunications Institute of Technology";
    public static int studentCount = 0;

    // Phương thức
    // - Constructor

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // - Getter / Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }

    // phương thức in nội dung ra
    public void displayInfo() {
        // --------------------------------
        // ID: 1
        // Name: Đỗ Thảo Minh Tập Trung Vào
        // School Name: ABC University
        // Student Count: 25
        // --------------------------------
        System.out.println("--------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("School Name: " + SCHOOL_NAME);
        System.out.println("Student Count: " + studentCount);
        System.out.println("--------------------------------");
    }

    // Phương thức hiển thị ra tổng số lượng sinh viên
    public static void showTotalStudent() {
        System.out.println("Tổng số lượng sinh viên: " + studentCount);
    }
}
