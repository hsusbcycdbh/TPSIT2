class Saluto extends Thread {
    public Saluto(String nomeThread) {
        super(nomeThread);
    }

    public void run() {
        System.out.println("Thread che saluta.");
    }
}

class MioSaluto implements Runnable {
    public void run() {
        System.out.println("Thread eseguito tramite runnable");
    }
}

public class Preparazione {
    public static void main(String[] args) {
        new Saluto("SalutoThread").start();
        new Thread(new MioSaluto()).start();
        new Thread(() -> System.out.println("Sto usando una lamda expression")).start();
    }
}
