
class Veicolo {
    private String marca;
    private String modello;

    //costruttore
    public Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    //metodo 
    public void stampaDettagli() {
        System.out.println("Marca: " + marca + ", Modello: " + modello);
    }
}


public class Mainveicolo {

    public static void main(String[] args) {
        Veicolo vec = new Veicolo ("Skoda", "Kodiaq");
        vec.stampaDettagli();    
        Veicolo vec2 = new Veicolo ("Fiat", "panda");
        vec2.stampaDettagli();    
    }
}
