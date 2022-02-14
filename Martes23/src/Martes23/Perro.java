package Martes23;
//ctrl shift r busca recursos

//ctrl mayus t busca tipos

public class Perro {
	String nombre;
	String raza;
	String colorpiel;
	int numPatas;
	int peso;

	public static void main(String[] args) {
		Perro perro3 = new Perro("jack");
		System.out.println(perro3.nombre);

		Perro perro4 = new Perro("JackDaniel", "Pastol Aleman");
		System.out.println(perro4.nombre);
		System.out.println(perro4.raza);

	}

	// constructor
	public Perro() {
		nombre = "Jaki";
		raza = "pitbull";
		colorpiel = "negro";
		numPatas = 4;
		peso = 10;

	}

	public Perro(String newName, String newRaza) { // sobrecarga mismo nombre distinto parametros
		nombre = newName;
		raza = newRaza;
	}

	public Perro(String newName) {
		nombre = newName;

	}

	// metodos o procedimintos
	public void funcLadrar() {
		System.out.println("Soy un perro y ladro");
	}

	public void funcComer() {

		System.out.println("Soy un perro y me gusta comer");
	}

	public void funcBeber() {

		System.out.println("Soy un perro y me gusta beber");
	}

	public void funcEnsuciar() {

		System.out.println("Soy un perro y ensucio" + "");
	}

}
