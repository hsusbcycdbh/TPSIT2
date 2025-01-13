public class Rettangolo {
    private int base;
    private int altezza;

    public Rettangolo() {
        this.base = 1;
        this.altezza = 1;
    }

    public int getbase() {
        return base;
    }

    public void setbase(int base) {
        if (base > 0) {
            this.base = base;
        } else {
            this.base = 1;
            System.out.println("Errore: base non valida. Impostato a 1.");
        }
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        if (altezza > 0) {
            this.altezza = altezza;
        } else {
            this.altezza = 1;
            System.out.println("Errore: altezza non valida. Impostato a 1.");
        }
    }

    public int calcolaArea() {
        return base * altezza;
    }

    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo();
        rettangolo.setbase(-5);
        rettangolo.setAltezza(-3);
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
    }
}
