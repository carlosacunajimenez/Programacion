package Tema2;

public class Factura {
	public static double importe = 0.0;
	public static double totalFactura = 0.0;
	
	public static void main(String args []) {
		sumarImporte();

		
		
	}
	public static void sumarImporte() {
		totalFactura = totalFactura + importe;
		System.out.println("La suma del importe es " + totalFactura);
	}
}
