
public class Boleto {
	 private int numeroBoleto;
	    private String nombreEvento;
	    private String nombreCliente;
	    private Asiento asiento;
	    private String fechaHoraEvento;
	    private String direccionVenue;
	    private double precio;

	    public Boleto(int numeroBoleto, String nombreEvento, String nombreCliente, Asiento asiento,
	                  String fechaHoraEvento, String direccionVenue, double precio) {
	        this.numeroBoleto = numeroBoleto;
	        this.nombreEvento = nombreEvento;
	        this.nombreCliente = nombreCliente;
	        this.asiento = asiento;
	        this.fechaHoraEvento = fechaHoraEvento;
	        this.direccionVenue = direccionVenue;
	        this.precio = precio;
	    }

	    public int getNumeroBoleto() {
	        return numeroBoleto;
	    }

	    public String getNombreEvento() {
	        return nombreEvento;
	    }

	    public String getNombreCliente() {
	        return nombreCliente;
	    }

	    public Asiento getAsiento() {
	        return asiento;
	    }

	    public String getFechaHoraEvento() {
	        return fechaHoraEvento;
	    }

	    public String getDireccionVenue() {
	        return direccionVenue;
	    }

	    public double getPrecio() {
	        return precio;
	    }
}
