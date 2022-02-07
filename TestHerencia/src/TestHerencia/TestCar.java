package TestHerencia;

public class TestCar {
	public static void main(String[] args) {
		Car coche1 = new Car();
		Vehiculo vehiculo1 = new Vehiculo();
		coche1.display();
	    System.out.println(coche1.maxSpeed);
	    System.out.println(vehiculo1.maxSpeed);
	    System.out.println(coche1.nombre);
	}

}
