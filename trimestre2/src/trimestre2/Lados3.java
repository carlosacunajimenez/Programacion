package trimestre2;
class Triangulo extends dosDimensiones{
	String estilo;
	
	double area() {
		return base*altura/2;
	}
	void mostrarEstilo() {
		System.out.println("Triangulo es: " + estilo);
	}
}

public class Lados3 {
	public static void main(String[] args) {
Triangulo t1 = new Triangulo();
Triangulo t2 = new Triangulo();

t1.base=4.0;
t1.altura=4.0;
t1.estilo="Estilo 1";
t2.base=5.0;
t2.altura=7.0;
t2.estilo="Estilo 2";
System.out.println("Información t1: ");
t1.mostrarEstilo();
t1.MostrarDimension();
System.out.println("Su área es: " + t1.area());
System.out.println("Información t2: ");
t2.mostrarEstilo();
t2.MostrarDimension();
System.out.println("Su área es: " + t2.area());

	}

}
