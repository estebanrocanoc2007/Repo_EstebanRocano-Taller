package Arreglos_Unidimensionales;
import java.util.Scanner;
public class Ejercicio02_Mostrar_Contar {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo N: ");
        int N = tcl.nextInt();
        int[] arreglo = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            arreglo[i] = tcl.nextInt();
        }
        int pares = 0;
        int impares = 0;
        System.out.println("Valores del arreglo:");
        for (int i = 0; i < N; i++) {
            System.out.println(arreglo[i]);

            if (arreglo[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares + ", Impares: " + impares);
    }
}
