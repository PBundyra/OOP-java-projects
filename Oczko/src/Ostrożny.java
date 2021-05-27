public class Ostrożny extends Gracz{

    public Ostrożny(String nazwa){
        super(nazwa);
    }

    @Override
    public boolean czyBierze() {
        if (this.liczbaOczek < 11) return true;
        this.czyPass = true;
        return false;
    }
}
