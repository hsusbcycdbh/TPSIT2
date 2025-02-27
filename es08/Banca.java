class ContoBancario {
    String titolare;
    double saldo;

    public ContoBancario(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
    }

    public void preleva(double importo) {
        if (importo <= saldo) {
            saldo -= importo;
        } else {
    System.out println("Saldo insufficiente");
    
