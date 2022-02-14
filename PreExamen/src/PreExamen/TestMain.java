package PreExamen;

public class TestMain {
   
    
    public static void main(String args[]) {
    	Human obj1 = new Human("El jose");
    	obj1.walk();
    	LivingT obj2 = obj1;
    	System.out.println(obj1.getName());
    	System.out.println(obj2.getName());
    	boolean b1 = (obj1 == obj2);
    	System.out.println(b1);
    }

}
