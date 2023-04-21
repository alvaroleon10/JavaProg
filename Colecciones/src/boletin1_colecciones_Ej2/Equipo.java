package boletin1_colecciones_Ej2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Equipo  {
	
	private String nombreEquipo;
	private Set<Alumno> grupoAlumnos;
	
	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.grupoAlumnos = new HashSet<>();
	}

	
	public void anadirAlumno (Alumno alum) throws Exception {
		for (int i = 0; i < grupoAlumnos.size(); i++) {
			if (!grupoAlumnos.contains(alum)) {
				grupoAlumnos.add(alum);
			
			} else {
				throw new Exception ("Este alumno ya pertenece al equipo");
			}
		}
	}
	
	public void borrarAlumno (Alumno alum) throws Exception {
		for (int i = 0; i < grupoAlumnos.size(); i++) {
			if (grupoAlumnos.contains(alum)) {
				grupoAlumnos.remove(alum);
			} else {
				throw new Exception ("Este alumno no pertenece al equipo");
			}
		}
	}
	
	public String mostrarJugadores() {
		return grupoAlumnos.toString();
	}
	
	public Alumno perteneceEquipo(Alumno alum) {
		Alumno mensaje = null;
			if (grupoAlumnos.contains(alum)) {
				mensaje = alum;
			}
			return mensaje;
	}
	
	public String unionEquipos (Equipo equipo) {
		Set<Alumno>unionAlumnos=new HashSet<>();
		for(Alumno i : grupoAlumnos) {
			unionAlumnos.add(i);
		}
		for(Alumno z : equipo.grupoAlumnos) {
			unionAlumnos.add(z);
		}
		return unionAlumnos.toString();
	}
	
	public String interEquipo (Equipo equipo) {
		Set<Alumno>interAlumnos=new HashSet<>();
	}
						
}


