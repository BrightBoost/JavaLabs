import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
import java.util.Date;

public class ExampleDates {
  public static void main(String[] args) {
    LocalDateTime current = LocalDateTime.now();
    // 09/05/2021
    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    System.out.println(current.format(dtf1));

    // 2021-09-05
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    System.out.println(current.format(dtf2));

    // September 5, 2021
    DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
    System.out.println(current.format(dtf3));

    // Sunday, Sep 5, 2021 10:02
    DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy  hh:mm");
    System.out.println(current.format(dtf4));

    // see al zone ids
    // for(String zone : ZoneId.getAvailableZoneIds()){
    // System.out.println(zone);
    // }

    ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Etc/GMT"));
    System.out.println(zdt.format(dtf4));

    // 5:02 on 05-Sep-2021
    DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy");
    System.out.println(current.format(dtf5));
  }
}
