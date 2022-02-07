package Tema2;

public class Factura2 {
	    public static double importe = 5.0;
		public static double totalFactura = 0.0;
		
		public static void main(String args []) {
			for (int i=0; i<=5; i++)
			sumarImporte();
			imprimirFactura();

			
			
		}
		public static void sumarImporte() {
			//totalFactura = 0.0f; si hacemos estos reiniciamos continuamente el sumarImporte(), si no lo ponemos se acumularía normal
			totalFactura = totalFactura + importe;
			
			
		}
		public static void imprimirFactura() {
			System.out.println("El importe es " + totalFactura);
		}
	}



