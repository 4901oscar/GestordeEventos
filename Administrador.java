
public class Administrador {
	private String nombre;
    private String correo;
    private String contraseña;

    public Administrador(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void agregarEvento(Evento evento) {
        // Lógica para agregar el evento a la lista de eventos disponibles
    }

    public void mostrarInformacionEvento(Evento evento) {
        evento.mostrarInformacion();
    }

    public void mostrarInformacionCliente(Cliente cliente) {
        cliente.mostrarInformacion();
    }
}
