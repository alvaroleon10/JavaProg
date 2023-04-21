package boletin1_colecciones_Ej4;

import java.time.LocalDateTime;

public class PaginaWeb {
	
	private String URL;
	private LocalDateTime fechaVisita;
	
	public PaginaWeb(String uRL, LocalDateTime fechaVisita) {
		super();
		URL = uRL;
		this.fechaVisita = fechaVisita;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public LocalDateTime getFechaVisita() {
		return fechaVisita;
	}

	public void setFechaVisita(LocalDateTime fechaVisita) {
		this.fechaVisita = fechaVisita;
	}

	@Override
	public String toString() {
		return "PaginaWeb [URL=" + URL + ", fechaVisita=" + fechaVisita + "]";
	}
	
	
	
}
