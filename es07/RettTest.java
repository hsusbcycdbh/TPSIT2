public class RettTest {
    private int larghezza;
    private int altezza;

    public RettTest() {
        this.larghezza = 1;
        this.altezza = 1;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        if (larghezza > 0) {
            this.larghezza = larghezza;
        } else {
            System.out.println("Errore: larghezza non valida. Impostato a 1.");
            this.larghezza = 1;
        }
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        if (altezza > 0) {
            this.altezza = altezza;
        } else {
            System.out.println("Errore: altezza non valida. Impostato a 1.");
            this.altezza = 1;
        }
    }

    public int calcolaArea() {
        return larghezza * altezza;
    }

    public static void main(String[] args) {
        RettTest rettangolo = new RettTest();
        rettangolo.setLarghezza(-5);
        rettangolo.setAltezza(3);
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
    }
}
