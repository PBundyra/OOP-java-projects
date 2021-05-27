public class Lista<T> {
    private int size;
    private Element<T> last;
    private Element<T> first;

    public Lista() {
        this.size = 0;
        this.last = null;
        this.first = null;
    }

    public void push(T value) {
        Element<T> el = new Element(value);
        if (size == 0) {
            first = el;
        } else {
            last.setNext(el);
        }
        size++;
        last = el;
    }

    public T get(int ind) throws Exception {
        if(ind >= size) throw new Exception("Indeks spoza tablicy.");
        Element<T> el = first;
        for(int i = 0; i < ind; i++) {
            el = el.getNext();
        }
        return el.getVal();
    }


    private Element<T> getEl(int ind) throws Exception {
        if(ind >= size) throw new Exception("Indeks spoza tablicy.");
        Element<T> el = first;
        for(int i = 0; i < ind; i++) {
            el = el.getNext();
        }
        return el;
    }

    public T peek() {
        return last.getVal();
    }

    public void concatenate(Lista<T> l) {
        last.setNext(l.getFirst());
        size += l.getSize();
    }

    public T pop() throws Exception {
        try {
            Element<T> res = last;
            getEl(size - 2).setNext(null);
            last = getEl(size - 2);
            size--;
            return res.getVal();
        } catch (Exception e) {
            throw new Exception("Pusta Lista");
        }
    }

    public Element<T> getFirst() {
        return first;
    }

    public int getSize() { return size; }
}