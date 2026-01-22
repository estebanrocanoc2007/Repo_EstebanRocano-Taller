package Estructuras_Repetitivas;
import java.util.Scanner;
public class Ejercicio01_Validacion_Contraseña {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String claveCorrecta = "utpl";
        String claveIngresada = "";
        int intentos = 0;
        while (!claveIngresada.equals(claveCorrecta)) {
            System.out.print("Ingrese la contraseña: ");
            claveIngresada = tcl.nextLine();
            intentos++;
        }
        System.out.println("Acceso concedido en " + intentos + " intento(s)");
    }
}
