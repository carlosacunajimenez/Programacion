package trimestre2;

public class ArraysSplit {
	public static void main(String[] args) {
		String str1 = new String("Menudo meme de ejercicio");
		String delimSpace = " ";
		String[] arr1 = str1.split(delimSpace);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
			String delimSpace2 = "[.,?!]+";
			String str2 = new String("zzzzz, zzzz2, zz?, zzzzzzzzzzz! zzz");
			String[] arr2 = str2.split(delimSpace2);
			for(int i=0;i<arr1.length;i++) {
				System.out.println(arr2[i]);
				
		
	}
			
		

	}
}
