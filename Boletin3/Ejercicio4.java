package Boletin3;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println(empiezaPor("Hola buenas tardes ", "Hola"));
		System.out.println(contiene("Me llamo alvaro leon", "Me"));
	}
	public static boolean empiezaPor (String cadena, String palabra) {
		boolean mensaje = false;
		int posicion = cadena.indexOf(palabra);
		if ((posicion==0) && (cadena.substring(0, palabra.length())).equals(palabra)) {
			mensaje = true;
		}
			return mensaje;

	}
	
	public static boolean contiene (String cadena, String palabra) {
		boolean mensaje = false;
		int posicion = 0;
		for (int x = 0; x < cadena.length(); x++) {
			if(posicion<palabra.length() && cadena.charAt(x)==palabra.charAt(posicion)) {
				posicion++;
				if (posicion == palabra.length()) {
					mensaje = true;
				}
			}else {
				posicion = 0;
			}
			
		}
		return mensaje;
	}
	
	

}
