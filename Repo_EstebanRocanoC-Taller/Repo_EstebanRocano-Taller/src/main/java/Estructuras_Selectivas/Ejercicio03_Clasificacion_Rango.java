package Estructuras_Selectivas;
import java.util.Scanner;

public class Ejercicio03_Clasificacion_Rango {
    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese el puntaje (0-100): ");
        int puntaje = tcl.nextInt();

        if (puntaje >= 0 && puntaje <= 100) {
            if (puntaje >= 90) {
                System.out.println("Excelente");
            } else {
                if (puntaje >= 70) {
                    System.out.println("Bueno");
                } else {
                    System.out.println("En proceso");
                }
            }
        } else {
            System.out.println("Puntaje invalido");
        }
    }
}
