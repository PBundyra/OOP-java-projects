import java.util.Arrays;

public class Tablica<T>{
    private T[] tablica;
    private int[] licznik;

    public Tablica (int rozmiar){
        this.tablica = (T[])new Object[rozmiar];
        this.licznik = new int[rozmiar];

        for (int i = 0; i < rozmiar; i ++){
            licznik[i] = 0;
        }
    }

    public T dajEl (int indeks){
        licznik[indeks]++;
        return tablica[indeks];
    }

    public void ustaw(int indeks, T el){
        licznik[indeks]++;
        tablica[indeks] = el;
    }

    public void sortuj(Porownywacz<T> por) {
        for (int i = 0 ; i < tablica.length; i++)
            for(int j = 0 ; j + 1 < tablica.length ; j++)
                if (por.porownaj(tablica[j], tablica[j+1]) > 0){
                    T temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                }
    }

    public int dajRozmiar(){
        return tablica.length;
    }

    @Override
    public String toString() {
        return "Tablica{" +
                "tablica=" + Arrays.toString(tablica) +
                '}';
    }
}