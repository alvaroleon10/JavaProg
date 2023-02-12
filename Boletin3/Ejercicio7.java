package Boletin3;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println(buscarPalabra("shybaoxlna", "hola"));
	}
	public static boolean buscarPalabra (String cadena, String palabra) {
		boolean mensaje = false;
		int c = 0;
		char letra = palabra.charAt(c);
		
		for (int i = 0; i < cadena.length(); i++) {
			char letraCad = cadena.charAt(i);
			if (letra == letraCad) {
				
			}
		}
	}
}
