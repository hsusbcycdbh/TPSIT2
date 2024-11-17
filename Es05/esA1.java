public class Main {
    public static void main(String[] args) {
        // Dichiarazione dell'array di interi con dimensione 10
        int[] array = new int[10];
        
        // Inizializzazione dell'array con i numeri da 1 a 10
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // i + 1 perché vogliamo numeri da 1 a 10
        }
        
        // Stampa degli elementi dell'array su una sola riga separati da uno spazio
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
