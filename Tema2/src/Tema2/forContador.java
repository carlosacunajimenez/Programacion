package Tema2;

public class forContador {
	public static void main(String args[]) {
		
		for (int i=0; i<=10; i++) {
			System.out.println("Bienvenidos a DAM");
		}
		
		
	
	for (int i=10; i>=0; i--) {
		System.out.println("Bienvenidos a DAM: " + i);
	}

	for (int i=0; i<=10; i+=2) {
		System.out.println("Bienvenidos a DAM: " + i);
	}

	
	for (int i=0; i<=10; i++) {
		System.out.println("Bienvenidos al curso de DAM " + i);
		if (i==3) {
			System.out.println("Test " + i);
			continue;	
		}
		System.out.println("Dentro " + i);
		if (i==5) {
			break;
		}
	}
	System.out.println("Has dejado el bucle for por el break");
	
	for (int i=0; i<=10; i++) {
		System.out.println("Bienvenidos " + i);
		//continue;
		if (i==5) {
			break;
		}
	}
}
	
}
