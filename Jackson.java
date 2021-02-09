import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Jackson {
    public static void main(String[] st) throws IOException, FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        File from = new File("src/main/resources/Sample.json");
        TypeReference<HashMap<String, Object>> typeRef
                = new TypeReference<HashMap<String, Object>>() {
        };

        HashMap<String, Object> map = mapper.readValue(from, typeRef);
        System.out.println(map);

    }

}






