package Boletin3;

public class Ejercicio5 {

	public static void main(String[] args) {
		System.out.println(esPalindromo("ligar es ser agil"));
	}
	public static boolean esPalindromo (String cadena) {
		boolean mensaje = false;
		StringBuilder nuevaCad = new StringBuilder();
		StringBuilder newCadena = new StringBuilder();
		for (int x = cadena.length()-1; x >= 0; x--) {
			if (cadena.charAt(x)!= ' ') {
				nuevaCad.append(cadena.charAt(x));
			}
		}
		for (int z = 0; z < cadena.length(); z++) {
			if (cadena.charAt(z)!= ' '){
				newCadena.append(cadena.charAt(z));
			}
		}
		if (nuevaCad.toString().equals(newCadena.toString())) {
			mensaje = true;
		}
		return mensaje;
	}

}
