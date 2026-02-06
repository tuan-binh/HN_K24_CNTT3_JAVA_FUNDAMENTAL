package btth;

import java.util.Scanner;

public class EWallet extends PaymentMethod implements Payable{
    private String phoneNumber;
    private double balance;

    public EWallet() {
    }

    public EWallet(String accountName, String paymentId, String phoneNumber, double balance) {
        super(accountName, paymentId);
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void pay(double money) {
        if(money < 0) {
            System.err.println("Số tiền thanh toán không hợp lệ");
            return;
        }
        if(balance - money < 0) {
            System.err.println("Không đủ số dư");
            return;
        }

        this.balance -= money;
        System.out.println("Thanh toán thành công");
    }

    @Override
    public void validate() {
        Scanner sc = new Scanner(System.in);
        super.setAccountName(inputName(sc));
        super.setPaymentId(String.valueOf(Math.random() * 1000000));
        this.phoneNumber = inputPhoneNumber(sc);
        this.balance = inputBalance(sc);
    }

    public double inputBalance(Scanner sc) {
    }

    public String inputPhoneNumber(Scanner sc) {
    }

    public String inputName(Scanner sc) {
        do {
            System.out.println("Nhập tên: ");
            String name = sc.nextLine();
            if (name.isBlank()) {
                System.err.println("Không được bỏ trống");
            } else {
                return name;
            }
        } while (true);
    }
}
