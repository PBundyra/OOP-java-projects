public class Szczepionka {
    private int dawka;
    private String nazwa;
    private String producent;

    public Szczepionka(int dawka, String nazwa, String producent) {
        this.dawka = dawka;
        this.nazwa = nazwa;
        this.producent = producent;
    }

    public String getNazwa() {
        return nazwa;
    }
}
