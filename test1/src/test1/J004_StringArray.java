package test1;

public class J004_StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreAlumno = "Miguel Angel";
		System.out.println("Longitud: " + nombreAlumno.length());
		System.out.println("Comparar: " + nombreAlumno.equals("Juan"));
		System.out.println("Caracter: " + nombreAlumno.charAt(3));
		
		if(nombreAlumno.charAt(3) == 'u') {
			System.out.println("Comprobado!!");
		}
		boolean result = nombreAlumno.equals("juan");
		System.out.println(result);
		

	}

}
