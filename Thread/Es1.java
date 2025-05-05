class MioThread extends Thread {
    public MioThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread creato estendendo Thread: " + getName());
    }
}

class MioRunnable implements Runnable {
    private final String nome;

    public MioRunnable(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        System.out.println("Thread avviato da Runnable: " + nome);
    }
}

public class Es1 {
    public static void main(String[] args) {
        MioThread thread1 = new MioThread("Esteso-1");
        thread1.start();

        MioRunnable mioRunnable = new MioRunnable("Runnable-1");
        Thread thread2 = new Thread(mioRunnable);
        thread2.start();

        Thread thread3 = new Thread(() -> {
            System.out.println("Thread in esecuzione con lambda");
        });
        thread3.start();
    }
}
