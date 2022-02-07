package trimestre2;

import java.text.NumberFormat;
import java.util.Locale;

public class FormateoEspañol {
	
	public static void main(String[] args) {
		Locale locale = new Locale ("en", "UK");
		NumberFormat objNF = NumberFormat.getInstance(locale);
		String cadena = objNF.format(999999.99);
		
		System.out.println("INGLATERRA");
		System.out.println("---------");
		System.out.println(cadena);   
		
		Locale locale2 = new Locale ("es", "ES");
		NumberFormat objNF2 = NumberFormat.getInstance(locale2);
		String cadena2 = objNF2.format(999999.99);
		System.out.println();
		
		System.out.println("España");
		System.out.println("-----------");
		System.out.println(cadena2);
	}

}
