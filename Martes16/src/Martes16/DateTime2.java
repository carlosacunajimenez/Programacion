package Martes16;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTime2 {
	
	public static void main(String[] args) {
		System.out.println("La fecha actual: " + LocalDate.now());
		System.out.println("La hora actual es: " + LocalTime.now());
		System.out.println("La fecha y hora actuales son: " + LocalDateTime.now() + " con zona horario son: " + ZonedDateTime.now());
		System.out.println("El instante actual es: " + Instant.now());
		System.out.println("Fecha de mi cumpleaños: " + LocalDate.of(1972, Month.MAY, 23));
		System.out.println("Con la hora exacta: " + LocalDateTime.of(1972, Month.MAY, 23, 20, 01, 15, 0023));
		System.out.println("La fecha dentro de 10 días: " + LocalDate.now().plusDays(10));
		System.out.println("La fecha y hora de hace 32 horas: "+ LocalDateTime.now().minusHours(32));
		System.out.println("El primer día del próximo mes es: " + LocalDate.now().with(TemporalAdjusters.
				firstDayOfNextMonth()).getDayOfWeek());
		LocalDate fnacimiento = LocalDate.of(1972, Month.MAY, 23);
		System.out.println("Tu edad es de " + ChronoUnit.YEARS.between(fnacimiento, LocalDate.now()) +" años");
	}

}
