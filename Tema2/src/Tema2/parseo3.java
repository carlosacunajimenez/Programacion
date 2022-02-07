package Tema2;

import java.util.Scanner; //si pones * importas todos: import java.util.*;

public class parseo3 {
	
	public static void main(String[] args) {
		// & and || or
		// Sistema login de usuario
		
		String x = "Carlos";
		String y = "1234";
		
		//crear un objeto
		//nombreClase nombreobj = new nombreClase();
		
		Scanner s = new Scanner(System.in);
		System.out.print("ingrese usuario:");
	    String leer = s.next();

	    System.out.print("Ingrese contraseña:");
	    String upwd = s.next();
	    // si ponemos !leer en el if quiere decir que pondremos distinto ej: !leer.equals(x)
	    if((leer.equals(x)) && (upwd.equals(y))) {
	        System.out.println("Bienvenido usuario.");
	    } else {
	            System.out.println("ID o constraseña equivocada");
	    }
	}
	
	}


