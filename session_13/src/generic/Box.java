package generic;

public class Box<T> {
    T color;

    public Box() {
    }

    public Box(T color) {
        this.color = color;
    }

    public T getColor() {
        return color;
    }

    public void setColor(T color) {
        this.color = color;
    }
}
