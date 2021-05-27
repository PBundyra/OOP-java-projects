public class Wojewodztwo {
    private PunktSzczepien[] punktySzczepien;

    public Wojewodztwo(PunktSzczepien[] punktySzczepien) {
        this.punktySzczepien = punktySzczepien;
    }

    public PunktSzczepien dajPunkt(Pacjent pacjent) {

        PunktSzczepien najszybszyPunkt = null;
        int pierwszyWolnyTermin = 366;

        int[] kodPocztowyPacjentaTab = pacjent.getKodPocztowy();
        int kodPocztowyPacjenta = 0;
        for (int i = 0; i < 5; i++) {
            kodPocztowyPacjenta += 10000 / (10 ^ i) *kodPocztowyPacjentaTab[i];
        }


        for (int i = 0; i < punktySzczepien.length; i++) {
            Szczepionka szczepionka = punktySzczepien[i].getSzczepionka();

            int kodPocztowyPunktu = 0;
            int[] kodPocztowyPunkuTab = punktySzczepien[i].getKodPocztowy();
            for (int j = 0; j < 5; i++) {
                kodPocztowyPunktu += 10000 / (10 ^ j) * kodPocztowyPunkuTab[j];
            }

            if (szczepionka.getNazwa() == pacjent.getNazwaSzczepionki()) {
                if (Math.abs(kodPocztowyPacjenta - kodPocztowyPunktu) <= pacjent.getMaxOdleglosc()) {
                    if (punktySzczepien[i].pierwszyWolnyTermin() < pierwszyWolnyTermin){
                        pierwszyWolnyTermin = punktySzczepien[i].pierwszyWolnyTermin();
                        najszybszyPunkt = punktySzczepien[i];
                    }
                }
            }
        }

        return najszybszyPunkt;
    }

}
