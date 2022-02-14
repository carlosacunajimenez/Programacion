package test1;

import java.text.DecimalFormat;

public class MasFormateoPOO {
	public static void main(String[] args) {
		String patron = "###, ###. ##";
		String patron2 = "(###)";
		String patron3 = "#,###,###.##";
		//creamos un nuevo objeto decimalFormat
		DecimalFormat objDf = new DecimalFormat (patron);
		//le añadimos el numero que queremos presentar con formato
		String cadena = objDf.format(99999999.99);
		//los presentamos en pantalla
		System.out.println(cadena);
	}

}
