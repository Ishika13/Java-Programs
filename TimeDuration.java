import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeDuration {
	
	public static void main(String[] args) {
		Period p1 = Period.ofWeeks(5);
		System.out.println(p1);
		
		Duration d1 = Duration.ofDays(30);
		System.out.println(d1);
		
		LocalDateTime localdtime = LocalDateTime.now();
		LocalDateTime finaldtime = localdtime.plus(d1);
		System.out.println(finaldtime);
				
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		String pattern = finaldtime.format(df);
		System.out.println("Formatted Date: "+pattern);
		
		ZoneId ZoneId1 = ZoneId.of("Europe/Paris");
		ZoneId ZoneId2 = ZoneId.of("Asia/Calcutta");
		LocalDateTime ld1 = LocalDateTime.now().minus(d1);
		System.out.println(ld1);
		LocalDateTime ld2 = LocalDateTime.now().minusDays(5);
		LocalDateTime ld3 = LocalDateTime.now().minusYears(1);
		System.out.println(ld2);
		System.out.println(ld3);
		ZonedDateTime zd1 = ZonedDateTime.now(ZoneId1);
		System.out.println(zd1);
		ZonedDateTime zd2 = ZonedDateTime.of(ld1, ZoneId2);
		System.out.println(zd2);
	}
}

