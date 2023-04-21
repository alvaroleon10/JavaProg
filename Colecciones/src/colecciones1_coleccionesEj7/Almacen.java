package colecciones1_coleccionesEj7;

public class Almacen {
	
	private Caja[]cajas;

	public Almacen(Caja[] cajas) {
		super();
		this.cajas = new Caja[20];
	}
	
	public void abrirCaja (int numeroCaja) throws Exception {
		for (int i = 0; i<cajas.length; i++) {
			if (i == numeroCaja) {
				if (cajas[i].isAbierta()) {
					cajas[i].abrir();
				} else {
					throw new Exception ("No se puede abrir una caja que ya estaba abierta");
				}
			}
		}
	}
	
	public void cerrarCaja (int numeroCaja) throws Exception {
		for (int i = 0; i < cajas.length; i++) {
			if (i == numeroCaja) {
				if (!cajas[i].isAbierta()) {
					cajas[i].cerrar();
				} else {
					throw new Exception ("No se puede cerrar una caja que ya estaba cerrada");
				}
			}
		}
	}
	
	public String addCliente (Cliente cliente) {
		int menor = 100;
		Caja cajaMenor = null;
		int posicion = 0;
		for (int i = 0; i < cajas.length; i++) {
			if (cajas[i].cantidadCliente() < menor) {
				menor = cajas[i].cantidadCliente();
				cajaMenor = cajas[i];
				posicion = i;
			}
		}
		cajaMenor.anadirCliente(cliente);
		return "Es usted el cliente " + cliente.getId() + " y debe dirigirse a la caja numero" +  posicion;
	}
	
	
	
}
