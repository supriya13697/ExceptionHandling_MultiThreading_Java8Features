package NewFeatures;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class dateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalDate d1 = LocalDate.of(1997, Month.JUNE, 13);
		//LocalDate d1 = LocalDate.of(1997, 6, 13);
		System.out.println(d1);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		//Machine readable
		Instant i = Instant.now();
		System.out.println(i);
		
		LocalDateTime d2 = LocalDateTime.now();
		System.out.println(d2);
	}

}
