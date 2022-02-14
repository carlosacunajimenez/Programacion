package martes30;

public class PersonaTernaria {
	String nombre;
	int edad;
	String apellido; 
	public PersonaTernaria() {
		nombre = "Jose";
		edad = 24;
		apellido = "Pepito"; 
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getApellido() {
		return apellido;
	}
	public void setNombre(String nombre1) {
		nombre = nombre1;
	}
	public void setEdad(int edad1) {
		edad = edad1;
	}
	public void setApellido(String apellido1) {
		apellido=apellido1;
	}

}


