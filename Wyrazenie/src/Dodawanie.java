public class Dodawanie extends Operator{
    public Dodawanie(Wyrazenie arg1, Wyrazenie arg2) {
        super(arg1, arg2);
        this.znak = '+';
        this.lacznosc = true;
        this.priorytet = 1;
    }

    public double oblicz(double a){
        return arg1.oblicz(a) + arg2.oblicz(a);
    }

    public Wyrazenie pochodna(){
        Wyrazenie wynik = new Dodawanie(arg1.pochodna(),arg2.pochodna());
        return wynik;
    }
}