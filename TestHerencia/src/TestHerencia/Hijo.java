package TestHerencia;

public class Hijo extends Padre{

	//public Hijo(String nombre, int edad) {
		//super(nombre, edad);
		// TODO Auto-generated constructor stub
		// * */
		 public Hijo() {
			 
	}
	
	public String getNombre() {
	 return nombre;
	}
	
	public static void main(String[] args) {
		Hijo hijo1 = new Hijo();
		System.out.println(hijo1.nombre);
		System.out.println(hijo1.getNombre());
		
	}

}
