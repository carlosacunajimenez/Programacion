package martes30;

public class personaSecundaria {
	String nombre;
	int edad;
	String apellido;
	public personaSecundaria() {
		nombre = "Carlos";
		edad = 25;
		apellido = "Acu�a"; 
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
	public String despedirse() {
		return "Adi�s, Caballero";
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
