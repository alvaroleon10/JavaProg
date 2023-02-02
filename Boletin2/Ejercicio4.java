package Boletin2;

public class Ejercicio4 {

	public static void main(String[] args) {
		String cadena = "Hola mundos";
		String nuevaCad = "";
		for (int contador = 0; contador < cadena.length(); contador += 2) {
				nuevaCad += cadena.charAt(contador+1);
				nuevaCad += cadena.charAt(contador);
				
		}
		if (cadena.length()%2==1) {
			nuevaCad += cadena.charAt(cadena.length()-1);
		}
		System.out.println(nuevaCad);
		
	}

}
