import java.util.Random;

public class Talia {
    private Karta[] karty;
    private int ind = 0;

    public Talia() {
        karty = new Karta[52];
        for (int i = 0; i < 52; i++) {
            if (i % 13 < 9) {
                karty[i] = new Karta(i % 13 + 2, String.valueOf(i % 13 + 2));
            } else if (i % 13 == 12) {
                karty[i] = new Karta(11, "AS");
            } else {
                switch (i % 13) {
                    case 9:
                        karty[i] = new Karta(10,"W");
                        break;
                    case 10:
                        karty[i] = new Karta(10,"D");
                        break;
                    case 11:
                        karty[i] = new Karta(10,"K");
                        break;
                }
            }
        }
    }

    private void swap(Karta[] karty, int ind1, int ind2) {
        Karta temp = karty[ind1];
        karty[ind1] = karty[ind2];
        karty[ind2] = temp;
    }

    public void tasuj() {
        this.ind = 0;
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            swap(this.karty, r.nextInt(52), r.nextInt(52));
        }
    }

    public Karta dajKarte() {
        return this.karty[this.ind++];
    }
}
