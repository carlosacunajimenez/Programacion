package Figura;

import java.util.ArrayList;
import java.util.Scanner;

public class Cuadrado implements Figura{
	public Double lado2 = 2.00;
	public Double lado1 = 4.00;
	public Cuadrado() {
	
	}
	public Cuadrado(Double lado3, Double lado4) {
	this.lado1 = lado3;
	this.lado2 = lado4;
		
	}
	

	public double area() {
		double area;
		area = lado2*lado1;
		return area;
	}
	public void setLado1(Double nuevoLado) {
		lado1 = nuevoLado;
	}
	public void setLado2(Double nuevoLado1) {
		lado2 = nuevoLado1;
	}

	public ArrayList<Double> arrayAreas(ArrayList<Double> sumas) {
		double area1 = 0.00;
		System.out.println("Introduzca el numero de areas que va a introducir");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		for(int i=0; i<numero; i++) {
			System.out.println("Introduzca el valor del area");
			double valor = sc.nextDouble();
			sumas.add(valor);
		}
		
		return sumas;
	}

}
