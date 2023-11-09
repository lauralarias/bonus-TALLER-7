
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Atencion atencion = new Atencion();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n---Menu de opciones---");
            System.out.println("1. Agregar cliente a la cola");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Listar usuarios pendientes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.next();
                    atencion.registrarUsuario(nombre);
                    break;
                case 2:
                    atencion.atenderUsuario();
                    break;
                case 3:
                    atencion.listarUsuariosPendientes();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

