package Boletin2;

public class Ejercicio11 {

	public static void main(String[] args) {
		System.out.println(minimoComunMultiplo(24,36));
	}
	public static int minimoComunMultiplo (int numero1, int numero2) {
		int mcd = Ejercicio10.greaterCommonDivisor(numero1, numero2);
		
		int mcm;
		mcm = (numero1*numero2)/mcd;
		return mcm;
	}

}
