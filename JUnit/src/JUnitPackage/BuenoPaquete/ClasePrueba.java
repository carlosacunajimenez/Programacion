package BuenoPaquete;

public class ClasePrueba {
	
	public int sumar(int a, int b) {
		return a+b;
	}
   public int resta(int a, int b) {
	   return a-b;
   }
   public int multiplicacion(int a, int b) {
	   return a*b;
   }
   public int division(int a, int b) {
	  int result = 0;
	   try {
		    result = a/b;
	   }
	   catch(Exception e) {
		   System.out.println("No puede ser 0 el divisor");
	   } finally {
		   System.out.println("Fin programa");
	   }
	   return result; 
	   //result = a/b;
	  //return result; 
   }
  }
