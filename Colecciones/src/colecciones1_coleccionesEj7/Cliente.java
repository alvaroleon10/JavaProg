package colecciones1_coleccionesEj7;

public class Cliente {
	
	private static int id = 1;
	private int caja;
	
	
	
	public Cliente(int caja) {
		super();
		this.caja = caja;
		this.id = id++;
	}



	public static int getId() {
		return id;
	}



	public static void setId(int id) {
		Cliente.id = id;
	}



	public int getCaja() {
		return caja;
	}



	public void setCaja(int caja) {
		this.caja = caja;
	}
	
	
	
}
