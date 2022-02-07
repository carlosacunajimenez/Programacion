package Figura;

import java.util.ArrayList;

public class Test extends Cuadrado{

	public static void main(String[] args) {
	Cuadrado c1 = new Cuadrado();
	Cuadrado c2 = new Cuadrado(5.00, 6.00);
	System.out.println(c1.area());
	System.out.println(c2.area());
	System.out.println(c1.lado1);
	System.out.println(c2.lado1);
    Figura f1 = c1;
    System.out.println(f1.lado);
    ArrayList<String> lista1 = new ArrayList<String>();
    ArrayList<Double> lista2 = new ArrayList<Double>();
    lista1.add("Luis");
    lista1.add("El mejor: carlos");
    lista1.add("Dan el casual");
    lista1.get(2);
    c1.arrayAreas(lista2);
    System.out.println(lista2.get(0)+ "," + lista2.get(1) + ","+ lista2.get(2));
    lista2.add(50.00);
	}
}
