package BuenoPaquete;

import junit.framework.TestCase;

public class TestClasePrueba extends TestCase{
	//ctrl mayus t para abrir asistnetes
	
	private ClasePrueba clase1;
	//primero creamos la variables
	public void Escenario() {
		//aqui creamos el objeto
		clase1 = new ClasePrueba();
		
	}//IMPORTANTISIMO LAS T EN MINUSCULAS DE test
	public void testSumar() {
		Escenario();
		assertTrue(clase1.sumar(5, 3) == (5+3));
		
	}
	public void testSumar2() {
		Escenario();
		assertTrue(clase1.sumar(5, 3) ==8);
	}
	public void testMultiplicar() {
		Escenario();
		assertTrue(clase1.multiplicacion(5, 3) == 15);
	}
	public void testResta() {
		Escenario();
		assertTrue(clase1.resta(5, 3) == 2);
	}
	public void testDividir() {
		Escenario();
		assertTrue(clase1.division(6, 0) != 3);
		
		
		/* try {
		assertTrue(clase1.division(6, 0) == 2);
		}
		catch(Exception e) {
			System.out.println("Número no divisible por 0");
		}
		finally{
			System.out.println("Fin programa");
			
		} */
	}
	
	

}
