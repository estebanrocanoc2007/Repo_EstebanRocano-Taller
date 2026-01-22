package Estructuras_Repetitivas;
import java.util.Scanner;
public class Ejercicio03_Tabla_Multiplicar {
    public static void main(String[] args) {
       Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int n = tcl.nextInt();

        if (n > 0) {
            for (int i = 1; i <= 12; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } else {
            System.out.println("El numero debe ser positivo");
        }
    }
}
