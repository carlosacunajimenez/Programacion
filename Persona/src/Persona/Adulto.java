package Persona;

public class Adulto extends PersonaClase{
	String nombre = "jose";
	//int edad = 87;
	Adulto(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		
	}
	Adulto(){
		 super();
	}
	Adulto(int edad){
		this.nombre = super.nombre;
		this.edad = edad;
	}

}
