import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BusquedaAPI {
    public  Moneda buscarTipoDeCambio(String tipoDeCambio) {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        System.out.println("Linea 16");
        String direccion = "https://v6.exchangerate-api.com/v6/95dec0406575b928026d5d8e/latest/" + tipoDeCambio + "/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        try {
            System.out.println("Llegue al try");
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
           // System.out.println(json);
            //System.out.println("Antes del GSON");
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception  e) {
            throw new RuntimeException("Ha ocurrido un error E");
        }
    }
}


