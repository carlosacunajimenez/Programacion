package test1;

import java.text.NumberFormat;
import java.util.Locale;

public class MasFormateo {
	public static void main(String[] args) {
		Locale locale1 = new Locale ("en", "UK");
		//Locale es para controlar el formato de tu localidad
		NumberFormat objNF = NumberFormat.getInstance(locale1);
		//getinstance sirve para formatear locales
		String cadena = objNF.format(9999999.99);
		
		System.out.println("INGLATERRA");
		System.out.println("---------");
		System.out.println(cadena);
		
		//Localidad: España
		Locale locale2 = new Locale ("es", "ES");
		NumberFormat objNF2 = NumberFormat.getInstance(locale2);
		String cadena2 = objNF2.format(99999999.99);
		System.out.println();
		
		System.out.println("España");
		System.out.println("------");
		System.out.println(cadena2);
		//Alumno obj1 = new Alumno();
		//Alumno obj2 = new Alumno();
		//Alumno obj3 = new Alumno();
	}

}
