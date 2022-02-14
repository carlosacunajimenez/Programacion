package test1;

public class J005_FormatearSalidaTextos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int varI = 20;
		int varII= 21;
		float varF = 2.5f;
		String varS = "Hola";
		char sexo = 'H';
		
		System.out.format("El valor de varI (%d) (%d) es: \n", varI, varII); //%d imprime un valor entero con signo se suele usar en enteros
		System.out.format("El valor de varF: %f", varF); //%f f para float
		System.out.println("\n");
		System.out.format("el valor de string: %s", varS); //%s para string
		System.out.format("El valor %n de varF: %f \n", varF);
		System.out.format("El valor en %% de string: %s", varS); //el % solo lo identifica omo un formato
		System.out.format("\nEl Alumno es: %c", sexo); // \n y %n es lo mismo en format

	}

}
