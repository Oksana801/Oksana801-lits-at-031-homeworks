import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;


public class randomCollection {
    private char[] array = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    private char getRandomString() {
        return array[random(array.length)];
    }

    private int random(int length) {
        return new Random().nextInt(length);
    }

    protected randomCollection(int max) {
        Random r = new Random();
        char[] data = new char[array.length];

        boolean running = true;
        int count = 0;
        while (running) {
            StringBuilder sb = new StringBuilder();
           //  int size = random(15) + random(15);
            int size = 6 +(new Random()).nextInt(15-6);
            for (int i = 0; i < size; i++) {
                sb.append(getRandomString());
            }
            System.out.println("String " + sb.toString());
          if (count++ == max) {
               running = false;
                System.out.println("finish");

            }
        }
    }

    public static void main(String[] args) {

new randomCollection(6);

    }

}