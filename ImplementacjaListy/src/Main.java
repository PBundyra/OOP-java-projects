public class Main {

    public static void main(String[] args) throws Exception {

        // Proste testy - program wypisuje Exception z powodu linii 35 (celowe sprawdzenie Exceptions)
        Lista<Integer> l = new Lista();
        l.push(3);
        System.out.println(l.peek());
        l.push(2);
        System.out.println(l.peek());
        l.push(7);
        System.out.println(l.peek());
        l.push(2);
        System.out.println(l.peek());
        l.push(5);
        System.out.println(l.peek());
        System.out.println(l.get(2));
        System.out.println(l.peek());

        Lista<Integer> l2 = new Lista();
        l2.push(3);
        l2.push(2);
        l2.push(7);
        l2.push(2);
        l2.push(5);

        l.concatenate(l2);

        System.out.println(l.getSize());
        System.out.println(l.peek());
        System.out.println(l.get(6));
        l.pop();
        l.pop();
        System.out.println(l.peek());
        System.out.println(l.get(11));
    }
}
