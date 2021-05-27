public class Pacjent {
    private int[] kodPocztowy;
    private Szczepionka szczepionka;
    private int maxOdleglosc;
    private PunktSzczepien punktSzczepien;
    private int dzienZaszczepienia;

    public Pacjent(int[] kodPocztowy, Szczepionka szczepionka, int maxOdleglosc, int dzienZaszczepienia) {
        this.kodPocztowy = kodPocztowy;
        this.szczepionka = szczepionka;
        this.maxOdleglosc = maxOdleglosc;
        this.dzienZaszczepienia = 0;
    }

    public int[] getKodPocztowy() {
        return kodPocztowy;
    }

    public String getNazwaSzczepionki() {
        return this.szczepionka.getNazwa();
    }

    public int getMaxOdleglosc() {
        return maxOdleglosc;
    }

    public void setPunktSzczepien(PunktSzczepien punktSzczepien) {
        this.punktSzczepien = punktSzczepien;
    }

    public void setDzienZaszczepienia(int dzienZaszczepienia) {
        this.dzienZaszczepienia = dzienZaszczepienia;
    }

    public void dostanPunkt(Centrala centrala){
        centrala.wskazPunkt(this);
    }

    public void umowSie(){
        if (this.dzienZaszczepienia != 0){
            this.punktSzczepien.umowPacjenta(this.dzienZaszczepienia);
        }
    }
}
