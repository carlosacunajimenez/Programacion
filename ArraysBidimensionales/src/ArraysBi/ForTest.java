package ArraysBi;

import java.util.ArrayList;
import java.util.List;

public class ForTest extends ObjetoTest{
	public static ArrayList<String> variables = new ArrayList<String>();
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			variables.add("var" + i);
		}
		for(int i= 0; i<5; i++) {
			String a;
			a = variables.get(i);
			ObjetoTest e = new ObjetoTest();
		}
		}
	}

