import java.util.LinkedList;

public class Atencion {

    private LinkedList<Usuario> cola;
    private int numeroTicket;

    public Atencion() {
        cola = new LinkedList<>();
        numeroTicket = 0;
    }

    public void registrarUsuario(String nombre) {
        numeroTicket++;
        Usuario usuario = new Usuario(nombre, numeroTicket);
        cola.add(usuario);
    }

    public void atenderUsuario() {
        if (!cola.isEmpty()) {
            Usuario usuarioAtendido = cola.pop(); // elimina
            System.out.println("Se atendió al usuario: " + usuarioAtendido.getNombre() +
                    " con el número de ticket: " + usuarioAtendido.getNumeroTicket());
        } else {
            System.out.println("No hay usuarios en la cola.");
        }
    }

    public void listarUsuariosPendientes() {
        if (!cola.isEmpty()) {
            for (Usuario usuario : cola) {
                System.out.println("Nombre: " + usuario.getNombre() +
                        " Número de ticket: " + usuario.getNumeroTicket());
            }
        } else {
            System.out.println("No hay usuarios en la cola.");
        }
    }}
