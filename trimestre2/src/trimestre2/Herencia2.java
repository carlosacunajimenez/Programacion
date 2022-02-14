package trimestre2;
class Abuelo{
	public String ojos;
	public String piel;
	public String cabello;
	
	Abuelo(){
		ojos = "castaño";
		cabello = "negro";
		piel = "blanca";
	}
}
class Padre extends Abuelo{
	public float altura;
	public String constitucion_fisica;
	Padre(){
		super();//super al padre
		this.altura = 1.8f;//this SOLO para dentro de la clase
		constitucion_fisica = "Fuerte";
	}
}
class Hijo extends Padre{
	public int edad;
	public String nombre;
	
Hijo (int edad1, String nombre1) {
		super();
		this.edad = edad1;
		this.nombre = nombre1;
	}
public void mostrarDatos() {
	System.out.println("Nombre: "+ nombre);
	System.out.println("Edad: " + edad);
	System.out.println("Altura: " + altura);
	System.out.println("Físico: " + constitucion_fisica);
	System.out.println("Ojos: " + ojos);
	System.out.println("Piel: " + piel);
	System.out.println("Cabello: "+ cabello);
}
}
public class Herencia2 {
	
	public static void main(String[] args) {
		Hijo xd = new Hijo(21,"Carlos");
		xd.mostrarDatos();
		
	}

}
