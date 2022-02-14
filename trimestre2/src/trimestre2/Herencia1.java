package trimestre2;

class Animal {
	//clase padre
	public String toString() {
		return "Esto es un animal";
	}
}

class Dog extends Animal {
	public void Sound() {
		System.out.println("woof woof");
	}
}

public class Herencia1 {
	public static void main(String[] args) {
		Dog aDog = new Dog();
		aDog.Sound();
		System.out.println(aDog.toString());
	}

}
