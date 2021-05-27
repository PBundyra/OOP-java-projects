public abstract class Gracz {
    protected String nazwa;
    protected int liczbaOczek;
    protected int liczbaPunktów;
    protected boolean czyPass;
    protected Karta[] karty;
    protected int indKarty;

    public Gracz(String nazwa) {
        this.nazwa = nazwa;
        this.liczbaOczek = 0;
        this.liczbaPunktów = 0;
        this.czyPass = false;
        this.karty = new Karta[9];
        this.indKarty = 0;
    }

    public abstract boolean czyBierze();

    public void weźKartę(Talia talia){
        karty[indKarty] = talia.dajKarte();
        this.liczbaOczek += karty[this.indKarty++].getWartość();
        if (this.liczbaOczek > 21) this.czyPass = true;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getLiczbaOczek() {
        return liczbaOczek;
    }

    public int getLiczbaPunktów() {
        return liczbaPunktów;
    }

    public boolean czyPass() {
        return czyPass;
    }

    public void dodajPunkt(){
        this.liczbaPunktów++;
    }

    public void resetuj(){
        this.czyPass = false;
        this.liczbaOczek = 0;
        this.indKarty = 0;
    }

    public void wypiszRozdanie(){
        System.out.print("Gracz " +this.nazwa + " ("  +"): ");
        for (int i = 0; i < indKarty - 1; i++) {
            System.out.print(karty[i].getNazwa() + ", ");
        }
        System.out.println(karty[indKarty - 1].getNazwa() + " - SUMA: " + this.liczbaOczek);
    }
}
