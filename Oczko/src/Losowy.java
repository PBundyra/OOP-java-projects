import java.util.Random;

public class Losowy extends Gracz {

    public Losowy(String nazwa){
        super(nazwa);
    }

    @Override
    public boolean czyBierze() {
        Random r = new Random();
        int rzutMoneta = r.nextInt(2);
        if (rzutMoneta == 0){
            this.czyPass = true;
            return false;
        }
        return true;
    }
}
