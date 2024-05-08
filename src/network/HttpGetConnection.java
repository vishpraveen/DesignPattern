package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpGetConnection {

    public HttpGetConnection() {
    }

    public static void main(String[] args) {
        HttpGetConnection ht = new HttpGetConnection();
        ht.fetchDataFromApi();
    }

    void fetchDataFromApi() {
        try {
            URL url = new URL("https://dummyjson.com/products");
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.setRequestMethod("GET");
            http.setConnectTimeout(5000);

            System.out.println("Response Code: " + http.getResponseCode());
            BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = br.readLine()) != null) {
                content.append(inputLine);
            }
            br.close();
            http.disconnect();
            System.out.println("Response: " + content);
        } catch (IOException ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
