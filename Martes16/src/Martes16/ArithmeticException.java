package Martes16;

public class ArithmeticException {
	public static void main(String[] args) {
		int a=5;
		int b=0;
		
		try {
		int result = a/b;	
		} catch (Exception e) {
			System.out.println("La aplicaci�n ha fallado");
		}
		
		System.out.println("Aplicaci�n Finalizada");
		
	}

}
