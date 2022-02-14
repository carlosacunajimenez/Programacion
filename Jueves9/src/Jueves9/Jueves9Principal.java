package Jueves9;

import java.util.Scanner;

public class Jueves9Principal {
	public static void main(String [] args) {
		Jueves9 obj1 = new Jueves9();
		Scanner sc = new Scanner(System.in);
		System.out.println(String.format("El nombre de la persona es: %s su edad %d años y su altura %.2f metros", obj1.getNombre(), obj1.getEdad(), obj1.getAltura()));
		System.out.printf("El nombre de la persona es: %s su edad %d años y su altura %.2f metros \n", obj1.getNombre(), obj1.getEdad(), obj1.getAltura());
		System.out.println("Introduzca un nombre, edad y altura");
		String nombre2 = sc.next();
        int edad2 = sc.nextInt();
        double altura2 = sc.nextDouble();
        obj1.setAltura(altura2);
        obj1.setEdad(edad2);
        System.out.println(obj1.setNombre(nombre2));
        System.out.println(obj1.getEdad());
        System.out.println(obj1.getAltura());
        

}
}
