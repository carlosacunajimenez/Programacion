package testJavi;

import java.util.Scanner;

public class testJavi {
	public static void main(String[] args) {
	String provincia[] = {"Sevilla", "Cordoba", "Granada", "Cadiz", "Huelva", "Malaga", "Jaen", "Almeria"};
    int[] numero = new int [8];
    Scanner s = new Scanner(System.in);
    int sum = 0;

    int max = 0, min = 0, count = 0;

    int mayor = 0;
    int menor = 0;

    for (int i=0; i<numero.length; i++) {

        System.out.printf("Introduzca numero de casos %d: ", i+1);
        numero[i] = s.nextInt();
    }

    for(int l=0; l<numero.length; l++) {

        System.out.println(provincia[l] + " tiene " + numero[l] + " de casos por cada cien mil habitantes");
        sum += numero[l];
    }

    System.out.println("La provincia con mayor incidencia es: " + mayor);
    System.out.println("La provincia con menor incidencia es: " + menor);

    System.out.println("La media de casos de Andalucia es: " + (sum/numero.length));
}
}


