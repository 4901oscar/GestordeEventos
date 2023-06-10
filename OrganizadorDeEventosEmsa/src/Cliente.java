import java.util.List;

public class Cliente {
	 private String nombre;
	    private String direccion;
	    private String correo;
	    private List<Boleto> boletos;

	    public Cliente(String nombre, String direccion, String correo) {
	        this.nombre = nombre;
	        this.direccion = direccion;
	        this.correo = correo;
	        this.boletos = new ArrayList<>();
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public String getCorreo() {
	        return correo;
	    }

	    public List<Boleto> getBoletos() {
	        return boletos;
	    }

	    public void agregarBoleto(Boleto boleto) {
	        boletos.add(boleto);
	    }

	    public void mostrarInformacion() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Dirección: " + direccion);
	        System.out.println("Correo: " + correo);
	        System.out.println("Boletos adquiridos:");
	        for (Boleto boleto : boletos) {
	            System.out.println("Número de boleto: " + boleto.getNumeroBoleto());
	            System.out.println("Evento: " + boleto.getNombreEvento());
	            System.out.println("Fecha y hora: " + boleto.getFechaHoraEvento());
	            System.out.println("Asiento: " + boleto.getAsiento().getSeccion() + "-" +
	                    boleto.getAsiento().getFila() + "-" + boleto.getAsiento().getCorrelativo());
	            System.out.println("Dirección del evento: " + boleto.getDireccionVenue());
	            System.out.println("Precio: " + boleto.getPrecio());
	        }
	    }
}
