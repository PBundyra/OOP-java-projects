public class Stala extends Wyrazenie{
    private double wartosc;

    public Stala(double wartosc){
        this.wartosc = wartosc;
    }

    public double oblicz(double arg){
        return wartosc;
    }

    public Wyrazenie pochodna(){
        Stala zero = new Stala(0);
        return zero;
    }

    public String toString(){
        return String.valueOf(wartosc);
    }
}