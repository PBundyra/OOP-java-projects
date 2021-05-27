public class Karta {
    private int wartość;
    private String nazwa;

    public Karta(int wartość, String nazwa){
        this.nazwa = nazwa;
        this.wartość = wartość;
    }

    public int getWartość() {
        return wartość;
    }

    public String getNazwa() {
        return nazwa;
    }
}
