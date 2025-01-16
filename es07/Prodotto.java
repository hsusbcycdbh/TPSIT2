public class Prodotto {
    private String nome;
    private double prezzo;
    private int quantità;

    public Prodotto() {
        this.nome = "Sconosciuto";
        this.prezzo = 0.0;
        this.quantità = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Errore: nome non valido.");
            this.nome = "Sconosciuto";
        }
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo > 0) {
            this.prezzo = prezzo;
        } else {
            System.out.println("Errore: prezzo deve essere maggiore di zero.");
            this.prezzo = 0.0;
        }
    }

    public int getQuantità() {
        return quantità;
    }

    public void setQuantità(int quantità) {
        if (quantità >= 0) {
            this.quantità = quantità;
        } else {
            System.out.println("Errore: la quantità non può essere negativa.");
            this.quantità = 0;
        }
    }

    public double calcolaValoreTotale() {
        return prezzo * quantità;
    }

    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto();

        prodotto.setNome("Libro");
        prodotto.setPrezzo(20.0);
        prodotto.setQuantità(5);

        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Prezzo: " + prodotto.getPrezzo());
        System.out.println("Quantità: " + prodotto.getQuantità());
        System.out.println("Valore totale: " + prodotto.calcolaValoreTotale());
    }
}
