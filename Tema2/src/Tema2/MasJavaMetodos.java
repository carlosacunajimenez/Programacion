package Tema2;

public class MasJavaMetodos {
	public static String nombre = "Alicia";
	public static float altura = 1.7f;
	
	
	public static void main(String[] args) {
		decirNombre();
		for(int i=0; i<8; i++) {
			crecer();
		}
		encoger();

    }
	public static void decirNombre() {
		System.out.println("Mi nombre es " + nombre);
	}
	public static void crecer() {
		altura = ((altura*10)/100) + altura;
		if (altura>=3)
			System.out.println("Es demasiado alto");
		else System.out.println("Creciendo " + "altura actual: " + altura + " metros");
	}
	public static void encoger() {
		altura = altura - ((altura*10)/100);
		System.out.println("Encogiendo " + "Altura actual: " + altura + " metros");
	}
	public static void resetear() {
		altura = 1.70f;
		System.out.println("Reseteando " + altura);
	}
}