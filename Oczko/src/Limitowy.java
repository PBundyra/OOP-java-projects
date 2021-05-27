public class Limitowy extends Gracz{
    private int limit;

    public Limitowy(String nazwa, int limit){
        super(nazwa);
        this.limit = limit;
    }

    @Override
    public boolean czyBierze() {
        if (this.liczbaOczek < limit) return true;
        this.czyPass = true;
        return false;
    }
}
