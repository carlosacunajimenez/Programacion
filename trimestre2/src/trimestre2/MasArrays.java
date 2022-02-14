package trimestre2;

import java.util.Scanner;

public class MasArrays {
	public static void main(String[] args) {
		int[] numeros = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<numeros.length; i++) {
			System.out.printf("Introduzca número %d: ",i+1);
			numeros[i] = sc.nextInt();
		}
			for(int i=0; i<numeros.length; i++) {
				System.out.println(numeros[i]);
			}
			
		}
	}


