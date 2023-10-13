public class Cuadrado extends FiguraBidimencional {
    private double lado;

    public double obtenerArea() {
        return Math.pow(lado, 2);
    }

    public String toString() {
        return "Cuadrado con lados de: " + lado;
    }
}
