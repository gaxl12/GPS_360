package mx.edu.uth.gps360.ws;

import mx.edu.uth.gps360.dto.AccesoResponse;
import mx.edu.uth.gps360.dto.CoordenadaResponse;
import mx.edu.uth.gps360.dto.DetalleTrayectoResponse;
import mx.edu.uth.gps360.dto.EliminarTrayectoResponse;
import mx.edu.uth.gps360.dto.RenombrarTrayectoResponse;
import mx.edu.uth.gps360.dto.TrayectoResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Rutas del web service. Reutilizadas de la versión 1.
 * Código compartido: no modificar sin avisar al equipo.
 */
public interface WebApiService {

    @GET("login.php")
    Call<AccesoResponse> validaAcceso(
            @Query("user") String username,
            @Query("pass") String password);

    @GET("listar_trayectos.php")
    Call<TrayectoResponse> consultarTrayectos(
            @Query("usuario") String usuario);

    @GET("obtener_coordenadas.php")
    Call<DetalleTrayectoResponse> getCoordenadas(
            @Query("usuario") String usuario,
            @Query("trayecto") String trayecto);

    @GET("guardar_coordenada.php")
    Call<CoordenadaResponse> guardarCoordenada(
            @Query("usuario") String usuario,
            @Query("trayecto") String trayecto,
            @Query("latitud") double latitud,
            @Query("longitud") double longitud);

    @GET("eliminar_trayecto.php")
    Call<EliminarTrayectoResponse> eliminarTrayecto(
            @Query("usuario") String usuario,
            @Query("trayecto") String trayecto);

    @GET("renombrar_trayecto.php")
    Call<RenombrarTrayectoResponse> renombrarTrayecto(
            @Query("usuario") String usuario,
            @Query("trayecto") String trayecto,
            @Query("nuevo_nombre") String nuevoNombre);
}
