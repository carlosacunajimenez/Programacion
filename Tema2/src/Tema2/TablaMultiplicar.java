package Tema2;
/**
 *  @author Alumno21-22-05
 */

import java.util.Scanner;

public class TablaMultiplicar {
	public static void main(String args[] ) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un numero para la tabla de multiplicar");
        int tablaMultiplicar = s.nextInt();
		for(int i=0; i<=9; i++) {
			System.out.println("La tabla de multiplicar del " + tablaMultiplicar + " Sería: " + tablaMultiplicar + " * "
		+ i + " = " + (i*tablaMultiplicar));
			
			if(i==9)
				System.out.println("La tabla de multiplicar del " + tablaMultiplicar + " Sería: " + tablaMultiplicar + " * "
						+ (i+1) + " = " + ((i+1)*tablaMultiplicar) + "\n");
		
	}
		int i = 0;
		while (i <=10) {
			System.out.println("La tabla de multiplicar del " + tablaMultiplicar + " Sería: " + tablaMultiplicar + " * "
		+ i + " = " + (i*tablaMultiplicar));
			i++;
			if(i==9)
				System.out.println("La tabla de multiplicar del " + tablaMultiplicar + " Sería: " + tablaMultiplicar + " * "
						+ (i+1) + " = " + ((i+1)*tablaMultiplicar) + "\n");

}

	for(int i1=10; i1>=0; i1--) {
		System.out.println("La tabla de multiplicar del " + tablaMultiplicar + " Sería: " + tablaMultiplicar + " * "
				+ i1 + " = " + (i1*tablaMultiplicar));
		
	}
}
}
