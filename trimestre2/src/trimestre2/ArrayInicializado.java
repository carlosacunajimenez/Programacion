package trimestre2;

public class ArrayInicializado {
	
	public static void main(String[] args) {
		int numero[] = {23, 46, 520, 8, 15, 12};
		for(int i=0; i<=5; i++) {
			System.out.println(numero[i]);
			
			//String provincia[] = { "huelva", "cadiz", "sevilla" }
			//if (numero[i] >= 500) {
			//System.out.println("Alerta covid");
			//System.out.println(provincia[i]);
		}
		for (int elemento: numero)
			System.out.println(elemento);
		
	int suma = 0;
	for(int i=0; i<numero.length; i++) {
		suma += numero[i];
		System.out.println(numero[i]);
	}
	System.out.println(suma/numero.length);
	}
}

