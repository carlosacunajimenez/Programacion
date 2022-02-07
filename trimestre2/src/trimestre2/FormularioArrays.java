package trimestre2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FormularioArrays {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca su nombre y apellidos");
		String str1 = br.readLine();
		String delimSpace = " ";
		String arr2[] = str1.split(delimSpace);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
			
	}
		System.out.println(str1);
	}
}
