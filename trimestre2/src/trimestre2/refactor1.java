package trimestre2;

public class refactor1 {
	
	public static void main(String[] args) {
		int val1 = 5;
		int val2 = 7;
		int result = 0;
		String resultadoLOLTexto;
		if (val2 >= val1) {
			result = val2;
		}else {
			result = val1;
		}
		System.out.println("Valor final:" + result);
		
		result = (val2 >= val1) ? val2 : val1;
		//si se cumple la primera condicion se guarda en val2, si no en val1
		System.out.println(result);
		
		extracted(val1, val2);
		 
		//doble click a una variable, click derecho, refactor, rename
		//el operador ternario ?: en Java
	}

	private static void extracted(int val1, int val2) {
		String resultadoLOLTexto;
		resultadoLOLTexto = (val2 >= val1) ? "hola" : "adios";
		
		System.out.println(resultadoLOLTexto);
		
		//coges el cogido entero, lo subrayas, refactor, extract method y te extrae el metod en otro lado
	}

}
