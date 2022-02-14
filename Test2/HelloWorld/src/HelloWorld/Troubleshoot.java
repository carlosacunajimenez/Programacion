package HelloWorld;

import java.util.Scanner;

public class Troubleshoot {

	public static void main(String[] args) {
		int a = 1;
		int respuesta1;
		Scanner scanner = new Scanner (System.in);
		do { 
			switch(a){ 
				case 1:
					System.out.println("Le da respuesta el CMD (conteste con 1 si es así y 0 si es negativo)");
					 respuesta1 = scanner.nextInt();
					 if(excepcionCutre(respuesta1, a)) {
					 if(respuesta1== 1) {
					a = a+1;
					
					 }
					
						
					}
						break;
				case 2:
					System.out.println("¿Ha instalado usted el JDK de java? (conteste con 1 si es así y 0 si es negativo)");
					 respuesta1 = scanner.nextInt();
					 if(excepcionCutre(respuesta1, a)) {
					 if(respuesta1 ==1) {
						 a = a+1;
					 } else {
						 a = a-1;
					 }
					 }
					break;
				case 3:
					System.out.println("¿Ha instalado usted el SDK de Java? (conteste con 1 si es así y 0 si es negativo)");
					 respuesta1 = scanner.nextInt();
					 if(excepcionCutre(respuesta1, a)) {
					 if(respuesta1 ==1) {
						 a = a+1;
					 } else {
						 a = a-1;
					 }
					 }
					 break;
				case 4:
					System.out.println("¿Ha instalado usted el JRE de java? (conteste con 1 si es así y 0 si es negativo)");
					 respuesta1 = scanner.nextInt();
					 if(excepcionCutre(respuesta1, a)) {
					 if(respuesta1 ==1) {
						 a = a+1;
					 } else {
						 a = a-1;
					 }
					 }
					 break;
				 case 5:
					System.out.println("¿Ha instalado usted algún IDE de java? (conteste con O si es Oracle, 1 si es netBeans y 2 si es Netbeans y Oracle)");
					 respuesta1 = scanner.nextInt();
					 if(excepcionCutre(respuesta1, a)) {
					 if(respuesta1 == 0) {
						 System.out.println("Instale NetBeans y vuelva a ejecutar este programa");
						 
					 } else if(respuesta1 == 1){
						System.out.println("Instale Oracle y vuelva a ejecutar este programa");
					 } else if(respuesta1 == 2) {
						 a = a+1;
					 }
					 }
					 break;
					 
			} 
			
		} while(a != 6);
		System.out.println("¡HAS INSTALADO CORRECTAMENTE JAVA!");
	}
		
		public static boolean excepcionCutre(int result, int step) {
			if(result == 0) {
				return true;
			} else if (result == 1) {
				return true;
			} else if (result == 2 || step == 5) {
				return true;
				
			} else {
				System.out.println("Inserte un valor correcto");
			
				return false;
			}
		}
			
			
		
	
	
		
		
	}
	



