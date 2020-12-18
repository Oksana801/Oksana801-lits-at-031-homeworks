import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class task3 {
    public static void main(String[] args) throws IOException {

        File file = new File("src/test/java/file");
        Map<String, String> allFileMap = new HashMap<>();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;
        int key = 1;

        while ((line = br.readLine()) != null) {
            allFileMap.put(String.valueOf(key), line);
            key++;
            System.out.println(line);
        }
        br.close();
        fr.close();

        File file1 = new File("src/test/java/powerOfTwo.txt");

        PrintWriter writer = new PrintWriter(file1);
        for (String tempKey : allFileMap.keySet()) {
            if (isPowerOfTwo(Integer.valueOf(tempKey))) {
                writer.println(allFileMap.get(tempKey));
            }
        }
        writer.close();
    }

    private static boolean isPowerOfTwo(long x) {
        return x > 0 && (x & (x - 1)) == 0;
    }
}