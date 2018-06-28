package pl.ptemich.j8tutorials.pagechecker;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class UrlsExtractor {

  public Set<String> extractUrls(String baseUrl) {
    Set<String> extractedUrls = new HashSet<String>();
    HttpURLConnection connection = null;
    
    try {
      URL url = new URL(baseUrl);
      connection = (HttpURLConnection) url.openConnection();
      //connection.connect();
      
//      connection.setRequestMethod("POST");
//      connection.setRequestProperty("Content-Type", 
//          "application/x-www-form-urlencoded");
//
//      connection.setRequestProperty("Content-Length", 
//          Integer.toString(urlParameters.getBytes().length));
//      connection.setRequestProperty("Content-Language", "en-US");  
//
//      connection.setUseCaches(false);
      connection.setDoOutput(true);      
      
      // Send request
      DataOutputStream wr = new DataOutputStream (connection.getOutputStream());
      // wr.writeBytes(urlParameters);
      wr.close();

      //Get Response  
      InputStream is = connection.getInputStream();
      BufferedReader rd = new BufferedReader(new InputStreamReader(is));
      StringBuilder response = new StringBuilder(); // or StringBuffer if not Java 5+ 
      String line;
      while((line = rd.readLine()) != null) {
        response.append(line);
        response.append('\r');
      }
      rd.close();
      
      System.out.println(response.toString());
      
      //Pattern linkPattern = 
      
    } catch (MalformedURLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      if (connection != null) {
        connection.disconnect();
      }
    }
    
    return extractedUrls;
  }
  
}
