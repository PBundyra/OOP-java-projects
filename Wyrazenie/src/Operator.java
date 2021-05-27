public abstract class Operator extends Wyrazenie{//zrobione
    protected Wyrazenie arg1;
    protected Wyrazenie arg2;
    protected char znak;
    protected int priorytet;
    protected boolean lacznosc;

    public Operator(Wyrazenie arg1, Wyrazenie arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Override
    public String toString() {
        return arg1.toString() + znak + arg2.toString();
    }
}