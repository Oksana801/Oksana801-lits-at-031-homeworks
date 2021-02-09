
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.InvalidJsonException;
import com.jayway.jsonpath.JsonPath;

    public class Json {

        public static void main(String[] args) throws InvalidJsonException, IOException {
            FileInputStream fis = new FileInputStream("src/main/resources/Sample.json");

            Object document = Configuration.defaultConfiguration().jsonProvider().parse(fis, "UTF-8");

            String name0 = JsonPath.read(document, "$.work.members[0].name");
            int age0 = JsonPath.read(document, "$.work.members[0].age");
            String identity0 = JsonPath.read(document, "$.work.members[0].secretIdentity");
            List<String> powers0 = JsonPath.read(document, "$.work.members[0].powers");

            String name1 = JsonPath.read(document, "$.work.members[1].name");
            int age1 = JsonPath.read(document, "$.work.members[1].age");
            String identity1 = JsonPath.read(document, "$.work.members[1].secretIdentity");
            List<String> powers1 = JsonPath.read(document, "$.work.members[1].powers");

            System.out.println("Member1");
            System.out.println("name: " + name0);
            System.out.println("age: " + age0);
            System.out.println("secretIdentity: " + identity0);
            System.out.println("powers: " + powers0);

            System.out.println("Member2");
            System.out.println("name: " + name1);
            System.out.println("age: " + age1);
            System.out.println("secretIdentity: " + identity1);
            System.out.println("powers: " + powers1);
        }
    }
