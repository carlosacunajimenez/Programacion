package Tema3;

public class ClasePrincipal {

	public static String AlumnName;
	public static int AlumnNota;

	// constructor
	public ClasePrincipal() {
		AlumnName = "Carlos";
		AlumnNota = 8;

	}

	public static void main(String[] args) {

		ClaseSecundaria obj1 = new ClaseSecundaria();
		System.out.println(obj1.getSaludo());
		AlumnNota = 15;
		System.out.println(AlumnNota);

		ClasePrincipal obj2 = new ClasePrincipal();
		System.out.println(obj2.AlumnName); // esto es el arreglo

	}
	// no funciona el nombre de arriba porque habria que crear un objeto y en el
	// parametro añadirle los valores

}
