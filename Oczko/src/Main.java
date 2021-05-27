public class Main {
    public static void main(String[] args) {
        Gracz[] gracze = new Gracz[28];

        /*
         * W celu sprawdzenia programu, można usunąć linie z inicjalizacją gracza B4.
         * Kopiowanie owego gracza służyło do wytestowania assertów.
         */

        gracze[0] = new Krupier("A");
        gracze[1] = new Limitowy( "B1",13);
        gracze[2] = new Limitowy( "B2",14);
        gracze[3] = new Limitowy( "B3",15);
        gracze[4] = new Limitowy( "B4",16);
        gracze[5] = new Limitowy( "B4",16);
        gracze[6] = new Limitowy( "B4",16);
        gracze[7] = new Limitowy( "B4",16);
        gracze[8] = new Limitowy( "B4",16);
        gracze[9] = new Limitowy( "B4",16);
        gracze[10] = new Limitowy( "B4",16);
        gracze[11] = new Limitowy( "B4",16);
        gracze[12] = new Limitowy( "B4",16);
        gracze[13] = new Limitowy( "B4",16);
        gracze[14] = new Losowy("C");
        gracze[15] = new Ostrożny("D");
        gracze[16] = new Śpiący("E");
        gracze[17] = new Limitowy( "B4",16);
        gracze[18] = new Limitowy( "B4",16);
        gracze[19] = new Limitowy( "B4",16);
        gracze[20] = new Limitowy( "B4",16);
        gracze[21] = new Limitowy( "B4",16);
        gracze[22] = new Limitowy( "B4",16);
        gracze[23] = new Limitowy( "B4",16);
        gracze[24] = new Limitowy( "B4",16);
        gracze[25] = new Limitowy( "B4",16);
        gracze[26] = new Limitowy( "B4",16);
        gracze[27] = new Limitowy( "B4",16);



        Gra test = new Gra(gracze, 100);
        test.rozegrajGre();
    }
}
