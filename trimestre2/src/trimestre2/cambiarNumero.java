package trimestre2;

import java.util.Scanner;

public class cambiarNumero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, m;
		System.out.println("Introduzca valor de N: ");
			N = sc.nextInt();
		System.out.println("Introduzca un valor de M: ");
		    m = sc.nextInt();
		    
		    //math.pow devuelve un número de tipo double
		    //es necesario convertilo a int para hacer la división entre enteros
		    
		    N = N / (int)Math.pow(10, m);
		    
		    System.out.println("Numero modificado " + N);
	}

}
