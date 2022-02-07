package entorno;

public class Envoltorio {
	public static void main(String[] args) {
		int numPrimitive = 6;
		Integer numWrapper = Integer.valueOf(numPrimitive);
		System.out.println(numWrapper.getClass().getName() + " ¿Es un objeto? " + (numWrapper instanceof Object));
	}

}
