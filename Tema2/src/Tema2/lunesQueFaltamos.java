package Tema2;
/**
 * 
 *
 * @author Alumno21-22-05
 *
 */

public class lunesQueFaltamos {
	   public static void main(String[] args) {

	        int edad = 18;
	        int edad2 = edad + 20;
	        String c�digo = "11550";
	        float altura = 1.78f;
	        char genero = 'H';
	        byte numerohijos = 3;
	        char talla = 'L';
	        String nombre = "Feder�ca";
	        Boolean MayorEdad = true;

	        System.out.println("Tu edad dentro de 20 a�os ser� " + edad2);

	        if (MayorEdad==true) {   //Para programas m�s avanzados, solo poner el booleano. Para decir que es distinto de la variable del booleano poner una exclamacion delante de la variable dentro del if
	            System.out.println("El usuario es mayor de edad, porque tiene " + edad + " a�os");
	        }else 
	            System.out.println("El usuario es menor de edad " + edad + " a�os");

	        for(int i=0; i<=(numerohijos-1); i++) {
	            System.out.println("Tiene " + (i+1) + " hijos");
	        }

	        while(genero=='H') {
	            System.out.println("El trabajador es Hombre ");
	            break; 
	        }
	    }

	}


