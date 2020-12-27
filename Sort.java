import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Sort {

    public static void main(String[] args) throws Exception {
        Employee worker = new Employee();
        File file = new File("child/src/test/java/Employees.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;
        Employee tempEmployee;
        List<Employee> workers = new ArrayList<Employee>();
        while ((line = br.readLine()) != null) {
            String[] splited = line.split("\\s+");
            tempEmployee = new Employee(Integer.parseInt(splited[0]), splited[1], splited[2], Integer.parseInt(splited[3]));
            workers.add(tempEmployee);
        }
        br.close();
        fr.close();

        Collections.sort(workers);
        for (Employee empl : workers) {
            System.out.println(empl);


        }
    }
}

