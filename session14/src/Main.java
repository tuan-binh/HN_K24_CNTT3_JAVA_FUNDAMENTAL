import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Chó",18.0,"Cao bằng",1200.0));
        animals.add(new Animal("Mèo",3.6,"Lạng Sơn",1300.0));
        animals.add(new Animal("Lợn",18.0,"Thái Nguyên",1400.0));
        animals.add(new Animal("Boà",72.0,"Tuyên Quang",1500.0));
        animals.add(new Animal("Chuốt",0.5,"Thanh Hoá",1100.0));

        for (Animal a : animals ) {
            System.out.println(a);
        }

        Comparator<Animal> comparatorPrice = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return Double.compare(o1.getPrice(),o2.getPrice());
            }
        };

        Comparator<Animal> comparatorBreed = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getBreed().compareTo(o2.getBreed());
            }
        };

        animals.sort(comparatorBreed);


        System.out.println("--------------------------");

        for (Animal a : animals ) {
            System.out.println(a);
        }
        // Comparator - sắp xếp

    }
}