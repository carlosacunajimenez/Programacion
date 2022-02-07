package Martes16;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Periodos {
	public static void main(String[] args) {
		
	
	LocalDate hoy = LocalDate.now();
	LocalDate finDeA�o = hoy.with(TemporalAdjusters.lastDayOfYear());
	Period hastaFinDeA�o = hoy.until(finDeA�o);
	int meses = hastaFinDeA�o.getMonths();
	int dias = hastaFinDeA�o.getDays();
	
	System.out.println("Faltan " + meses + " meses y " + dias + " d�as hasta final de a�o");


	
	LocalDate hoy2 = LocalDate.parse("2020-07-06");
	LocalDate seisNov = LocalDate.parse("6/11/2020",DateTimeFormatter.ofPattern("d/M/yyyy"));
	System.out.println(hoy2);
	System.out.println(seisNov);
	}
}