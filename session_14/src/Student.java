public class Student  {
    private String name;
    private int age;
    private String className;
    private Boolean gender;

    public Student() {
    }

    public Student(String name, int age, String className, Boolean gender) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "[ Name: " + this.name + " | Age: " + this.age + " | ClassName: " + this.className + " | Gender: " + (this.gender ? "Nam" : "Nữ") + "]";
    }
}
