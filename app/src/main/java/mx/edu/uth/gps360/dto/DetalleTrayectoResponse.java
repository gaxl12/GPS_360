package mx.edu.uth.gps360.dto;

import java.util.List;

public class DetalleTrayectoResponse {
    private boolean encontrado;
    private String mensaje;
    private List<Coordenada> coordenadas;

    public boolean isEncontrado() { return encontrado; }
    public void setEncontrado(boolean encontrado) { this.encontrado = encontrado; }
    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
    public List<Coordenada> getCoordenadas() { return coordenadas; }
    public void setCoordenadas(List<Coordenada> coordenadas) { this.coordenadas = coordenadas; }
}
