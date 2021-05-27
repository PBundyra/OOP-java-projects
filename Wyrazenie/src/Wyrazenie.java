public abstract class Wyrazenie { //Zrobione
    public abstract double oblicz(double a);

    public abstract Wyrazenie pochodna();

    private static double policzPole(
            double dlPodstawy1,
            double dlPodstawy2,
            double dlBoku) {
        return (dlPodstawy1 + dlPodstawy2) * dlBoku / 2;
    }

    public double calka(double a, double b, int n) {
        double p = a;
        double bok = (b - a) / n;
        double wynik = 0;

        for (int i = 0; i < n; i++) {
            wynik += policzPole(oblicz(p), oblicz(p + bok), bok);
            p += bok;
        }

        return wynik;
    }

    @Override
    public abstract String toString();

}