public class Studente {
    private String nome;
    private String cognome;
    private double mediaVoti;

    public Studente() {
        this.nome = "Sconosciuto";
        this.cognome = "Sconosciuto";
        this.mediaVoti = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Errore: nome non valido. Impostato a \"Sconosciuto\".");
            this.nome = "Sconosciuto";
        }
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        if (cognome != null && !cognome.trim().isEmpty()) {
            this.cognome = cognome;
        } else {
            System.out.println("Errore: cognome non valido. Impostato a \"Sconosciuto\".");
            this.cognome = "Sconosciuto";
        }
    }

    public double getMediaVoti() {
        return mediaVoti;
    }

    public void setMediaVoti(double mediaVoti) {
        if (mediaVoti >= 0 && mediaVoti <= 10) {
            this.mediaVoti = mediaVoti;
        } else {
            System.out.println("Errore: media voti non valida. Impostata a 0.0.");
            this.mediaVoti = 0.0;
        }
    }

    public void stampaDettagli() {
        System.out.println("Studente: " + nome + " " + cognome + ", Media Voti: " + mediaVoti);
    }

    public static void main(String[] args) {
        Studente studente = new Studente();

        studente.setNome("Samuele");        // Nome valido
        studente.setCognome("Chinaglia");   // Cognome valido
        studente.setMediaVoti(6.5);         // Media voti valida

        studente.stampaDettagli();  // Stampa i dettagli dello studente
    }
}
