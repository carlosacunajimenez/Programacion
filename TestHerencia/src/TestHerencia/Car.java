package TestHerencia;

public class Car extends Vehiculo{
   public int maxSpeed = 180;
   public String nombre = "";
   public Car() {
	   super.maxSpeed = 110;
	   nombre = super.nombre;
	   
	  
	   
	   
	   
   }
   void display() {
	   System.out.println("Velocidad Hijo = " + this.maxSpeed + "Velocidad Padre = " + super.maxSpeed);
   }
   
   
	

}
