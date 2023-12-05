package com.ray.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
//            URL url = new URL("https://api.jsonserve.com/rtpE7f");
            URL url = new URL("https://data.taipei/api/dataset/758e5ae0-e6ee-448b-81f5-316eb68a5ba7/resource/a63e3278-9d10-4916-9f24-e5a4d78afb31/download");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String line = in.readLine();
            StringBuffer json = new StringBuffer();
            while (line != null) {
//                System.out.println(line);
                json.append(line);
                line = in.readLine();
            }
            System.out.println(json.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
