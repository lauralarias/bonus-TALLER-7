
import java.util.ArrayList;
import java.util.Stack;

class Chat {
    private Stack<String> usuariosConectados;
    private ArrayList<String> usuariosAgregados;

    public Chat() {
        usuariosConectados = new Stack<>();
        usuariosAgregados = new ArrayList<>();
    }

    public void agregarUsuario(String nombre) {
        usuariosAgregados.add(nombre);
    }

    public void conectarUsuario(String nombre) {
        if (usuariosAgregados.contains(nombre)) {
            usuariosConectados.push(nombre);  // añade
        } else {
            System.out.println("Error: el usuario no existe.");
        }
    }

    public void desconectarUsuario(String nombre) {
        if (usuariosConectados.contains(nombre)) {
            usuariosConectados.remove(nombre);
        } else {
            System.out.println("Error: el usuario no está conectado.");
        }
    }

    public void mostrarUsuariosConectados() {
        System.out.println("Usuarios conectados:");
        for (String usuario : usuariosConectados) {
            System.out.println(usuario);
        }
    }
}
