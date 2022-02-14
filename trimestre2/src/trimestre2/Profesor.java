package trimestre2;

public class Profesor extends Persona{
	private String IdProfesor;
	
	public Profesor(String nombre, String apellidos, int edad) {
		super(nombre, apellidos, edad);//ejecuta el constructor del padre
		IdProfesor="Unknown";
	}
	public void setIdProfesor (String IdProfesor) {
		this.IdProfesor = IdProfesor;
	}
	public String getIdProfesor() {
		return IdProfesor;
	}
	public void mostrarNombreApellidosYCarnet() {
		System.out.println("Nombre de profesor: " + getNombre() + " " + getApellidos() + " con Id de profesor: " + getIdProfesor() );
		
	}

}
