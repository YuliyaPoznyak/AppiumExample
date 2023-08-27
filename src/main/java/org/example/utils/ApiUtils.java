package org.example.utils;
import com.google.gson.Gson;
import org.example.models.ApiMethod;
import org.example.models.Config;
import org.example.models.HeadersValue;
import org.example.models.HttpEndpoint;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.reflections.Reflections.log;

public class ApiUtils {

    public static String postRequest(String endpoint, String body) throws Exception {
        try {
            URL url = new URL(String.format("%s%s%s", Configuration.getConfigData().getUrl(), HttpEndpoint.API_URL.getEndpoint(), endpoint));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(ApiMethod.POST.getApiMethod());
            connection.setRequestProperty("Content-Type", HeadersValue.APP_JSON.getHeaderValue());
            connection.setRequestProperty("Cookie", Configuration.getConfigData().getCookie());
            connection.setRequestProperty("Accept-Encoding", HeadersValue.ACCEPT_ENCODING.getHeaderValue());
            connection.setRequestProperty("User-Agent", HeadersValue.USER_AGENT.getHeaderValue());
            connection.setDoOutput(true);
            connection.getOutputStream().write(body.getBytes("UTF-8"));
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            connection.disconnect();
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    }

