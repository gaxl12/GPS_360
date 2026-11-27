package mx.edu.uth.gps360.dto;

public class CoordenadaResponse {
    private boolean guardado;
    private String mensaje;
    private String trayectoId;

    public boolean isGuardado() { return guardado; }
    public void setGuardado(boolean guardado) { this.guardado = guardado; }
    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
    public String getTrayectoId() { return trayectoId; }
    public void setTrayectoId(String trayectoId) { this.trayectoId = trayectoId; }
}
