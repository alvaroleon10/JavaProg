package boletin1_colecciones_Ej2;

public class Ej2 {

	public static void main(String[] args) throws Exception {
		Equipo equipo = new Equipo("beti");
		
		equipo.anadirAlumno(new Alumno("Cristina", "12345678A"));
		System.out.println(equipo.mostrarJugadores());
	}
	
	

}
