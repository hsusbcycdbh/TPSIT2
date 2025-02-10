import java.util.Scanner;

public class Calcolatrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci il primo numero: ");
        String input1 = scanner.nextLine();
        System.out.print("Inserisci il secondo numero: ");
        String input2 = scanner.nextLine();
        System.out.print("Inserisci l'operazione (somma, sottrazione, moltiplicazione, divisione): ");
        String operazione = scanner.nextLine();
        
        try {
            double numero1 = Double.parseDouble(input1);
            double numero2 = Double.parseDouble(input2);
            
            double risultato = 0;
            
            switch (operazione.toLowerCase()) {
                case "somma":
                    risultato = numero1 + numero2;
                    break;
                case "sottrazione":
                    risultato = numero1 - numero2;
                    break;
                case "moltiplicazione":
                    risultato = numero1 * numero2;
                    break;
                case "divisione":
                    if (numero2 == 0) {
                        throw new ArithmeticException("Errore: Divisione per zero!");
                    }
                    risultato = numero1 / numero2;
                    break;
                default:
                    System.out.println("Operazione non valida. Usa somma, sottrazione, moltiplicazione o divisione.");
                    return;
            }
            
            System.out.println("Il risultato è: " + risultato);
        
        } catch (NumberFormatException e) {
            System.out.println("Errore: Input non numerico! Assicurati di inserire solo numeri.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore imprevisto: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
