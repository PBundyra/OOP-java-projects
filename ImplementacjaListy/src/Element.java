public class Element<T>{
    private T val;
    private Element<T> next;

    public Element(T val) {
        this.val = val;
        this.next = null;
    }

    public T getVal(){ return val; }
    public Element<T> getNext() { return next; }

    public void setNext(Element<T> el) {
        this.next = el;
    }
}