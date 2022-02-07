package miercoles24;

public class miercoles24 {
	public static String name;
	public static int year;
	public static void main(String[] args) {
		
	}
	public static int funcion(String str) {
		int a = 0;
		return a;
	}
        public miercoles24() { //inicializa variables
        	name = "carlos";
        	year = 2;
        }
        public miercoles24(String newName, int newYear) {
        	name = newName;
        	year = newYear;
        }
        public static int getYear() {
        	return year;
        	
        }
        public static String getName() {
        	System.out.println("Sr/sra "+ name);
        	return name;
        	
        }


}
