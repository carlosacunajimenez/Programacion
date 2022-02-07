package Tema2;

public class Java_Metodos {
	public static float altura = 1.80f;
	public static double peso = 70;
	public static int edad = 19;
	public static String trabajo = "detectiveleon";
	public static String nombre = "Antonio";
	public static void main(String[] args) {
		comprar();
		System.out.println("El nombre es: " + nombre);
		devolver();
		vender();
		comprar();
		//Siempre que creemos atributos fuera del main
	}
	public static void comprar() {
		System.out.println("Estoy comprando");

}
	public static void devolver() {
		System.out.println("Devolviendo producto");
	}
	public static void vender() {
		System.out.println("Estoy vendiendo");
	}
}
