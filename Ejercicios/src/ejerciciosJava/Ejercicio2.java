package ejerciciosJava;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main( String[] args ) {
	      int a, b, c = 0;
	      double z = 0;
	      double x = 0;
	      Scanner s = new Scanner( System.in );
	      System.out.println( "Introduce dos números: ");
	      a = s.nextInt();
	      b = s.nextInt();
	      c = a + b;
	      z = (c*10)/100;
	      x= c - z;
	      System.out.println( "La suma de a y b es: " + c );
	      System.out.println("El descuento del 10% sería: " + x);
	}

}
