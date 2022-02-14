package Martes16;

import java.util.Date;

public class martes16 {
	public static void main(String[] args) {
		
		Date fecha = new Date();
		System.out.println(fecha);
		Date fecha2 = new Date(116, 5, 3); //si metemos un parámetro dentro de un paréntesis se llama constructor
		System.out.println(fecha2); //date cuenta desde el 1900 
		
		System.out.println("Año: " + (fecha2.getYear()+ 1900));
		System.out.println("Mes: " + (fecha2.getMonth()));
		System.out.println("dia: " + (fecha2.getDate()));
		System.out.println("día de la semana: " + (fecha2.getDay()));
		System.out.println("Hora:" + fecha.getHours());
		System.out.println("Minutos:" + fecha.getMinutes());
		System.out.println("Segundos:" + fecha.getSeconds());
		Date fecha3 = new Date(116, 5, 3, 10, 5, 6);
		System.out.println(fecha3);
		
		System.out.println(fecha.after(fecha3));
		System.out.println(fecha.before(fecha2));
		
		
	}

}
