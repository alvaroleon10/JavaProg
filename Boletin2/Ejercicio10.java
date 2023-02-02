package Boletin2;

public class Ejercicio10 {

	public static void main(String[] args) {
		System.out.println(greaterCommonDivisor(1220,516));
	}
		public static int greaterCommonDivisor (int numero1, int numero2) {
			
			int resultado;
			
			while (numero2 > 0) {
				resultado = numero1%numero2;
				numero1 = numero2;
				numero2 = resultado;
			}
			return numero1;
}
}
