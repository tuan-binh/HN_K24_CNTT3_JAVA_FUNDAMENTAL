public class DemoStringBuilderAndStringBuffer {
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder();
//
//        // append
//        str.append("Khánh trắng");
//        System.out.println("Chuỗi sau khi được thêm: "+str);
//        str.append(" Thành đạt");
//        System.out.println("Chuỗi sau khi được thêm: "+str);
//        // insert
//        // Khánh trắng Thành đạt
//        str.insert(12,"Và ");
//        System.out.println("Chuỗi sau khi được thêm: "+str);
//
//        // delete
//
//        // replace
//
//        // setLength
//        str.setLength(100);
//        System.out.println("Chuỗi sau khi được thêm: "+str);


        int loop = 1000000;
        long startTime = System.currentTimeMillis();
        StringBuilder str = new StringBuilder("Long");
        for (int i = 0; i < loop; i++) {
            str.append("Basketball");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("thời gian chạy của StringBuilder = "+(endTime - startTime));

        long startTime1 = System.currentTimeMillis();
        StringBuffer str1 = new StringBuffer("Long");
        for (int i = 0; i < loop; i++) {
            str1.append("Basketball");
        }
        long endTime1 = System.currentTimeMillis();

        System.out.println("thời gian chạy của StringBuilder = "+(endTime1 - startTime1));



    }
}
