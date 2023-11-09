
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chat chat = new Chat();
        int opcion;

        do {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Conectar usuario");
            System.out.println("3. Desconectar usuario");
            System.out.println("4. Mostrar usuarios conectados");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de usuario: ");
                    chat.agregarUsuario(scanner.next());
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de usuario: ");
                    chat.conectarUsuario(scanner.next());
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de usuario: ");
                    chat.desconectarUsuario(scanner.next());
                    break;
                case 4:
                    chat.mostrarUsuariosConectados();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error: opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
