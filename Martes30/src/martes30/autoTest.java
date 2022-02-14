package martes30;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

public class autoTest extends TestCase{
	public void testAssert() {
	String string1 = "Junit";
	String string2 = "Junit";
	String string3 = "test";
	String string4 = "test";
    String string5 = null;
    int variable1 = 1;
    int variable2 = 2;
    
    assertEquals(string1, string2);
    assertSame(string3, string4);
    assertNotSame(string1, string3);
    assertNotNull(string1);
    assertTrue(variable1<variable2);
    
}
}
