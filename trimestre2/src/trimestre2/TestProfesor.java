package trimestre2;

public class TestProfesor {
	public static void main(String[] args) {
		Profesor prof1 = new Profesor("Miguel", "Yllanes", 47);
		Profesor prof2 = new Profesor("Jose", "Garcia", 34);
		prof1.setIdProfesor("DAM");
		prof1.mostrarNombreApellidosYCarnet();
		prof2.setIdProfesor("Sistemas y Redes");
		prof2.mostrarNombreApellidosYCarnet();
	}

}
