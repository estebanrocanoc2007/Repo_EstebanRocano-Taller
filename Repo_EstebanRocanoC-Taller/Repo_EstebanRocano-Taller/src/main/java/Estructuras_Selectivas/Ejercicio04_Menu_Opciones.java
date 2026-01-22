package Estructuras_Selectivas;
import java.util.Scanner;
public class Ejercicio04_Menu_Opciones {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("MENU DE OPCIONES");
        System.out.println("1. Sumar");
        System.out.println("2. Reiniciar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Seleccione una opcion (1-4): ");
        int opcion = tcl.nextInt();
        System.out.print("Ingrese el primer numero: ");
        double n1 = tcl.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double n2 = tcl.nextDouble();
        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case 2:
                n1 = 0;
                n2 = 0;
                System.out.println("Valores reiniciados");
                break;
            case 3:
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("No se puede dividir para cero");
                } else {
                    System.out.println("Resultado: " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}