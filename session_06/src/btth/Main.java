package btth;

public class Main {
    public static void main(String[] args) {
        // khởi tạo 2 đối tượng
        BankAccount firstAccount = new BankAccount("1111111111111","Đoàn Việt Anh",500000);
        BankAccount secondAccount = new BankAccount("999999999999","Bàng Trọng Tú",300000);
        // In tài khoản trước và sau khi nạp tiền
        System.out.println("Trước khi nạp: ");
        firstAccount.display();
        firstAccount.deposit(500000);
        System.out.println("Sau khi nạp tiền");
        firstAccount.display();
    }
}
