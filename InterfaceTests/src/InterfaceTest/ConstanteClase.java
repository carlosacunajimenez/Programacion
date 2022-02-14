package InterfaceTest;

public class ConstanteClase implements Constante{
	public static void main(String[] args) {
		int numero[] = new int[10];
		
		
		for(int i=MIN; i<=10; i++) {
			if (i>=MAX) {
				System.out.println(MSJERROR);
			} else {
				numero[i] = 1;
				System.out.println(numero[i] + "");
			}
		}
		
	}
	

}
