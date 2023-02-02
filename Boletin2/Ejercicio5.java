package Boletin2;

import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		System.out.println(esMultiplo(4,2));
		
	}
	public static Boolean esMultiplo(int numero1, int numero2) {
		boolean mensaje=false;
		if (numero1%numero2==0) {
			mensaje= true;
		}
		return mensaje;
		
	}

}
