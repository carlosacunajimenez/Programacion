package trimestre2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class stringydate {
	public static void main(String [] args) throws ParseException {
		System.out.println("String parsing into Date Object : \n");
		String strDate1 = "12/01/2020";
		
		SimpleDateFormat strFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		
		java.util.Date dateObj1 = strFormat1.parse(strDate1);
		System.out.println(dateObj1);
		
		System.out.println("Date String 1 = " + strDate1 + "\t Date Object 1 = " + dateObj1);
		System.out.println("\n\nString parsing into integer : \n");
		String strVal1 = "50";
		
		int intValue1 = Integer.parseInt(strVal1);
		System.out.println(intValue1);
	}

}
