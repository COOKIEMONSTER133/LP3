public class Coordenada {
    private int x;
    private int y;
    public Coordenada(){}
    public Coordenada(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c){
        this.c = c;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double Distancia(Coordenada c) {
        
    }
    public static double Distancia(Coordenada c1, Coordenada c2) {

    }
    public String toString() {
        return x + " " + y;
    }

}
