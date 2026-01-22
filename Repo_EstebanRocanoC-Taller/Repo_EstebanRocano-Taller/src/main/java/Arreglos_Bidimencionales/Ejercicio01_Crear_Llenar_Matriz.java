package Arreglos_Bidimencionales;
import java.util.Scanner;
public class Ejercicio01_Crear_Llenar_Matriz {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas (1-10): ");
        int f = tcl.nextInt();
        System.out.print("Ingrese el numero de columnas (1-10): ");
        int c = tcl.nextInt();
        if (f >= 1 && f <= 10 && c >= 1 && c <= 10) {
            int[][] matriz = new int[f][c];
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                    matriz[i][j] = tcl.nextInt();
                }
            }
            System.out.println("Matriz cargada");
        } else {
            System.out.println("Filas o columnas fuera de rango");
        }
    }
}