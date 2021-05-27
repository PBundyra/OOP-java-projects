public class Centrala {
    private Wojewodztwo[] wojewodztwa;
    private int liczbaZaszczepionych;

    public Centrala(Wojewodztwo[] wojewodztwa) {
        this.wojewodztwa = wojewodztwa;
        this.liczbaZaszczepionych = 0;
    }

    public void wskazPunkt(Pacjent pacjent) {
        int[] kodPacjenta = pacjent.getKodPocztowy();
        int woj = kodPacjenta[0];
        pacjent.setPunktSzczepien(wojewodztwa[woj].dajPunkt(pacjent));
        }

    public void zwiekszLiczbeZaszczepionych(){
        this.liczbaZaszczepionych++;
    }

    public int dokonajEwidencji() {
        return this.liczbaZaszczepionych;
    }
}