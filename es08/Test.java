/*
Esercizio: Sistema di Forme Geometriche
Progetta un sistema di forme geometriche utilizzando l'ereditarietà. L'obiettivo è creare una gerarchia di classi che rappresentino diverse forme geometriche (ad esempio, cerchio, rettangolo, triangolo) e calcolino le loro aree e perimetri.

Requisiti
Crea una classe base Forma con i seguenti attributi e metodi:

Attributi: nome (una stringa che descrive il tipo di forma, ad esempio "Cerchio", "Rettangolo").
Metodi:
calcolaArea(): restituisce 0 (sarà sovrascritto nelle sottoclassi).
calcolaPerimetro(): restituisce 0 (sarà sovrascritto nelle sottoclassi).
descrizione(): stampa il nome della forma.
 */
 class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public double calcolaArea() {
        return 0;
    }

    public double calcolaPerimetro() {
        return 0;
    }

    public void descrizione() {
        System.out.println("Forma: " + nome);
    }
}
/* 
class Cerchio extends Forma {
    private double raggio;

    public Cerchio(double raggio) {
        super("Cerchio");
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea() {
        return 3.14* raggio * raggio;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * 3.14 * raggio;
    }
}

class Rettangolo extends Forma {
    private double lunghezza;
    private double larghezza;

    public Rettangolo(double lunghezza, double larghezza) {
        super("Rettangolo");
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    @Override
    public double calcolaArea() {
        return lunghezza * larghezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (lunghezza + larghezza);
    }
}
*/
public class Test{
    public static void main(String[]args){
        Forma samuele=new Forma ("generalo");
        samuele.calcolaArea();
        samuele.calcolaPerimetro();
        samuele.descrizione();
    }
}