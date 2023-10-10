public class Prestamo implements PorPagar {
    private int numeroDeCuotas;
    private double montoDeCuota;
    public Prestamo(int numeroDeCuotas, double montoDeCuota){
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoDeCuota = montoDeCuota;
    }
    public int getNumeroDeCuotas(){
        return numeroDeCuotas;
    }
    public void setNumeroDeCuotas(int numeroDeCuotas){
        this.numeroDeCuotas = numeroDeCuotas;
    }
    public double getMontoDeCuota(){
        return montoDeCuota;
    }
    public void setMontoDeCuota(double montoDeCuota){
        this.montoDeCuota = montoDeCuota;
    }
    public String toString(){
        return "Numero de cuotas: " + numeroDeCuotas+" Monto de cuotas: "+montoDeCuota;
    }
    public double obtenerMontoPago(){
        return (numeroDeCuotas * montoDeCuota);
    }
    public static void main(String[] args){
        Prestamo prestamo1 = new Prestamo(3,245);
        System.out.println("Monto de pago: "+prestamo1.obtenerMontoPago());
    }
}
