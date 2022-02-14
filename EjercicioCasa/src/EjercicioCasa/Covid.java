package EjercicioCasa;

import java.util.ArrayList;
import java.util.Arrays;

public class Covid {
	
	
	public Covid(){
	
	}
	
	public void IntroducirProvincia(String ciudad, ArrayList<String> provincia1) {
		provincia1.add(ciudad);
		
	}
	public void IntroducirIncidencias(Double incidencias, ArrayList<Double> incidencias1) {
		incidencias1.add(incidencias);
		
	}
	public void mostrarProvinciaEIncidencia(ArrayList<String> provincia1, ArrayList<Double> incidencias1) {
		System.out.println(Arrays.toString(provincia1.toArray()));
		System.out.println(Arrays.toString(incidencias1.toArray()));
		
	}
	public Double HacerMedia(ArrayList<Double> incidencias1) {
		   int i = 0;
		   Double sum=0.00;
	        while(i < incidencias1.size()) {
	            sum += incidencias1.get(i);
	            i++;
	        }
	        double media = sum/incidencias1.size();
	        return media;
	}
	public void CalcularMaxima(ArrayList<Double> incidencias1, ArrayList<String> provincia1) {
		int i = 0;
		int indice = 0;
		Double mayor = 0.00;
		for(i=0; i < incidencias1.size();i++) {
			if(incidencias1.get(i)>mayor) {
				mayor = incidencias1.get(i);
			}
			}
		for(i=0; i<incidencias1.size(); i++) {
			if(incidencias1.get(i) == mayor) {
				indice = i;
			}
		}
		System.out.println("La provincia con más covid es: "
		+ provincia1.get(indice) + " y el número de incidencias es de: " + incidencias1.get(indice));
	}
	public void CalcularMinima(ArrayList<Double> incidencias1, ArrayList<String> provincia1) {
		int i = 0;
		int indice = 0;
		Double menor = 100.00;
		for(i=0; i < incidencias1.size();i++) {
			if(incidencias1.get(i)<menor) {
				menor = incidencias1.get(i);
			}
			}
		for(i=0; i<incidencias1.size(); i++) {
			if(incidencias1.get(i) == menor) {
				indice = i;
			}
		}
		
		System.out.println("La provincia con menos covid es: "
		+ provincia1.get(indice) + " y el número de incidencias es de: " + incidencias1.get(indice));
	}

	

}
