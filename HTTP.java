
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.Request;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class  HTTP {

       @Test
       public  void CodeVerification() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://www.google.com/")
                .build();
        Response response = client.newCall(request).execute();
        String responseBody = ((Response) response).body().string();

            //if response code is equal to 200
            assertThat(response.code(), equalTo(200));
            System.out.println("RESPONSE CODE IS:\n" + response.code() + "\n");

        }
            @Test
             public void ContentTypeVerification() throws IOException {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("https://www.google.com/")
                    .build();
            Response response = client.newCall(request).execute();
            String responseBody = ((Response) response).body().string();

            //  if Content-Type is correct
            assertThat(response.header("Content-Type"),equalTo("text/html; charset=ISO-8859-1"));
            System.out.println("Content-Type:\n" +response.header("Content-Type"));

        }
           @Test
           public void ResponseBody() throws IOException {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("https://www.google.com/")
                    .build();
            Response response = client.newCall(request).execute();
            String responseBody = ((Response) response).body().string();

              // Validate if Response Body Contains a specific String
               Assert.assertTrue(responseBody.contains("var pmc='{\\x22d\\x22:{}"));
               System.out.println("RESPONSE BODY:\n" + responseBody + "\n");

           }
    }






