package Arreglos_Bidimencionales;
import java.util.Scanner;
public class Ejercicio03_SumaTotal_Diagonal {
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
        int sumaTotal = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("Suma total de elementos: " + sumaTotal);
        if (f == c) {
            int sumaDiagonal = 0;
            for (int i = 0; i < f; i++) {
                sumaDiagonal += matriz[i][i];
            }
            System.out.println("Suma diagonal principal: " + sumaDiagonal);
        } else {
            System.out.println("Diagonal no aplica");
        }
    }
}