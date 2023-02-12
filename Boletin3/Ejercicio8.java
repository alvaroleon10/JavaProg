package Boletin3;

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println(cambiarParametros("Buenas noches a todos", "noches", "tardes"));
	}
	public static String cambiarParametros (String cadena, String aCambiar, String newWord){
		StringBuilder nuevaFrase = new StringBuilder();
		String palabra = "";
		for (int x = 0; x < cadena.length()-aCambiar.length(); x++) {
			palabra = cadena.substring(x, x+aCambiar.length());
			if (palabra.equals(aCambiar)) {
				nuevaFrase.append(cadena.substring(0, x));
				nuevaFrase.append(newWord);
				nuevaFrase.append(cadena.substring(x+aCambiar.length(), cadena.length()));
			}
		}
		return nuevaFrase.toString();
	}
}