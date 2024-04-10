import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
public class LocalDateDemo {
    public static void main(String[] arsg){
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        ld = LocalDate.of(2023,Month.APRIL,15);
        System.out.println(ld);
        ld = LocalDate.of(2021,2,10);
        System.out.println(ld);

        ld = LocalDate.parse("2022-04-23");
        System.out.println(ld);
    }
}
