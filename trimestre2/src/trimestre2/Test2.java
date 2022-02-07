package trimestre2;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
    	int Viajes[] = {23, 46, 520};
    	String ciudad[] = {"Sevilla", "Granada", "Madrid"};
    	int mayor = 0;
    	int result = 0;
    	int indice = 0;
    	
    	for(int i=0; i<Viajes.length;i++) {
    		if(Viajes[i]>mayor) {
    			mayor = Viajes[i];
    		}
    		result = mayor;
    	}
    	for(int i=0; i<Viajes.length;i++) {
    		if(Viajes[i] == result) {
    			i = indice;
    		}
    	}
    	
    	System.out.println("hola");
    	
    	
    	
    }
}