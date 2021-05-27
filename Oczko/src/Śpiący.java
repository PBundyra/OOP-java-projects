public class Śpiący extends Gracz{

    public Śpiący(String nazwa) {
        super(nazwa);
        this.czyPass = true;
    }

    @Override
    public boolean czyBierze() {
        this.czyPass = true;
        return false;
    }
}
