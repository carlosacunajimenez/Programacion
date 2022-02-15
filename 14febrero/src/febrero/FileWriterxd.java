package febrero;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterxd {
	public static void main(String[] args) throws IOException{
		try {
			
		
		
		FileWriter fw = new FileWriter("C:\\zzz.txt");
		//windows
		//FileWriter fw = new FileWriter("D:\\testout.txt");
		//linux
		//FileWriter fw = new FileWriter("//users//file1.txt");
		fw.write("Welcome to DAM");
		fw.close();
		} catch(Exception e) {
			System.out.println(e);
		
		}
		System.out.println("Sucess");
	}

}
