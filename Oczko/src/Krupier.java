public class Krupier extends Gracz{

    public Krupier(String nazwa) {
        super(nazwa);
    }

    @Override
    public boolean czyBierze() {
        if(this.liczbaOczek < 17) return true;
        this.czyPass = true;
        return false;
    }
}
