public abstract class Figura {
    private String tipo;
    public Figura(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public final void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public abstract double area();
}