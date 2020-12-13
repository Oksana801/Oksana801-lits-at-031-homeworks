import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class Jackson {
    public static void main(String[] st) throws IOException, FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        String json ="{\n" +
                "  \"work\": {\n" +
                "\n" +
                "    \"members\": [\n" +
                "      {\n" +
                "        \"name\": \"Molecule Man\",\n" +
                "        \"age\": 29,\n" +
                "        \"secretIdentity\": \"Dan Jukes\",\n" +
                "        \"powers\": [\n" +
                "          \"Radiation resistance\",\n" +
                "          \"Turning tiny\",\n" +
                "          \"Radiation blast\"\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Madame Uppercut\",\n" +
                "        \"age\": 39,\n" +
                "        \"secretIdentity\": \"Jane Wilson\",\n" +
                "        \"powers\": [\n" +
                "          \"Million tonne punch\",\n" +
                "          \"Damage resistance\",\n" +
                "          \"Superhuman reflexes\"\n" +
                "        ]\n" +
                "      }\n" +
                "\n" +
                "    ]\n" +
                "  }\n" +
                "}";

        try {

            // convert JSON string to Map
            Map<String, String> map = mapper.readValue(json, Map.class);



            System.out.println(map);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}





