public class Tetraedro extends FiguraTridimencional {
    private double lado;

    public double obtenerArea() {
        return Math.sqrt(3) * Math.pow(lado, 2);
    }

    public double obtenerVolumen() {
        return (Math.pow(lado, 3) / (6 * Math.sqrt(2)));
    }

    public String toString() {
        return "Teraedro con lados de: " + lado;
    }
}
