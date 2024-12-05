import java.util.Random;

public class esa1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Errore: Devi fornire due argomenti.");
            return;
        }

        int[] vet1 = new int[10];
        Random rand = new Random();
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = rand.nextInt(21);
        }

        System.out.print("Array iniziale: ");
        for (int num : vet1) {
            System.out.print(num + " ");
        }
        System.out.println();

        String secondArg = args[1];
        int value;

        if (!secondArg.matches("-?\\d+")) {
            System.out.println("Errore: Il secondo argomento deve essere un numero intero.");
            return;
        }

        value = Integer.parseInt(secondArg);

        if (args[0].equals("-a")) {
            for (int i = 0; i < vet1.length; i++) {
                vet1[i] += value;
            }
            System.out.print("Array dopo somma: ");
        } else if (args[0].equals("-m")) {
            for (int i = 0; i < vet1.length; i++) {
                vet1[i] *= value;
            }
            System.out.print("Array dopo moltiplicazione: ");
        } else {
            System.out.println("Errore: Il primo argomento deve essere '-a' o '-m'.");
            return;
        }

        for (int num : vet1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
