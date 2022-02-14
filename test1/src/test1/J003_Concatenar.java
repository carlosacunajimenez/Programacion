package test1;

public class J003_Concatenar {
	public static void main(String[] args) {
		
	String str1 = "hola";
	String str2 = "juan";
	
	String str3 = str1 + " " + str2;
	System.out.println("Valor Final: " + "(" + str3 + ")" );
	System.out.print(str3);
	System.out.println(" ");
	System.out.print(str3);
	
	String str4 = str1 + "(" + str2 + ")";
	System.out.print(str4 + "\n");
	}

}
