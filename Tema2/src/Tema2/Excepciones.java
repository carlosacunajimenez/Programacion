package Tema2;

public class Excepciones {
	public static void main(String[] args) {
		
		// System.out.println(5/0); esto da error 
		
		try {
			int num = 5;
			int result = num/0;
			System.out.println(result);
		
		} catch (Exception e) {
			System.out.println("Algo ha ido mal");
		}






	int a = 5;
	int b = 0;
	try {
		int resultado= a/b;
		System.out.println(resultado);
	} catch (Exception e) {
		System.out.println("La aplicación falló");
		
	} finally {
		System.out.println("Se cierran los recursos");
	}
	System.out.println("La aplicación ha finalizado");
}
}
