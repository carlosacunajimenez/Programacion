package Martes16;



import java.util.Calendar;
import java.util.Scanner;
 
public class calendar {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int date = 0; // almacena la semana número 1 calculada después del año y mes ingresados
		 int day_max = 0; // El número de días en el mes donde se almacenan el año, mes y año ingresados
		
		 int year = 0; // se usa para guardar el año ingresado
		 int mes = 0; // usado para guardar el mes de entrada
		
		Scanner in = new Scanner(System.in);
		 System.out.print ("Ingrese el año:");
		year = in.nextInt();
		 System.out.print ("Ingrese el mes:");
		mes = in.nextInt();
		 System.out.println ("La fecha ingresada es:" + year + "-" + mes);
		in.close();
		
		 // Establezca el mes en el 1 del mes siguiente, y el día anterior, obtenga primero la cantidad de días en el mes actual
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, mes);
		calendar.set(Calendar.DATE, 1);
		
		calendar.add(Calendar.DATE, -1);
		day_max = calendar.get(Calendar.DATE);
		
		 // Establezca la hora en 1 nuevamente, que es el día de la semana, el domingo es 0, el lunes es 1, y así sucesivamente
		calendar.add(Calendar.DATE, -(day_max - 1));
		date = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		
		System.out.println(calendar.getTime());
		printfCalendar(date, day_max);
	}
	
	/**
	  * Función: imprimir un calendario
	  * @param start es el día de la semana el primero del mes
	  * @param day_max cuantos días en el mes
	 */
	public static void printfCalendar(int start, int day_max) {
		System.out.println(
				"==================================================");
		 // Encabezado de salida
		 System.out.print ("Español  \t  \t  \t  \t  \t  \t  \n");
		
		 int day = 1; // número de días para imprimir
		month: for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				 // Al imprimir la primera línea, vacíe el espacio antes del inicio
				if (i == 0 && j < start) {
					System.out.print("\t");
					 // fuera del ciclo actual
					continue;
				}
				
				if (day > day_max) {
					System.out.println();
					break month;
				}
				System.out.print(day + "\t");
				day++;
			}
			 // Ajustar después de imprimir una línea
			System.out.println();
		} // for month
		System.out.println(
				"==================================================");
	}


}
