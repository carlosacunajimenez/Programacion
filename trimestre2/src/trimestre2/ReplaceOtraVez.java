package trimestre2;

public class ReplaceOtraVez {
	public static void main(String[] args) {
	    String str = "Intentearemos cambiar un caracter";
	    //String str1 = str.replace("a", "A"); cambia todos
	    String str1 = str.replaceFirst("a", "A"); //sustituye la 1º
	    System.out.println(str1);
	}
	}


