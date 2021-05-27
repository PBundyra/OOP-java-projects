public class Main {
    public static void main(String[] args) {

        // Proste testy
        DrzewoBST<Integer> tree = new DrzewoBST<>(new Int());

        // Duze drzewo
        for (int i = 0; i < 300000; i++) {
            tree.wstaw(i);
        }

        System.out.println(tree.glebokosc());

        // Wstawianie
        DrzewoBST<Integer> tree2 = new DrzewoBST<>(new Int());
        for (int i = 1; i <= 10; i++) {
            tree2.wstaw(i);
        }
        // Wypisywanie (prefix)
        System.out.println(tree2);

        //Usuwanie
        tree2.usun(5);
        tree2.usun(6);
        tree2.usun(7);
        System.out.println(tree2);
    }
}
