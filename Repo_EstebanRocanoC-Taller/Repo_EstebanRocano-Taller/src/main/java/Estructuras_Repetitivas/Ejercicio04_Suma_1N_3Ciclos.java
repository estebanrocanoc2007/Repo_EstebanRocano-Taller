package Estructuras_Repetitivas;
import java.util.Scanner;
public class Ejercicio04_Suma_1N_3Ciclos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un numero entero N (>=1): ");
        int N = tcl.nextInt();
        if (N >= 1) {
           int sumaWhile = 0;
            int i = 1;
            while (i <= N) {
                sumaWhile += i;
                i++;
            }
            int sumaDoWhile = 0;
            int j = 1;
            do {
                sumaDoWhile += j;
                j++;
            } while (j <= N);
            int sumaFor = 0;
            for (int k = 1; k <= N; k++) {
                sumaFor += k;
            }
            System.out.println("Suma con while: " + sumaWhile);
            System.out.println("Suma con do-while: " + sumaDoWhile);
            System.out.println("Suma con for: " + sumaFor);
            if (sumaWhile == sumaDoWhile && sumaWhile == sumaFor) {
                System.out.println("Las tres sumas coinciden");
            } else {
                System.out.println("Revisar implementacion");
            }
        } else {
            System.out.println("N invalido, debe ser mayor o igual a 1");
        }
    }
}
