package ArraysBi;

import java.util.Scanner;

public class ArraysBidimensionales1 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			char opcion;
			int i, j;
			int [][] numeros = new int [3][5];
			   int min = 50;
			   int max = 100;
			        
			      //Generate random int value from 50 to 100 
			      System.out.println("Random value in int from "+min+" to "+max+ ":");
			      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			      
			do {
				System.out.printf("\n>>>MENU OPCIONES<<<");
				System.out.printf("\n1. Mostrar números de la matriz.");
				System.out.printf("\n2. Asignar números aleatorios a la matriz.");
				System.out.printf("\n3. Inicializar la matriz a ceros.");
				System.out.printf("\n4. Salir");
				do {
				System.out.printf("\nIntroduzca opción (1-4): ");
				opcion = sc.next().charAt(0);
				} while(opcion < '1' || opcion > '4');
				
				System.out.printf("\n");
				
				switch(opcion) {
				case '1':
						for(i=0;i<3;i++) {
							for(j=0; j<5;j++) {
								System.out.print(numeros[i][j]);
							}
							System.out.printf("\n");
						}
					break;
				case '2':
					for(i=0;i<3;i++) {
						for(j=0; j<5; j++) {
							numeros[i][j] = random();
							System.out.print(numeros[i][j] + "\t");
						}
						System.out.printf("\n");
						
						
					}
					
					break;
				case '3':
					for(i=0;i<3;i++) {
						for(j=0; j<5; j++) {
							numeros[i][j] = 0;
							System.out.print(numeros[i][j] + "\t");
						}
						System.out.printf("\n");
					}
					break;
				case '4':
					System.out.println("Fin del programa");
					opcion = '4';
					break;
				}
			}while(opcion!='4');
		}
		public static int random() {
			   int min = 50;
			   int max = 100;
			        
			
			      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			      return random_int;
			
		}
	}


