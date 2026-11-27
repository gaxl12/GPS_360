package mx.edu.uth.gps360.dto;

public class EliminarTrayectoResponse {
    private boolean eliminado;
    private String mensaje;

    public boolean isEliminado() { return eliminado; }
    public void setEliminado(boolean eliminado) { this.eliminado = eliminado; }
    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
}
