public class Wyrazy implements Porownywacz<String> {

    public int porownaj(String a, String b) {
        return a.compareTo(b);
    }
}
