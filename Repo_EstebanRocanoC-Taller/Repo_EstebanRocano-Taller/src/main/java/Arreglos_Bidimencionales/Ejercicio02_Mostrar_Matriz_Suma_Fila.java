package Arreglos_Bidimencionales;
import java.util.Scanner;
public class Ejercicio02_Mostrar_Matriz_Suma_Fila {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas: ");
        int f = tcl.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        int c = tcl.nextInt();
        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
            }
        }
        System.out.println("\nMatriz:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < f; i++) {
            int sumaFila = 0;
            for (int j = 0; j < c; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + " -> suma = " + sumaFila);
        }
    }
}
