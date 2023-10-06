import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud de los Passwords: ");
        int longitud = scanner.nextInt();
        System.out.print("Ingrese el tamano de del array de Passwords: ");
        int atamano = scanner.nextInt();
        Password[] passwords = new Password[atamano];
        boolean[] fuertes = new boolean[atamano];
        for (int i = 0; i < atamano; i++) {
            passwords[i] = new Password(longitud);
        }
        for (int i = 0; i < atamano; i++) {
            fuertes[i] = passwords[i].esFuerte();
        }
        int j = 0;
        for (int i = 0; i < atamano; i++) {
            j = j + 1;
            System.out.println("Contrasena " + j + ": " + passwords[i] + "  -  " + fuertes[i]);
        }
        scanner.close();
    }
}
