package Lunes29;

public class Lunes29 {
	private static String nameEmpresa;
	private static int Antiguedad;
	
	public void Lunes29(){ //esto es un metodo no un constructor
		nameEmpresa = "DAM Itep";
		Antiguedad = 5;
		System.out.println("Ejecutando Constructor");
		
	}
	public String getNombre() {
		System.out.println("Obteniendo Nombre");
		return nameEmpresa;
	}
	public int getAntiguedad() {
		System.out.println("Obteniendo Antiguedad");
		return Antiguedad;
	}
	public void setNombre(String varname) {
		nameEmpresa = varname;
	}
	public void setAntiguedad(int varAntiguedad) {
		Antiguedad = varAntiguedad;
	}

}
