package Boletin3;

public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println(esCapicua("1,21"));
	}
	public static boolean esCapicua (String num) {
		boolean mensaje = false;
		String nuevoNum = "";
		for (int contador = num.length()-1; contador >= 0; contador--) {
			nuevoNum += num.charAt(contador);
		}
		if (nuevoNum.equals(num)) {
			mensaje = true;
		}
		return mensaje;
	}

}
