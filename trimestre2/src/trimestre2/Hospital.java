package trimestre2;

class Doctor{
		public void saludar() {
			System.out.println("hola");
		}
		public void recetar() {
			System.out.println("Recetamos aspirinas");
		}
		
	}
class Enfermero extends Doctor {
		public void Curar() {
			System.out.println("Curando");
		}
	}

public class Hospital {
	public static void main(String[] args) {
		Enfermero xd = new Enfermero();
		xd.saludar();
		xd.recetar();
		xd.Curar();
			
		}

	}

