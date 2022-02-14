package Tema2;

public class parseo {
	public static void main(String[] args) {
		int a1 = 5;
		int b1 = 7;
		double c1 = 20.5;
		
		c1 = a1; //conversion implicita
		System.out.println("x");
		
		a1 = (int)c1;
		
		String s = "7"; //conversion explicita o casting
		b1 = Integer.parseInt(s);
		c1 = Double.parseDouble(s);
		System.out.println(b1);
		int c = b1 + 2;
		System.out.println(c);
		
		//byte => short, int, long, float o double
		//short => int, long, float o double
		//int => long, float o double
		//long => float o double
		//float => double
				
		int longitud=3; //float longitud = 3.0f
		float espacio = 5.0f, expresion; //float no cabe en int //int espacio = 5, expresion;
		expresion = longitud;
		expresion = espacio * longitud;
		System.out.print("Conversión: " + expresion);
		System.out.print("\n"); //si cambiamos los datos peta
		
		char letra1='a', letra2;
		int codigoAscii1, codigoAscii2;
		codigoAscii1 = (int) letra1;
		System.out.println("El código ASCII de la letra a es: " + codigoAscii1);
		
		codigoAscii2 = 97;
		letra2 = (char) codigoAscii2;
		System.out.println("El codigo Ascii 98 es de la letra: "+ letra2);
		
		/**
		 * postfijos i++, i--
		 * unarios ++i, --i
		 * Multi/Divi *, /, %
		 * Suma/Resta +, -
		 * Relaciones ==, !=
		 * AND &&
		 * OR ||
		 * Asignacion =
		 * 
		 * 
		 * Se puede romper usando () en las operaciones 
		 * ya que se calcularan de dentro hacia afuera
		 * 
		 * 
		 */
		
	}
  
}
