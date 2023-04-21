package boletin1_colecciones_Ej4;

import java.time.LocalDateTime;

public class Principal {

	public static void main(String[] args) {
		
		Historial historial = new Historial();
		PaginaWeb pagina1 = new PaginaWeb("1234", LocalDateTime.of(2023, 3, 19, 18, 30));
		PaginaWeb pagina2 = new PaginaWeb("4321", LocalDateTime.of(2023, 3, 29, 18, 30));
		
		historial.addPagina(pagina1);
		historial.addPagina(pagina2);
		
		//historial.consultarHistorialPorDia(LocalDateTime.of(2023, 3, 19, 18, 30));
		//historial.borrarVisitasPaginas("1234");
		historial.consultarHistorial();
			
	}

}
