package EjercicioCasa;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCovid extends Covid {
	
	public static void main(String[] args) {
		int a = 1;
		ArrayList<String> provincia = new ArrayList<String>();
		ArrayList<Double> incidencias = new ArrayList<Double>();
		Covid c1 = new Covid();
		c1.IntroducirProvincia("Sevilla", provincia);
		c1.IntroducirProvincia("Granada", provincia);
		c1.IntroducirProvincia("Córdoba", provincia);
		c1.IntroducirIncidencias(60.00, incidencias);
		c1.IntroducirIncidencias(80.00, incidencias);
		c1.IntroducirIncidencias(40.00, incidencias);
		c1.mostrarProvinciaEIncidencia(provincia, incidencias);
		System.out.println(c1.HacerMedia(incidencias));
		c1.CalcularMaxima(incidencias, provincia);
		c1.CalcularMinima(incidencias, provincia);
		
		do{
			System.out.println("Introduzca 1 para añadir una provincia y su correspondiente incidencia, 2 para mostrarlo, 3 para la media"
					+ " 4 para máximos y mínimos");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			switch(a) {
			case 1:
				System.out.println("Introduzca una ciudad");
				String ciudadNueva = sc.next();
				System.out.println("Introduzca una incidencia");
				Double incidenciaNueva = sc.nextDouble();
				c1.IntroducirProvincia(ciudadNueva, provincia);
				c1.IntroducirIncidencias(incidenciaNueva, incidencias);
				a = 5;
				break;
			case 2:
				c1.mostrarProvinciaEIncidencia(provincia, incidencias);
				a = 5;
				break;
			case 3:
				System.out.println(c1.HacerMedia(incidencias));
				a = 5;
				break;
			case 4: 	
			    c1.CalcularMaxima(incidencias, provincia);
			    c1.CalcularMinima(incidencias, provincia);
			    a = 5;
			    break;
			case 5:
				System.out.println("Introduzca 1 para añadir una provincia y su correspondiente incidencia, 2 para mostrarlo, 3 para la media"
						+ " 4 para máximos y mínimos y 0 para acabar");
				a = sc.nextInt();
			default:
				System.out.println("Fin del programa");
				
			}
			
		}while(a != 0);
		
		  
	}
	

}
