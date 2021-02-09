import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateLocal {

    static LocalDate myMethod(LocalDate currentDate, int days, int month, int year) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        LocalDate futureDate = LocalDate.now().plusDays(days).plusMonths(month).plusYears(year);
        return futureDate;
    }

public class Main {

}

    public static void main(String[] args) {
        DateLocal t2 =new DateLocal();

        System.out.println ("active date " + LocalDate.now());
        System.out.println("future date " + t2.myMethod( LocalDate.now(),6,2,10));

    }
}
