import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Evento {
	LocalDate fecha;
	LocalTime horaInicio;
	LocalTime horaFin;
	String nombreEvento;
	int precioEntrada;
	String nombreOrganizador;
	
	//metodo para la fecha del evento 
	private String nombre;
    private List<String> fechas;
    private List<String> horasInicio;
    private List<String> horasFin;
    private String sinopsis;
    private double precioVIPMasG;
    private double precioVIP;
    private double precioPlateaA;
    private double precioPlateaB;

    private String responsable;

    public Evento(String nombre,  String responsable) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.fechas = new ArrayList<>();
        this.horasInicio = new ArrayList<>();
        this.horasFin = new ArrayList<>();
    }

    public void agregarFecha(String fecha) {
        fechas.add(fecha);
    }

    public void agregarHoraInicio(String horaInicio) {
        horasInicio.add(horaInicio);
    }

    public void agregarHoraFin(String horaFin) {
        horasFin.add(horaFin);
    }

    public List<String> getFechas() {
        return fechas;
    }

    public List<String> getHorasInicio() {
        return horasInicio;
    }

    public List<String> getHorasFin() {
        return horasFin;
    }

    // Otros métodos de acceso y modificación de atributos
    // ...

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
  
        System.out.println("Responsable: " + responsable);
       
        System.out.println("Fechas del evento:");
        for (int i = 0; i < fechas.size(); i++) {
            System.out.println("Fecha: " + fechas.get(i));
            System.out.println("Hora de inicio: " + horasInicio.get(i));
            System.out.println("Hora de fin: " + horasFin.get(i));
        }
        // Mostrar los demás atributos
        // ...
    }
	
}
