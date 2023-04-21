package boletin1_colecciones_Ej4;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historial {
	
	private List<PaginaWeb> historialBusqueda;

	public Historial() {
		super();
		this.historialBusqueda = new ArrayList<>();
	}
	
	public void addPagina (PaginaWeb pagina) throws Exception {
		if (historialBusqueda.isEmpty()) {
			historialBusqueda.add(pagina);
		}else {
			if (pagina.getFechaVisita().isBefore(historialBusqueda.get(historialBusqueda.size()-1).getFechaVisita())) {
				throw new Exception("No se puede introducir fecha de esta página");
			}else {
				historialBusqueda.add(pagina);
			}	
		}
	}

	public void consultarHistorial() {
		for (int i = 0; i <historialBusqueda.size(); i++) {
			System.out.println(historialBusqueda.get(i));
		}
	}
	
	public void consultarHistorialPorDia (LocalDateTime fechaVisita) {
		for (int i = 0; i < historialBusqueda.size(); i++) {
			if (historialBusqueda.get(i).getFechaVisita().getDayOfMonth()==(fechaVisita.getDayOfMonth())) {
				System.out.println(historialBusqueda.get(i));
			}
		}
	}
	
	public void borrarHistorial () {
		historialBusqueda.clear();
	}
	
	public void borrarVisitasPaginas (String url) {
		for (int i = 0; i < historialBusqueda.size(); i++) {
			if (historialBusqueda.get(i).getURL().equals(url)) {
				historialBusqueda.remove(i);
			}
		}
	}
	
	
}
