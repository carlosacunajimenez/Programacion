package Martes16;

public class tryCatchFinally {
	public static void main(String args[] ) {
		
	
	int a = 5, b = 0;
    try {
        int resultado = a / b;
        System.out.println(resultado);
    } catch (Exception e) {
        System.out.println("La aplicaci�n fall�");
    } finally {
        System.out.println("se cierran los recursos");
    }
    System.out.println("la aplicaci�n ha finalizado");
}
}


