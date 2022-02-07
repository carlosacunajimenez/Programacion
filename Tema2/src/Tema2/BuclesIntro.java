package Tema2;

public class BuclesIntro {
	public static void main(String[] args) {
		
		int i = 16;
		int i2 = 20;
		if (i > 15)
			System.out.println("10 es menor que 15");
		System.out.println("No estoy en IF");
	
	
	if (i2>15)
		System.out.println("Soy menor que 15");
	else
		System.out.println("Soy mayor que 15");

	
	//if anidado
	int i3 = 10;
	if (i3 == 10)
	{
		if(i3 < 15)
			System.out.println("Soy menor que 15");
		if (i3 < 12)
			System.out.println("Yo también soy menor que 12");
		else
			System.out.println("Soy mayor que 15");
	}


	int i4 = 20;
	if(i4 == 10)
		System.out.println("i es 10");
	else if (i4 == 15)
		System.out.println("i es 15");
	else if (i4 == 20)
		System.out.println("i4 es 20");
	else
		System.out.println("i4 no está presente");

	int i5 = 1;
	switch (i5)
	  {
	case 0:
		System.out.println("i es cero. ");
		break;
	case 1:
		System.out.println("i es uno");
		break;
	case 2:
		System.out.println("i es dos.");
		break;
		
		default:
			System.out.println("i es mayor que 2");
			break;
			
	}
	
	
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
	
	loop:
		for (int i1=0; i1<10; i1++) {
			switch(i1) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
				continue loop;
			}
			System.out.println(i1);
			}
		}
		}

	

