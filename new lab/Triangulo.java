public class Triangulo extends FiguraBidimencional {
    private double base;
    private double altura;

    public double obtenerArea() {
        return base * altura;
    }

    public String toString() {
        return "Triangulo con base de: " + base + " y altura de: " + altura;
    }
}
