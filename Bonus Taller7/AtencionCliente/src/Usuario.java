class Usuario {
    private String nombre;
    private int numeroTicket;

    public Usuario(String nombre, int numeroTicket) {
        this.nombre = nombre;
        this.numeroTicket = numeroTicket;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }
}