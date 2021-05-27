public class PunktSzczepien {
    private int[] kodPocztowy;
    private int dziennyLimit;
    private int[] pozostalyLimit;
    private Szczepionka szczepionka;

    public PunktSzczepien(int[] kodPocztowy, int dziennyLimit, Szczepionka szczepionka) {
        this.kodPocztowy = kodPocztowy;
        this.dziennyLimit = dziennyLimit;
        this.pozostalyLimit = new int[365];
        for (int i = 0; i < pozostalyLimit.length; i++) {
            this.pozostalyLimit[i] = dziennyLimit;
        }
        this.szczepionka = szczepionka;
    }

    public void umowPacjenta(int dzien) {
        this.pozostalyLimit[dzien]--;
    }

    public void zaszczepPacjenta(Centrala centrala) {
        centrala.zwiekszLiczbeZaszczepionych();
    }

    public int[] getKodPocztowy() {
        return kodPocztowy;
    }

    public int getDziennyLimit() {
        return dziennyLimit;
    }

    public int[] getPozostalyLimit() {
        return pozostalyLimit;
    }

    public Szczepionka getSzczepionka() {
        return szczepionka;
    }

    public int pierwszyWolnyTermin() {
        for (int i = 0; i < 365; i++) {
            if (pozostalyLimit[i] != 0) return i;
        }
        return 366;
    }
}

