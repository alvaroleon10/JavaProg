package Boletin3;
public class Ejercicio2 {

	public static void main(String[] args) {
		String nuevaSuma;
		int suma = 0;
		String numero = "156";
		for (int contador = 0; contador <= numero.length()-1; contador ++) {
			suma += (Character.getNumericValue(numero.charAt(contador)));
		} System.out.println(suma);
		nuevaSuma = String.valueOf(suma);
		for (int z = 0; z <= nuevaSuma.length(); z++) {
			nuevaSuma += (Character.getNumericValue(String.valueOf(suma).charAt(z)));
		}System.out.println(nuevaSuma);
		if (Integer.valueOf(nuevaSuma)%3 == 0) {
			System.out.println(nuevaSuma + " es divisible por 3");
		} else {
			System.out.println(nuevaSuma + " no es divisible por 3");
		}
	}

}
