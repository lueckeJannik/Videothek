package shared.infrastructure.mailserver;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MailClient implements MailClientInterface {
    // representative for the mailserver client

    @Override
    public boolean sendReminder(MailRequest request) {
        // Connect to Mailserver and send the Mail
        //
        // If sending the Mail was successfull return true
       
        try {            
            URL url = new URL(("http://mailserverapi.com/api/messages" + request.getPre() + request.getSuf() ) );
            // create a new HttpURLConnection object and set the request method to GET
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("Get");
            // read the response from the server
            InputStream inputStream = connection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = bufferedReader.readLine()) != null) {
                response.append(inputLine);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
        return true;
    }

}
