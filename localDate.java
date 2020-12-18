import java.time.*;
import java.time.format.DateTimeFormatter;

public class localDate {

    static LocalDate myMethod(LocalDate date1, int days, int month, int year) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        LocalDate futureDate = LocalDate.now().plusDays(days).plusMonths(month).plusYears(year);
        return LocalDate.now().plusDays(days).plusMonths(month).plusYears(year);


    }

public class main {

}

    public static void main(String[] args) {
        localDate t2 =new localDate();

        System.out.println ("active date " + LocalDate.now());
        System.out.println("future date " + t2.myMethod( LocalDate.now(),6,2,10));

    }
}
