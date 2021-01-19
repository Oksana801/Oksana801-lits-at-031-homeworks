import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomCollectionExample {
    public static void main(String[] args) {
        System.out.println(getRandomStrings(10));
    }

    public static List<String> getRandomStrings(int amount) {
        List<String> myList = new ArrayList<String>();
        int min = 6;
        int max = 15;
        int randomLength;
        for (int i = 0; i < amount; i++) {
            randomLength = randomChar(min, max);
            myList.add(randomString(randomLength));
        }
        return myList;
    }

    private static String randomString(int length) {
        StringBuilder result = new StringBuilder();
        int min = 65; //A
        int max = 122; //z
        for (int i = 0; i < length; i++) {
            result.append(randomChar(min, max));
        }
        return result.toString();
    }

    private static char randomChar(int min, int max) {
        return (char) ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
