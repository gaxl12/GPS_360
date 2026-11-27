package mx.edu.uth.gps360.ws;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Cliente único para el web service de GPS 360.
 * Código compartido: no modificar sin avisar al equipo.
 */
public final class ApiClient {

    public static final String BASE_URL = "https://gaxldev.com/ws_app/ws/";

    private static WebApiService service;

    private ApiClient() {
    }

    public static WebApiService getService() {
        if (service == null) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.NONE);

            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(logging)
                    .build();

            service = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(WebApiService.class);
        }
        return service;
    }
}
