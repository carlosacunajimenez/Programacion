package Lunes29;

public class Lunes29_IndexClass {
	public static void main(String[] args) {
		Lunes29 obj1 = new Lunes29();
		System.out.println(obj1.getNombre());
		System.out.println(obj1.getAntiguedad());
		obj1.Lunes29(); //esto al no ser un constructor por el void hay que invocarla mientras que el constructor se autoejecuta siempre
		System.out.println(obj1.getNombre());
		System.out.println(obj1.getAntiguedad());
		obj1.setNombre("xd");
		System.out.println(obj1.getNombre());
		obj1.setAntiguedad(2);
		System.out.println(obj1.getAntiguedad());
	}

}
