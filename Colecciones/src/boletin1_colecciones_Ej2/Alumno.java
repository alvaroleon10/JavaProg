package boletin1_colecciones_Ej2;

import java.util.Objects;

public class Alumno {
	private String nombre;
	private String DNI;
	
	
	public Alumno(String nombre, String dNI) {
		super();
		this.nombre = nombre;
		DNI = dNI;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", DNI=" + DNI + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(DNI, other.DNI) && Objects.equals(nombre, other.nombre);
	}
	
}


