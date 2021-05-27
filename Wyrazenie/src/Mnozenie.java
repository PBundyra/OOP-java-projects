public class Mnozenie extends Operator{
    public Mnozenie(Wyrazenie arg1, Wyrazenie arg2) {
        super(arg1, arg2);
        this.znak = '*';
        this.lacznosc = true;
        this.priorytet = 2;
    }
    public double oblicz(double a){
        return arg1.oblicz(a) * arg2.oblicz(a);
    }
    public Wyrazenie pochodna(){}
}