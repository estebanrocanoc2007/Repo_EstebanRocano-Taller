package Estructuras_Selectivas;
import java.util.Scanner;
public class Ejercicio01_Control_Acceso_Edad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = tcl.nextInt();

        if (edad < 0) {
            System.out.println("Edad inválida");
        }

        if (edad >= 18) {
            System.out.println("Acceso permitido");
        }
    }
}
