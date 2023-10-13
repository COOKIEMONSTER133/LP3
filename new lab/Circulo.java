public class Circulo extends FiguraBidimencional {
    private double radio;

    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public String toString() {
        return "Circulo con radio de: " + radio;
    }
}
