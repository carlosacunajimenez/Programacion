package test1;

public class J006_formatear {
	public static void main(String[] args) {
		
		double num = 999.235;
		
		System.out.printf(num + " = %.3f %n", num);
		System.out.printf(num + " = %.2f %n", num);
		System.out.printf(num + " = %.1f %n", num);
		System.out.printf(num + " = %.4f %n", num);
		
		//si añadimos un 9 antes del . en el .4f, .3f etc, creamos espacios por ejemplo %9.1f crea espacios, %18.1f aun más
		System.out.printf("PI = %0.2f, e = %6.4f %n", Math.PI, Math.E);
	
	}

}
