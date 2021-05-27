public class Gra {
    private Gracz[] gracze;
    private int doIluPunktów;
    private Talia talia = new Talia();
    private int pozostaleKarty;

    public Gra(Gracz[] gracze, int doIluPunktów) {
        this.gracze = gracze;
        this.doIluPunktów = doIluPunktów;
    }

    public void rozegrajGre() {
        while (true) {
            this.rozegrajRozdanie();
            for (int i = 0; i < gracze.length; i++) {

                if (gracze[i].getLiczbaPunktów() == this.doIluPunktów) {
                    System.out.println("WYGRANA GRY:");
                    for (int j = i; j < gracze.length; j++) {
                        if (gracze[j].getLiczbaPunktów() == this.doIluPunktów) {
                            System.out.print("GRACZ "+ gracze[j].getNazwa() + " ");
                        }
                    }
                    return;
                }
            }
        }
    }

    private void dajZwycięzcęRozdania() {
        int maxWynik = 0;
        for (Gracz gracz : gracze) {
            if (gracz.getLiczbaOczek() < 22 && gracz.getLiczbaOczek() > maxWynik) {
                maxWynik = gracz.getLiczbaOczek();
            }
        }

        for (Gracz gracz : gracze) {
            if (gracz.getLiczbaOczek() == maxWynik) {
                System.out.print("("+gracz.getClass().getName()+") "+gracz.getNazwa() + " ");
                gracz.dodajPunkt();
            }
        }
    }

    private void resetujGraczy() {
        for (Gracz gracz : gracze) {
            gracz.resetuj();
        }
    }

    private void wypiszRozdanie() {
        for (Gracz gracz : gracze) {
            gracz.wypiszRozdanie();
        }

        System.out.print("Wygrana rozdania: ");
        this.dajZwycięzcęRozdania();
    }

    private void rozegrajRozdanie() {
        this.pozostaleKarty = 52;
        this.talia.tasuj();
        boolean czyGracDalej = true;

        for (Gracz gracz : gracze) {
            assert this.pozostaleKarty != 0 : "Zbyt mało kart";
            gracz.weźKartę(this.talia);
            this.pozostaleKarty--;
        }

        while (czyGracDalej) {
            for (Gracz gracz : gracze) {
                if (!gracz.czyPass() && gracz.czyBierze()) {
                    assert this.pozostaleKarty != 0 : "Zbyt mało kart";
                    gracz.weźKartę(this.talia);
                    this.pozostaleKarty--;

                }
            }

            czyGracDalej = false;
            for (Gracz gracz : gracze) {
                if (!gracz.czyPass()) czyGracDalej = true;
            }
        }

        this.wypiszRozdanie();
        System.out.println();
        System.out.println();
        this.resetujGraczy();
    }
}
