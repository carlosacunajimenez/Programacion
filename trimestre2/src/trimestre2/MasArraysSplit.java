package trimestre2;

import java.util.StringTokenizer;

public class MasArraysSplit {
	public static void main(String[] args) {
		String str1 = new String("Kansas,Louisiana,Maryland,Massachusetts");
		String delimSpace = ",";
		
		StringTokenizer stObj = new StringTokenizer(str1, delimSpace);
		while(stObj.hasMoreElements()) {
			System.out.println("StringTokenizer Output: " + stObj.nextElement());
		}
	}

}
