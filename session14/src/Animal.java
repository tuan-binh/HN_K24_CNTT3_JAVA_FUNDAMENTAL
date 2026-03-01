//public class Animal implements Comparable<Animal> {
public class Animal {
    private String name;
    private Double weight;
    private String breed;
    private Double price;

    public Animal() {
    }

    public Animal(String name, Double weight, String breed, Double price) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[ NAME: "+this.name+" | WEIGHT: "+this.weight+" | BREED: "+this.breed+" | PRICE: "+this.price+" ]";
    }
}
