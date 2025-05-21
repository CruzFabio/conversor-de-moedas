import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {

    public Moeda consultaTaxa(String codigo) {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/032fe1c63db5f2bd0c9a711c/latest/" + codigo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(endereco)))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Código não localizado!");
        }

    }

}


