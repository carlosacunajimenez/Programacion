package Lunes15;

public class lunes {
	
	public static int contador = 0;
public static void main(String[] args) {
	int num = 5;
	int num2 = 10;
	int y = 0;
	//imprimirNumero(num);
	//imprimirNumero(5, 10);
	//saludar();
	//y = introducirEnteros(5);
	//System.out.println(y);
	//sumaNumeros(num, num2);
	//sumaContador(num);
	y = introducirEnteros(5);
	System.out.println(y);
	
	
	
}
public static void imprimirNumero(int n) {
	System.out.println("El número es " + n);
}
public static void saludar() {
	System.out.println("Hola");
}
public static void imprimirNumero(int n, int m) {
	System.out.println("El numero es " + (n+m));
}
public static int introducirEnteros(int x) {
	int num = 5 * x;
	return num;
}
public static int sumaNumeros (int a, int b) {
	int suma=0; suma=a+b;
	return suma;
}
public static int sumaContador(int x) {
	contador += x;
	return contador;
}
}
