package Martes16;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Periodos {
	public static void main(String[] args) {
		
	
	LocalDate hoy = LocalDate.now();
	LocalDate finDeAño = hoy.with(TemporalAdjusters.lastDayOfYear());
	Period hastaFinDeAño = hoy.until(finDeAño);
	int meses = hastaFinDeAño.getMonths();
	int dias = hastaFinDeAño.getDays();
	
	System.out.println("Faltan " + meses + " meses y " + dias + " días hasta final de año");


	
	LocalDate hoy2 = LocalDate.parse("2020-07-06");
	LocalDate seisNov = LocalDate.parse("6/11/2020",DateTimeFormatter.ofPattern("d/M/yyyy"));
	System.out.println(hoy2);
	System.out.println(seisNov);
	}
}