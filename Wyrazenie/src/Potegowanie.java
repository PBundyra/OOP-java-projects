public class Potegowanie extends Operator{
    public Potegowanie(Wyrazenie arg1, Wyrazenie arg2) {
        super(arg1, arg2);
        this.znak = '^';
        this.lacznosc = false;
        this.priorytet = 3;
    }
    public double oblicz(double a){
        return  a;
    }
    public Wyrazenie pochodna(){
        Wyrazenie zwroc = new Wyrazenie()
    }
}