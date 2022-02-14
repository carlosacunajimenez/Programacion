package test1;

public class concatenar_y_formatear {
	public static void main(String[] args) {
	
	String Nombre = "carlos";
	String apellido = "Acuña";
	int a = 30;
	float b= 20;
    char sexo = 'h';
	
	System.out.println(Nombre + " " + apellido);
	System.out.format("El valor de a es: \n", a);
	System.out.format("El valor de varF: %f", b);
	System.out.format("\nEl Alumno es: %c", sexo);
	
    
	

}
}
