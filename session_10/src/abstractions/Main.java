package abstractions;

public class Main {
    public static void main(String[] args) {
        PartTimeEmployee employee = new PartTimeEmployee();
        employee.setFullName("Hà Quang Huy");
        employee.setHourOfMoney(100000.0);
        employee.setHourOfWork(4);
        System.out.println(employee.calSalary());


        FullTimeEmployee dothaominh = new FullTimeEmployee();
        dothaominh.setFullName("Đỗ Thảo Minh");
        dothaominh.setHourOfMoney(500000.0);
        System.out.println(dothaominh.calSalary());
    }
}
