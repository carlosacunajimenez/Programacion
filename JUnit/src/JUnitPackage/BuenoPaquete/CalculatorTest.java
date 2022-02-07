package BuenoPaquete;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
	Calculator calculator; //por defecto si no pones public es privado
	
	void Escenario() {
		calculator = new Calculator();
	}
	public void testSumar() {
		Escenario();
		assertEquals("Hello World","Hello World");
		System.out.println("this is the testcase in this class");
		String str1="this is the testcase in this class";
		assertEquals("this is the testcase in this class", str1);
		assertTrue(calculator.multiply(5, 3)==(5*3));
		assertEquals(15, calculator.multiply(5, 3));
		
		
	}

	

}
