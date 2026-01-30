package KOC;

import Template.Student;

import java.math.BigDecimal;

public class MyGirlFriend extends Student {



    String conGiap;

    public void tieuChuanBanGai(String conGiap) {
        if(conGiap != "Dog") {
            System.out.println("Gu của tôi");
        } else {
            System.err.println("Ngọn cỏ ven đường làm sao với được mây");
        }
    }

}
