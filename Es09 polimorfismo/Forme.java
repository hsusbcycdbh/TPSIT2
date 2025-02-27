abstract class Forma {
    public abstract double calcolaArea();
}

class Cerchio extends Forma {
    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }
}

class Rettangolo extends Forma {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}

public class Forme {
    public static void main(String[] args) {
        Forma[] forme = {new Cerchio(7), new Rettangolo(6, 8)};
        
        for (Forma forma : forme) {
            System.out.println("Area: " + String.format("%.1f", forma.calcolaArea()));
        }
    }
}
