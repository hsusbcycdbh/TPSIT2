class Libro {
    private String titolo;
    private String autore;
    private boolean disponibile;

    public Libro(String titolo, String autore, boolean disponibile) {
        this.titolo = titolo;
        this.autore = autore;
        this.disponibile = disponibile;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }
}

class Biblioteca {
    private Libro[] libri;
    private int count;

    public Biblioteca(int capacita) {
        libri = new Libro[capacita];
        count = capacita; // ERRORE: Il valore di count deve inizializzarsi a 0, non alla capacità.
    }

    public void aggiungiLibro(Libro libro) {
        if (count < libri.length) {
            libri[count] = libro;
            count++;
        } else {
            System.out.println("La biblioteca è piena, non è possibile aggiungere altri libri.");
        }
    }

    public void stampaCatalogo() {
        for (int i = 0; i < count; i++) {
            Libro libro = libri[i];
            System.out.println("Titolo: " + libro.getTitolo() + ", Autore: " + libro.getAutore() + ", Disponibile: " + (libro.isDisponibile() ? "Sì" : "No"));
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", true);
        Libro libro2 = new Libro("1984", "George Orwell", false);

        biblioteca.aggiungiLibro(libro1);
        biblioteca.aggiungiLibro(libro2);

        biblioteca.stampaCatalogo();
    }
}
