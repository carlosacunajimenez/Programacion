package Persona;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
public static void main(String [] args) {
	Adulto a1 = new Adulto();
	Adulto a2 = new Adulto("Luis", 20);
	Adulto a3 = new Adulto(5);
	System.out.println(a1.nombre);
	System.out.println(a1.edad);
	System.out.println(a2.nombre);
	System.out.println(a2.edad);
	System.out.println(a3.nombre);
	System.out.println(a3.edad);
	ArrayList<Integer> xd1 = new ArrayList<Integer>(Arrays.asList(1,2,3,6,7));
	ArrayList<String> xd = new ArrayList<String>(Arrays.asList("Pepe", "Luis", "El del juego del calamar"));
    xd.add("luis");
    xd.add("Jose");
    xd.add("Pepe");
    //System.out.println(xd.toString());
    //System.out.println(xd1.toString());
}
}
