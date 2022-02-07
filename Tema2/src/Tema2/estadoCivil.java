package Tema2;

public class estadoCivil {
	public static void main(String[] args) {
		String estado = "casado";
		switch (estado)
		{
		case "casado":
			System.out.println("Está casado");
			break;
		case "soltero":
			System.out.println("Está soltero.");
			break;
		case "viudo":
			System.out.println("Viudo.");
			break;
			default:
			System.out.println("Debes ser joven aun!!");
			break;
		}

	}
	}


