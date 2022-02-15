package Archivos;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		//averiguar si existe un archivo en proyecto
		try {
			File file = new File("record.txt");
			
			if(file.createNewFile()) {
				System.out.println("New file is created!");
			}else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
