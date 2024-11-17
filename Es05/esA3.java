import java.util.Scanner;

public class esA3 {
    public static void main(String[] args) {
        String[] nomi = {"Alice", "Bob", "Carol", "David", "Eve"};
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci un nome: ");
        String nomeInserito = scanner.nextLine();
        
        boolean trovato = false;
        
        for (int i = 0; i < nomi.length; i++) {
            if (nomi[i].equalsIgnoreCase(nomeInserito)) {
                trovato = true;
                break;
            }
        }
        
        if (trovato) {
            System.out.println("Il nome " + nomeInserito + " è stato trovato nell'array.");
        } else {
            System.out.println("Il nome " + nomeInserito + " non è presente nell'array.");
        }
        
        scanner.close();
    }
}
