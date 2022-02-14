package martes30;

public class PersonaFin {
	public static void main(String [] args) {
		personaSecundaria obj1 = new personaSecundaria();
		PersonaTernaria obj2 = new PersonaTernaria();
		System.out.println("Hola soy " + obj1.getNombre());
		System.out.println("Hola, que tal, yo soy "+ obj2.getNombre() + " " + obj2.getApellido());
		System.out.println("Pues yo tengo: " + obj1.getEdad() + " ¿y tú?");
		System.out.println("Yo tengo " + obj2.getEdad());
		System.out.println(obj1.despedirse());
	}

}
