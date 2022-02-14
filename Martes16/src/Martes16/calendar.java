package Martes16;



import java.util.Calendar;
import java.util.Scanner;
 
public class calendar {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int date = 0; // almacena la semana n�mero 1 calculada despu�s del a�o y mes ingresados
		 int day_max = 0; // El n�mero de d�as en el mes donde se almacenan el a�o, mes y a�o ingresados
		
		 int year = 0; // se usa para guardar el a�o ingresado
		 int mes = 0; // usado para guardar el mes de entrada
		
		Scanner in = new Scanner(System.in);
		 System.out.print ("Ingrese el a�o:");
		year = in.nextInt();
		 System.out.print ("Ingrese el mes:");
		mes = in.nextInt();
		 System.out.println ("La fecha ingresada es:" + year + "-" + mes);
		in.close();
		
		 // Establezca el mes en el 1 del mes siguiente, y el d�a anterior, obtenga primero la cantidad de d�as en el mes actual
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, mes);
		calendar.set(Calendar.DATE, 1);
		
		calendar.add(Calendar.DATE, -1);
		day_max = calendar.get(Calendar.DATE);
		
		 // Establezca la hora en 1 nuevamente, que es el d�a de la semana, el domingo es 0, el lunes es 1, y as� sucesivamente
		calendar.add(Calendar.DATE, -(day_max - 1));
		date = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		
		System.out.println(calendar.getTime());
		printfCalendar(date, day_max);
	}
	
	/**
	  * Funci�n: imprimir un calendario
	  * @param start es el d�a de la semana el primero del mes
	  * @param day_max cuantos d�as en el mes
	 */
	public static void printfCalendar(int start, int day_max) {
		System.out.println(
				"==================================================");
		 // Encabezado de salida
		 System.out.print ("Espa�ol  \t  \t  \t  \t  \t  \t  \n");
		
		 int day = 1; // n�mero de d�as para imprimir
		month: for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				 // Al imprimir la primera l�nea, vac�e el espacio antes del inicio
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
			 // Ajustar despu�s de imprimir una l�nea
			System.out.println();
		} // for month
		System.out.println(
				"==================================================");
	}


}
