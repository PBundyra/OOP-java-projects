import java.util.*;

public class Node<T> {
    Node<T> left;
    Node<T> right;
    T value;
    int priorytet;

    private int losowyPriorytet() {
        Random r = new Random();
        return r.nextInt();
    }

    public Node(T value) {
        left = null;
        right = null;
        priorytet = losowyPriorytet();
        this.value = value;
    }

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
        priorytet = losowyPriorytet();
    }

    public Node<T> dolacz(Node<T> left, Node<T> right) {
        this.left = left;
        this.right = right;
        return this;
    }

    public int getPriorytet() {
        return priorytet;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}