package martes30;

import junit.framework.TestCase;

public class martes30test extends TestCase{
	public void testObj() {
		martes30 obj1 = new martes30("LOL");
		assertEquals(obj1.getNombre(),"LOL"); //esto pregunta si se ha modificado el nombre del constructor
		
		
	}

}
