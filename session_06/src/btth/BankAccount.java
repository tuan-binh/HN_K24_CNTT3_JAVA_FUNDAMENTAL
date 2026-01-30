package btth;

public class BankAccount {
    String RED = "\\033[0;31m";
    // Thuộc tính
    private String bankNumber;
    private String fullName;
    private double balance;
    // constructor
    public BankAccount() {

    }

    public BankAccount(String bankNumber, String fullName, double balance){
        this.bankNumber = bankNumber;
        this.fullName = fullName;
        this.balance = balance;
    }

    // getter / setter

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Nạp tiền
    public void deposit(double money) {
        if(money <= 0) {
            System.out.println("\u001b[31mSố tiền không hợp lệ\u001b[0m"); // Chữ đỏ
            return;
        }
        this.balance += money;
    }
    // Rút tiền
    public double withdraw(double money) {
        if(money <= 0){
            System.out.println("\u001b[31mSố tiền rút không hợp lệ\u001b[0m"); // Chữ đỏ
        } else if (this.balance - money < 0){
            System.out.println("\u001b[31mSố dư không đủ\u001b[0m"); // Chữ đỏ
        } else {
            this.balance -= money;
        }
        return this.balance;
    }
    // Hiển thị
    public void display() {
        System.out.println("----------------------------------");
        System.out.println("Số tài khoản: "+bankNumber);
        System.out.println("Tên: "+fullName);
        System.out.println("Số dư: "+balance);
        System.out.println("----------------------------------");
    }
}
