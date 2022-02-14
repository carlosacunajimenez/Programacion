package PreExamen;

public abstract class LivingT {
	public static String name;
	public LivingT(String nombre1) {
		this.name = nombre1;
	}
    public static void respirar() {
    	System.out.println("Respirando");
    }
    public static void comer() {
    	System.out.println("Comiendo");
    }
    public abstract void walk();
    	

 public static String getName() {
	 return name;
 }
   public static void setName(String name1) {
	   name = name1;
	   
   }
 }
