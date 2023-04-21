package colecciones1_coleccionesEj7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Caja {
	private boolean abierta;
	private List <Cliente> clientes = new ArrayList <>();
	
	
	public Caja() {
		super();
		this.abierta = false;
		this.clientes = clientes;
	}


	public boolean isAbierta() {
		return abierta;
	}


	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}


	public List<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public boolean abrir () {
		return this.abierta = true;
	}
	
	public boolean cerrar () {
		return this.abierta = false;
	}
	
	public int cantidadCliente () {
		return clientes.size();
	}
	
	public void anadirCliente (Cliente c) {
		clientes.add(c);
	}
	
}
