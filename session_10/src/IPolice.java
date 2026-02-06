public interface IPolice {

    String YOUR_NAME = "CẢNH SÁT";

    void spy();

    void shoter();

    // phương thức bình thường (default)
    default boolean takeMoneyOfHuman() {
        System.out.println("Đang thực thi nhiệm vụ hành chính của CSGT");
        return true;
    }

    // phương thức tĩnh (static)
    static boolean takeCarOfHuman() {
        System.out.println("Chở xe về đồn");
        return true;
    }
}
