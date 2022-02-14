package InterfaceTest;

public class Test1Interface implements series {
	
	int iniciar;
	int valor;
	
	public Test1Interface() {
		iniciar = 0;
		valor = 0;
	}
	
	@Override
	public int getSiguiente() {
		valor +=2;
		
		return valor;
	}
	@Override
	public void reiniciar() {
		valor = iniciar;
		
	}
	@Override
	public void setComenzar(int x) {
		iniciar = x;
		valor = x;
		
	}
	
	public static void main(String[] args) {
		Test1Interface ob1 = new Test1Interface();
		for(int i=0; i<5;i++) {
			System.out.println("Siguiente valor es: " +ob1.getSiguiente());
			
			System.out.println("\nReiniciando");
			ob1.reiniciar();
			
			System.out.println("\nIniciando en 100");
			ob1.setComenzar(100);
			
			for(i=0; i<5;i++) {
				System.out.println("Siguiente valor es: "+ob1.getSiguiente());
				
			}
			System.out.println();
		}
	}

}
