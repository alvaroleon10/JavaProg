package mockExam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historial {
	private Map<LocalDate, Combinacion> historial;

	public Historial() {
		super();
		this.historial = new HashMap<>();
	}
	
	public boolean addSorteo (LocalDate fecha, Combinacion combinacion) {
		boolean anadido = false;
		if (this.historial.get(fecha) != null) {
			anadido = false;
		} else {
			historial.put(fecha, combinacion);
			anadido=true;
		}
		return anadido;
	}
	
	public boolean addSorteo (int dia, int mes, int anio, Combinacion combinacion) {
		boolean anadido = false;
		LocalDate fecha = LocalDate.of(anio, mes, dia);
		if (this.historial.get(fecha)!=null) {
			anadido = false;
		} else {
			historial.put(fecha, combinacion);
			anadido = true;
		}
		return anadido;
	}
	
	public boolean actualizarSorteo (int dia, int mes, int anio, Combinacion combinacion) {
		boolean actualizado = false;
		LocalDate fecha = LocalDate.of(anio, mes, dia);
		if (this.historial.get(fecha) != null) {
			historial.put(fecha, combinacion);
			actualizado = true;
		} else {
			actualizado = false;
		}
		return actualizado;
	}
	
	public boolean actualizarSorteo(LocalDate fecha, Combinacion combinacion) {
		boolean actualizado = false;
		if (this.historial.get(fecha) != null) {
			historial.put(fecha, combinacion);
			actualizado = true;
		} else {
			actualizado = false;
		}
		return actualizado;
	}
	
	public List<String> listarSorteoDesdeFecha (LocalDate fecha) {
		List<String>listaDatos = new ArrayList<>();
		for (Map.Entry<LocalDate, Combinacion> entry : historial.entrySet()) {
			LocalDate fecha1 = entry.getKey();
			Combinacion combinacion = entry.getValue();
			if (fecha.isBefore(fecha1)) {
				listaDatos.add(combinacion.toString());
			}
		}
		return listaDatos;
	}
	
	public List<String> mostrarHistorico() {
		List<String>historico = new ArrayList<>();
		for (Map.Entry<LocalDate, Combinacion> entry : historial.entrySet()) {
			LocalDate fecha = entry.getKey();
			Combinacion combinacion = entry.getValue();
			historico.add(combinacion.toString());
		}
		return historico;
	}
	
	public int comprobarAciertos (LocalDate fecha, Combinacion combinacion) {
		int aciertos = 0;
		
	}
	
	
}
