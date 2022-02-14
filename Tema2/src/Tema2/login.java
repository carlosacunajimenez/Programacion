package Tema2;

import java.util.Scanner;

public class login {
	public static void main(String[] args) {
	int x = 1234;
	int y = 3210;
	Scanner leer = new Scanner(System.in);
	System.out.println("Ingrese usuario: ");
	int uuid = leer.nextInt();
	System.out.println("Ingrese contraseña: ");
	int upwd = leer.nextInt();
	
	if(uuid == x) {
		if (upwd == y)
			System.out.println("Bienvenido usuario.");
		else
			System.out.println("Contraseña Equivocada");	
	}else
		System.out.println("ID equivocada");
	}

}
