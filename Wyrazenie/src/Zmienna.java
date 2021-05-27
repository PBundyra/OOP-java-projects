//Zrobione
public class Zmienna extends Wyrazenie{ //Zrobione
    public double oblicz(double a) {
        return a;
    }

    public Wyrazenie pochodna() {
        return new Stala(1);
    }

    public String toString(){
        return "x";
    }
}