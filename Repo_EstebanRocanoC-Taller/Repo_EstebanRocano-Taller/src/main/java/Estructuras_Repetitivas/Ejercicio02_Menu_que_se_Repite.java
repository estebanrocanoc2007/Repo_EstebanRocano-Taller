package Estructuras_Repetitivas;
import java.util.Scanner;
public class Ejercicio02_Menu_que_se_Repite {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = tcl.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Hola, bienvenido");
                    break;
                case 2:
                    System.out.println("Funcionalidad no implementada");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 3);
    }
}