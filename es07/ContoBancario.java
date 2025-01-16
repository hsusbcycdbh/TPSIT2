public class ContoBancario {
    private double saldo;

    public ContoBancario() {
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Errore: saldo non può essere negativo.");
        }
    }

    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Deposito: " + importo);
        } else {
            System.out.println("Errore: l'importo del deposito deve essere positivo.");
        }
    }

    public void preleva(double importo) {
        if (importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelievo: " + importo);
        } else {
            System.out.println("Errore: saldo insufficiente per prelievo.");
        }
    }

    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario();

        System.out.println("Saldo iniziale: " + conto.getSaldo());

        conto.deposita(100.0);
        conto.preleva(50.0);
        System.out.println("Saldo finale: " + conto.getSaldo());
    }
}
