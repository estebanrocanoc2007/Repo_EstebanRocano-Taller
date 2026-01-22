package Estructuras_Selectivas;
import java.util.Scanner;
public class Ejercicio02_Aprobado_Reprobado {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese la nota final (0-100): ");
        int nota = tcl.nextInt();

        if (nota >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        
        if (nota > 100) {
            System.out.println("Nota invalida");
        }
    }
}