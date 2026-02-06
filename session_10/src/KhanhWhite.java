public class KhanhWhite implements ISocialBlack,IPolice {

    private String behavior;

    @Override
    public void washMoney() {
        System.out.println("Tiền vào được qua ngân hàng");
    }

    @Override
    public void takeMyMoney() {
        System.out.println("Đưa hết những thứ gì đang có trên người đây");
    }

    @Override
    public void spy() {
        System.out.println("Tôi là cảnh sát phòng chống ma toé PC04");
    }

    @Override
    public void shoter() {
        System.out.println("Dơ tay lên không tôi bắn bỏ");
    }
}
