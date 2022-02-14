package martes30;

import java.util.ArrayList;

public class ArrayListsTest {
	public static void main(String[] args) {
		ArrayList xd = new ArrayList(); //esto es un arraylist
		xd.add("JaviCapullo");
		xd.add(1);
		xd.add("JAVIPARGUELON");
		System.out.println(xd.get(0));
		System.out.println(xd.contains("JaviCapullo"));
		System.out.println(xd.contains(2));
		xd.remove(1);
		xd.remove("JAVIPARGUELON");
		System.out.println(xd);
		
		String[] arraysPochos = new String [3]; //Esto es un array
		arraysPochos[0] = "JaviParguela";
		arraysPochos[1] = "XDLOL";
	    arraysPochos[2] = "JaviMariconaso";
	    System.out.println(arraysPochos[0]);
	}

}
