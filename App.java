public class App {
    public static void main(String[] args) throws Exception {
        polimorfismo(new Triangulo ("Triangulo", 5, 10));
        polimorfismo(new Rectangulo ("Rectangulo", 5, 10));
        polimorfismo(new Cuadrado ("Cuadrado", 5));
        polimorfismo(new Circulo ("Circulo", 5));
        polimorfismo(new Hexagono ("Hexagono", 5, 10));
    }

    public static void polimorfismo(Figura miFigura) {
        System.out.println("Tipo: " + miFigura.getTipo());
        System.out.println("Area: " + miFigura.area());
    }
}
