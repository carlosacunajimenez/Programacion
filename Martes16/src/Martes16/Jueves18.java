package Martes16;

public class Jueves18 {
	  public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        imprimirTablaUnidimenesional();
	        imprimirTablaBidimensional();
	    }

	    public static void imprimirTablaUnidimenesional() {
	        // una sola coordenada
	         System.out.println("=========================================================");
	         System.out.println("==========TABLAUNIDIMENSIONAL===========================");
	         System.out.println("=========================================================");
	         int tablanum = 7;// Casillas a imprimir
	         int valueToShow = 1;
	         for (int i = 0; i < tablanum; i++) {
	         System.out.print(valueToShow + "\t");
	         valueToShow++;
	    }
	     System.out.println();
	    System.out.println("==========================================================");
	     System.out.println("==========================================================");

	     }

	    public static void imprimirTablaBidimensional() {
	        System.out.println("=========================================================");
	        System.out.println("==========TABLA BIDIMENSIONAL===========================");
	        System.out.println("=========================================================");

	        int tablanum = 7;
	        int filasnum = 4;
	        int valueToShow = 1;
	        int contador = 0;
	        for (int x = 0; x < tablanum; x++) {
	            for (int y = 0; y < filasnum; y++) {
	                System.out.print(valueToShow + "\t");
	                valueToShow++;
	                contador++;
	                if (contador == 7) {
	                    System.out.println("");
	                    contador = 0;
	                }
	            }
	        }
	    }
	}