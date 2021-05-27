public class Jeden extends Stala {
    private static Jeden jeden = new Jeden();

    private Jeden(double wartosc) {
        super(1.0);
    }

    public static Jeden tworz() {
        if (jeden == null) {
            jeden = new Jeden();
        }
        return jeden;
    }
}

