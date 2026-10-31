public class Hexagono extends Figura {
    private int lado;

    public Hexagono(String tipo, int lado) {
        super(tipo);
        this.setLado(lado);
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    @Override 
    public double area() {
        return (3 * Math.sqrt(3) / 2) * Math.pow(this.lado, 2);
    }
}

abstract class Figura {
    private final String tipo;

    protected Figura(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract double area();
}
