public class DrzewoBST<T> {
    private Node<T> root;
    private Porownywacz<T> por;

    public DrzewoBST(Porownywacz<T> por) {
        this.por = por;
    }

    Node<T> zlacz(Node<T> a, Node<T> b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.getPriorytet() < b.getPriorytet())
            return a.dolacz(a.left, zlacz(a.right, b));
        return b.dolacz(zlacz(a, b.left), b.right);
    }

    // w lewym wszystkie mniejsze rowne
    Pair<Node<T>, Node<T>> dziel(Node<T> n, T val, boolean equal_in_left) {
        if (n == null)
            return new Pair<>(null, null);
        if ((equal_in_left && por.porownaj(val, n.value) < 0)
                || (!equal_in_left && por.porownaj(val, n.value) <= 0)){
            Pair<Node<T>, Node<T>> s = dziel(n.left, val, equal_in_left);
            return new Pair<>(s.getKey(), n.dolacz(s.getValue(), n.right));
        }
        Pair<Node<T>, Node<T>> s = dziel(n.right, val, equal_in_left);
        return new Pair<>(n.dolacz(n.left, s.getKey()), s.getValue());
    }

    public void wstaw (T el){
        if (contains(el))
            return ;

        Pair<Node<T>, Node<T>> s = dziel(root, el, true);
        root = zlacz(zlacz(s.getKey(), new Node(el)), s.getValue());}


    public void usun(T el) {
        if (!contains(el))
            return ;

        Pair<Node<T>, Node<T>> s = dziel(root, el, true);
        Pair<Node<T>, Node<T>> s2 = dziel(s.getKey(), el, false);
        root = zlacz(s2.getKey(), s.getValue());
    }


    private int glebokosc(Node<T> n) {
        if(n == null)
            return 0;
        return 1 + Integer.max(glebokosc(n.left), glebokosc(n.right));
    }

    public int glebokosc() {
        return glebokosc(root);
    }

    private boolean containElement(Node<T> root, T el) {
        if(root == null)
            return false;

        if (root.value == el)
            return true;

        if (por.porownaj(root.value,el) > 0)
            return containElement(root.left, el);

        return containElement(root.right, el);
    }

    public boolean contains(T el) {
        return containElement(root, el);
    }

    @Override
    public String toString() { return toString(root); }

    private String toString(Node<T> root)
    {
        String result = "";

        if(root == null)
        {
            result = "empty";
        }
        else
        {
            result = result + root.value;

            if(root.left != null || root.right != null)
            {
                result = "(" + result + ", " + toString(root.left);
                result = result + ", " 	+ toString(root.right) + ")";
            }
        }

        return result;
    }
}
