public class Dzielenie extends Operator{
    public Dzielenie(Wyrazenie arg1, Wyrazenie arg2) {
        super(arg1, arg2);
        this.znak = '/';
        this.lacznosc = false;
        this.priorytet = 2;
    }
    public double oblicz(double a){
        double mianownik = arg2.oblicz(a);
        assert(mianownik != 0);
        return arg1.oblicz(a) / arg2.oblicz(a); // KG: uwaga na dzielenie przez 0 - obsługujemy jakoś?
    }
    public Wyrazenie pochodna(){
        Wyrazenie licznik = new Odejmowanie(new Mnozenie(arg1.pochodna(), arg2), new Mnozenie(arg1, arg2.pochodna()));
        Wyrazenie mianownik = new Potegowanie(arg1, new Stala(2));
        Wyrazenie wynik = new Dzielenie(licznik, mianownik);
        return wynik;
    }
}