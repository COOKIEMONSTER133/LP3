public class Rectangulo {
    private double esquina1;
    private double esquina2;
    public Rectangulo(double c1, double c2) {
        c1 = esquina1;
        c2 = esquina2;
    }
    
    public double getEsquina1() {
        return esquina1;
    }
    public void setEsquina1(double c) {
        c = esquina1;
    }
    public double getEsquina2() {
        return esquina2;
    }
    public void setEsquina2(double c) {
        c = esquina2;
    }
    public String toString() {
        return esquina1 + " " + esquina2;
    }

}