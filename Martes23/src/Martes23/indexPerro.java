package Martes23;
//ctrl mayus o borra librerias que no se esten usando
//ctrl mayus f formatea
//alt mayus a sirve para seleccionar
// ctrl 1 sugerencias
public class indexPerro {
	public static void main(String[] args) {
		Perro perro1 = new Perro();
		perro1.funcLadrar();
		perro1.funcComer();
		perro1.funcComer();
		perro1.funcBeber();
		perro1.funcEnsuciar();
		
		
		Perro perro2 = new Perro();
		perro2.nombre = "lucas";
	    perro2.funcBeber();
	    perro2.numPatas = 3;
	    System.out.println("Nombre: "+ perro2.nombre);
	    System.out.println(perro2.numPatas);
	    perro1.funcLadrar();
	    perro2.funcLadrar();
	    
	    Perro perro3 = new Perro("jack");
	    System.out.println(perro3.nombre);
	}

}
