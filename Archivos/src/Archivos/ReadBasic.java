package Archivos;

import java.io.*;

public class ReadBasic {
	public static void main(String[] args) {
		
		try {
			Reader reader = new FileReader("record.txt");
			int data = reader.read();
			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
				
			}
			
			reader.close();
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
