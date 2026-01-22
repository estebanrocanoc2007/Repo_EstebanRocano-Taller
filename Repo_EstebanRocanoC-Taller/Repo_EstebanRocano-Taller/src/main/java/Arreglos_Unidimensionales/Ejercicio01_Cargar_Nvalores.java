package Arreglos_Unidimensionales;
import java.util.Scanner;
public class Ejercicio01_Cargar_Nvalores {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el valor de N (1-50): ");
        int n = tcl.nextInt();
        if (n >= 1 && n <= 50) {
            int[] arreglo = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                arreglo[i] = tcl.nextInt();
            }
            System.out.println("Carga completada");
        } else {
            System.out.println("N fuera de rango");
        }
    }
}
