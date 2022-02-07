package trimestre2;

enum Color {
	ROJO,VERDE,AZUL;
	
}

public class MasRefactor {
	public static void main(String[] args) {
		//Color arr[] = Color.values();
		
		String car = "fiat";
		String cars[] = {"Volvo", "Fiat", "Renault"};
		
		System.out.println(cars[0]);
		
		for(int i=0; i<=2; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("Tamaño Array: " + cars.length);
		
		for(int i=0; i<cars.length;i++) {
			System.out.println(cars[i]) ;
			
		}
		
		for (String i : cars) {
			System.out.println(i);
		}
		
		
		
	
	}

}
