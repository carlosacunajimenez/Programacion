package trimestre2;

public class Test3 {
	public static void main(String[] args) {
		
	
	int viajes[] = {23, 46, 520};
	String ciudad[] = {"Sevilla", "Madrid", "Granada"};
	int mayor = 0;
	int indice = 0;
	for(int i=0; i<viajes.length;i++) {
		if(mayor<viajes[i]) {
			mayor=viajes[i];
		}
		
	}
	for(int i=0; i<viajes.length;i++) {
		if(mayor==viajes[i]) {
			indice = i;
		}
	}
	System.out.println(ciudad[indice] + viajes[indice]);
	}
}
