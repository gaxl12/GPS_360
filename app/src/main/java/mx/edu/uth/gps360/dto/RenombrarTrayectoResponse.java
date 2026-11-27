package mx.edu.uth.gps360.dto;

public class RenombrarTrayectoResponse {
    private boolean renombrado;
    private String mensaje;
    private String usuario;
    private String anterior;
    private String nuevo;

    public boolean isRenombrado() { return renombrado; }
    public void setRenombrado(boolean renombrado) { this.renombrado = renombrado; }
    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public String getAnterior() { return anterior; }
    public void setAnterior(String anterior) { this.anterior = anterior; }
    public String getNuevo() { return nuevo; }
    public void setNuevo(String nuevo) { this.nuevo = nuevo; }
}
