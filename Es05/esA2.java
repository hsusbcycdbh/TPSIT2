public class esA2 {
    public static void main(String[] args) {
        // Creazione dell'array con i valori forniti
        int[] numeri = {15, 22, 8, 31, 42, 10, 5, 18, 35};

        // Calcolo della media degli elementi dell'array
        double somma = 0;
        for (int i = 0; i < numeri.length; i++) {
            somma += numeri[i];
        }
        double media = somma / numeri.length;

        // Trova il valore minimo e massimo nell'array
        int minimo = numeri[0];
        int massimo = numeri[0];
        
        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] < minimo) {
                minimo = numeri[i];
            }
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }
        }

        // Stampa dei risultati
        System.out.println("Media degli elementi: " + media);
        System.out.println("Valore minimo: " + minimo);
        System.out.println("Valore massimo: " + massimo);
    }
}
