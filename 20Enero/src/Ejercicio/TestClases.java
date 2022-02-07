package Ejercicio;

public class TestClases {
	public static void main(String[] args) {
		System.out.println("CLASE PADRE VEHICULO");
		Vehiculo abuelo = new Vehiculo("Mitsubishi");
		System.out.println("NOMBRE: " + abuelo.nombreVehiculo);
		abuelo.Transportar();
		System.out.println("============================================");
		
		Acuatico padre = new Acuatico("Acuatico1");
		System.out.println("NOMBRE: " + padre.nombreVehiculo);
		padre.navegar();
		padre.Transportar();
		System.out.println("============================================");
		
		Barco hijo = new Barco("Barco1");
		System.out.println("NOMBRE: " + hijo.nombreVehiculo);
		hijo.navegar();
		hijo.Transportar();
		hijo.prenderMotor();
		System.out.println("============================================");
		
		Velero hijo2 = new Velero("Velero1");
		System.out.println("NOMBRE: " + hijo.nombreVehiculo);
		hijo2.navegar();
		hijo2.Transportar();
		hijo2.hizarVelas();
		System.out.println("============================================");
		
		Aereo padre2 = new Aereo("Aereo1");
		System.out.println("NOMBRE: " + padre2.nombreVehiculo);
		padre2.Transportar();
		padre2.volar();
		System.out.println("============================================");
		
		Avion hijo3 = new Avion("Avion1");
		System.out.println("NOMBRE: " + hijo3.nombreVehiculo);
		hijo3.Transportar();
		hijo3.volar();
		hijo3.bajarTrenDeAterrizaje();
		System.out.println("============================================");
		
		Helicoptero hijo4 = new Helicoptero("Helicoptero1");
		System.out.println("NOMBRE: " + hijo4.nombreVehiculo);
		hijo4.Transportar();
		hijo4.volar();
		hijo4.encenderHelices();
	}

}
