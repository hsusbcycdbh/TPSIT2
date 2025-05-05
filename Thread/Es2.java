class Contatore {
    private int valore = 0;

    public void incrementa() {
        valore++;
    }

    public int getValore() {
        return valore;
    }
}

class ThreadContatore implements Runnable {
    private final Contatore contatore;

    public ThreadContatore(Contatore contatore) {
        this.contatore = contatore;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            contatore.incrementa();
        }
    }
}

public class Es2 {
    public static void main(String[] args) {
        Contatore contatore = new Contatore();
        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new ThreadContatore(contatore));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.err.println("Thread interrotto: " + e.getMessage());
            }
        }

        System.out.println("Valore finale del contatore: " + contatore.getValore());
    }
}
