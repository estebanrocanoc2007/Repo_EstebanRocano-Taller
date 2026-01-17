import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        String claveCorrecta = "utpl";
        String clave = "";
        int intentos = 0;

        while (!clave.equals(claveCorrecta)) {
            System.out.print("Ingrese la contraseña: ");
            clave = tcl.nextLine();
            intentos++;
        }

        System.out.println("Acceso concedido en " + intentos + " intento(s).");
    }
}

