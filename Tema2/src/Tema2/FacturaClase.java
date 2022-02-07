package Tema2;

public class FacturaClase {
	public static void main(String[] args) {
		float factura = 100f;
		float descuento = 0.10f;
		float iva = 0.21f;
		float totalFactura = 0.0f;
		
		totalFactura = factura - (factura * descuento);
		System.out.println("Descuento: " + totalFactura);
		
		totalFactura = totalFactura + (totalFactura * iva);
		System.out.println("Precio final: " + totalFactura);
	}

}
