package Archivos;


import java.io.*;

public class Writer {
	public static void main(String[] args) {
		try {
			FileWriter w = new FileWriter("record2.txt");
			String content = "I LOVE MY COUNTRY4";
			w.write(content);
			w.close();
	}
		catch(IOException e) {
			e.printStackTrace();
		}


	}
	}
