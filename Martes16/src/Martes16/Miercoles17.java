package Martes16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Miercoles17 {
	public static void main(String[] args) throws ParseException{
		
	
	Date fecha1 = new Date();
	
	Date fecha2 = new Date(2020,01,01,12,0,0);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Date fecha3 = sdf.parse("31/12/2021");
	
	System.out.println(fecha3);
}
}