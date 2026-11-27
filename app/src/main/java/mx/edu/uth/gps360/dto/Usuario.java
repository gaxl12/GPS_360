package mx.edu.uth.gps360.dto;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String username;
    private String nombre;
    private String apellidoPaterno;
    private String correo;
    private String idPerfil;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellidoPaterno() { return apellidoPaterno; }
    public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getIdPerfil() { return idPerfil; }
    public void setIdPerfil(String idPerfil) { this.idPerfil = idPerfil; }
}
