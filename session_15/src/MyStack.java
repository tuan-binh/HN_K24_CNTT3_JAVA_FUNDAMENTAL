import java.util.Arrays;

public class MyStack<T> {
    private Object[] stackArray;
    private int top;
    private int capacity;

    public MyStack(int size) {
        capacity = size;
        top = -1;
        stackArray = new Object[capacity];
    }

    public void push(T element) {
        if(top == capacity - 1) {
            System.err.println("Stack đầy");
            return;
        }
        stackArray[++top] = element;
    }

    public T pop() {
        if(isEmpty()) {
            System.err.println("Stack rỗng");
            return null;
        }
        return (T) stackArray[top--];
    };

    public T peek() {
        if(isEmpty()) {
            System.err.println("Stack rỗng");
            return null;
        }
        return (T) stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[ ");
        for (int i = 0; i <= top; i++) {
            str.append(stackArray[i]);
            if(i != top) {
                str.append(", ");
            }
        }
        str.append(" ]");
        return str.toString();
    }

}
