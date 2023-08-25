import java.util.Scanner;
public class CuentaBanco {
    private String titular;
    private double cantidad;
    public CuentaBanco(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    public CuentaBanco(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Titular = " + this.titular + ". Cantidad = " + this.cantidad;
    }
    public void ingresar(double cantidad) {
        if (cantidad < 0) {
            System.out.println("La cantidad introducida es negativa. Fin.");
        }
    }
    public void retirar(double cantidad) {
        if ((this.cantidad - cantidad) < 0) {
            this.cantidad = 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CuentaBanco cuenta1 = new CuentaBanco("Juan", 200.50);
        CuentaBanco cuenta2 = new CuentaBanco("Juan");
        System.out.println("cuenta1: "+cuenta1);
        String newline = System.lineSeparator();
        System.out.println("Elija la opcion deseada: " + newline + "1. Ingresar dinero" + newline + "2. Retirar dinero" + newline + "3. Mostrar saldo");
        String opcion = input.nextLine();
        switch (opcion) {
            case "1": String Icantidad = new Scanner(s)
            System.out.println("Ingrese la cantidad:"+cuenta1);
                    cuenta1.ingresar(2398);
                    break;
            case "2": 
                    break;
            case "3": System.out.println("cuenta1"+cuenta1);
                    break;
            default:  System.out.println("Opcion invalida");
                    break;
        }

        
        
    }
}
