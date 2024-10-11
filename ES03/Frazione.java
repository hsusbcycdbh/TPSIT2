public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore) {
        if (denominatore == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero.");
        }
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public int getDenominatore() {
        return denominatore;
    }

  
    public String toString() {
        return numeratore + "/" + denominatore;
    }

   
    public Frazione sottrai(Frazione altraFrazione) {
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore
                - altraFrazione.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;

        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

   
    public Frazione moltiplica(Frazione altraFrazione) {
        int nuovoNumeratore = this.numeratore * altraFrazione.numeratore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;

        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

   
    public Frazione dividi(Frazione altraFrazione) {
        if (altraFrazione.numeratore == 0) {
            throw new IllegalArgumentException("Impossibile dividere per una frazione con numeratore zero.");
        }
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.numeratore;

        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    public static void main(String[] args) {

        Frazione f1 = new Frazione(2, 3);
        System.out.println("F1 = " + f1.toString());
    } 


}
