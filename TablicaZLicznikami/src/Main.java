public class Main {

    public static void main(String[] args) {
        Tablica<Integer> tablicaIntow = new Tablica(10);
        for (int i = 0; i < tablicaIntow.dajRozmiar(); i++) {
            tablicaIntow.ustaw(i, tablicaIntow.dajRozmiar() - i);
            tablicaIntow.sortuj(new Int());
        }

        System.out.println(tablicaIntow);
    }
}
