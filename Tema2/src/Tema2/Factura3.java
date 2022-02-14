package Tema2;
/**
 *  @author carlos xd importante lo del author para documentación
 */
import java.util.Scanner;

public class Factura3 {
	public static Scanner s = new Scanner(System.in);
	public static Scanner s1 = new Scanner(System.in);
	public static float iva = 1.21f;
	public static float precioTotal = 0;
	public static float precio1 = 0;
	public static float productos = 0;
     public static void main(String[] args) {
    	 suma();
    	 
    	 
   
    	
     }
     public static void suma() {
    	    System.out.println("Cuantos productos son: ");
    	    productos = s.nextFloat();
    	for (int i=0; i <= (productos-1); i++) {
    		System.out.println("Digame el precio del producto");
    	    float precio1 = s1.nextFloat();
    	    precioTotal = precioTotal + precio1;
    	}
    	System.out.println(precioTotal);
    	    
    	    
    	
     }
     
    	
}

