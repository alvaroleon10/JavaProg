package Boletin3;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println(numeroVeces("Hola Pepito soy programador y soy alto", "soy"));
	}
	public static int numeroVeces (String cadena, String palabra) {
		String nuevaCad = "";
		int nVeces = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != ' ') {
				nuevaCad += cadena.charAt(i);
			} else {
				nuevaCad = "";
			} if (nuevaCad.equals(palabra)){
				nVeces++;
			}
		}
		return nVeces;
	}
}
