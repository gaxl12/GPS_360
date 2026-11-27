package mx.edu.uth.gps360.dto;

import java.util.List;

public class TrayectoResponse {
    private boolean encontrado;
    private int total;
    private List<Trayecto> trayectos;

    public boolean isEncontrado() { return encontrado; }
    public void setEncontrado(boolean encontrado) { this.encontrado = encontrado; }
    public int getTotal() { return total; }
    public void setTotal(int total) { this.total = total; }
    public List<Trayecto> getTrayectos() { return trayectos; }
    public void setTrayectos(List<Trayecto> trayectos) { this.trayectos = trayectos; }
}
