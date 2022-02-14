package TestHerencia;

public class TestClases extends Triangulo{
	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo(17, 22, "Estilo2");
		DosDimensiones d1 = new DosDimensiones();
		DosDimensiones d2 = new DosDimensiones(15, 10);
		System.out.println(t1.altura+ t1.base+ t1.estilo);
		System.out.println(t2.altura+ t2.base+ t2.estilo);
		System.out.println(d1.altura+ d1.base);
		System.out.println(d2.altura+ d2.base);
		
		
	}
	

}
