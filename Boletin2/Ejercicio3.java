package Boletin2;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println(esFuerte("1905MAnl."));

	}
	public static boolean esFuerte (String contrasenya) {
		boolean mensaje = false;
		final int Longitud_Min = 8;
		boolean longitud = contrasenya != null && contrasenya.length() >= Longitud_Min;
		boolean mayus = false;
		boolean minus = false;
		boolean digit = false;
		final String SIGNOS = ".,;!¿?!¡_-";
		boolean signos = false;
		if (longitud) {
			for (int i=0; i < contrasenya.length();i++) {
				char caracter = contrasenya.charAt(i);
				if (Character.isUpperCase(caracter)) {
					mayus = true;
				} else if (Character.isLowerCase(caracter)) {
					minus = true;
			}else if (Character.isDigit(caracter)) {
				digit = true;
		} else {
			for (int z = 0; z < SIGNOS.length(); z++) {
				if (SIGNOS.charAt(z)== contrasenya.charAt(i)) {
					signos = true;
				}
			}
		}
	}

			if (mayus && minus && digit && signos) {
				mensaje = true;
			}
			return mensaje;
}
}
}