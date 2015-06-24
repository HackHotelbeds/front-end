package trip.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ibram on 06/06/2015.
 */
public class Connection {

    private String restToken="Bearer ";

    public String getRestToken() {
        return restToken;
    }

    public void setRestToken(String restToken) {
        this.restToken = restToken;
    }

    public void  connectSabreAPI(){


        HttpURLConnection connection = null;
        String clienID="VjE6Zm4zaDBocGcwbWdkYWhmZDpERVZDRU5URVI6RVhU1";
        String pass="RGFkUjVWMHc=";
        byte[] encodedBytes = Base64.encodeBase64((clienID + ":" + pass).getBytes());
        String encodeStr= new String(encodedBytes);

        try {
            HttpClient httpclient = HttpClients.createDefault();
            HttpPost httppost = new HttpPost("https://api.sabre.com/v1/auth/token");

            // Request parameters and other properties.
            List<NameValuePair> params = new ArrayList<NameValuePair>(2);
            params.add(new BasicNameValuePair("grant_type", "client_credentials"));

            httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

            httppost.setHeader("Authorization", "Basic "+encodeStr);
            httppost.setHeader("Host", "api.sabre.com");

            //Execute and get the response.
            //TODO HttpResponse response = httpclient.execute(httppost);
                /*HttpEntity entity = response.getEntity();
                if (entity != null) {
                    InputStream instream = entity.getContent();
                    try {
                        // do something useful
                    } finally {
                        instream.close();
                    }
                }*/
            //CUIDADO CON LA DOBLE BARRA EN ACCESS TOKEN
            String respuesta="{\n" +
                    "\"access_token\": \"Shared/IDL:IceSess\\/SessMgr:1\\.0.IDL/Common/!ICESMS\\/ACPCRTD!ICESMSLB\\/CRT.LB!-3526917057683131614!1329379!0!!E2E-1\",\n" +
                    "\"token_type\": \"bearer\",\n" +
                    "\"expires_in\": 900\n" +
                    "}";




            restToken=restToken + respuesta.substring(respuesta.indexOf("Shared/IDL"),respuesta.indexOf("\",\n\"token_type"));

        } catch (Exception ex){

        }


    }
}
