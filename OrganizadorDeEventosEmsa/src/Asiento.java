
public class Asiento {
	private String seccion;
    private String fila;
    private String correlativo;
    private boolean disponible;

    public Asiento(String seccion, String fila, String correlativo) {
        this.seccion = seccion;
        this.fila = fila;
        this.correlativo = correlativo;
        this.disponible = true;
    }

    public String getSeccion() {
        return seccion;
    }

    public String getFila() {
        return fila;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
