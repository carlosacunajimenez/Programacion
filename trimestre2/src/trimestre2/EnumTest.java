package trimestre2;

import java.util.Scanner;

public class EnumTest {
	public static void main(String[] args) {
		System.out.println("Introduzca un día de la semana");
		Scanner sc = new Scanner(System.in);
		String dia = sc.next();
		
		System.out.println("Dia introducido: " + dia);
		
		DiaSemana diaS = DiaSemana.valueOf(dia.toUpperCase());
		
		//diasSemana diaS = DiasSemana.MIERCOLES;
		
		switch(diaS){
		case LUNES:
			System.out.println("Hay cole");
			break;
		case MARTES:
			System.out.println("Hay cole");
			break;
		case MIERCOLES:
			System.out.println("Hay cole");
			break;
		case JUEVES:
			System.out.println("Hay cole");
			break;
		case VIERNES:
			System.out.println("Hay cole");
			break;
		case SABADO:
			System.out.println("No hay cole");
			break;
		case DOMINGO:
			System.out.println("No hay cole");
		    break;
		    default:
		    	System.out.println("Fin programa");
		    	
		    	
		    	
		    	/*
		    	 * case LUNES:
		    	 * case MARTES:
		    	 * case MIERCOLES:
		    	 * case JUEVES:
		    	 * case VIERNES:
		    	 * System.out.println("es laboral");
		    	 * break;
		    	 * default:
		    	 * System.out.println("no es laboral");
		    	 */
		    
		}
		
	}

}
