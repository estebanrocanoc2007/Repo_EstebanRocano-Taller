package Arreglos_Unidimensionales;
import java.util.Scanner;
public class Ejercicio03_Estadisticas_Basicas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el valor de N (1-50): ");
        int N = tcl.nextInt();
        if (N >= 1 && N <= 50) {
            int[] arreglo = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                arreglo[i] = tcl.nextInt();
            }
            int mayor = arreglo[0];
            int menor = arreglo[0];
            int suma = 0;
            for (int i = 0; i < N; i++) {
                if (arreglo[i] > mayor) {
                    mayor = arreglo[i];
                }
                if (arreglo[i] < menor) {
                    menor = arreglo[i];
                }
                suma += arreglo[i];
            }
            double promedio = (double) suma / N;
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
            System.out.printf("Promedio: %.2f%n", promedio);
        } else {
            System.out.println("N fuera de rango");
        }
    }
}