package boletin1_colecciones_Ej1;

import java.util.Arrays;

public class Ej1 <T> {

	public static void main(String[] args) {
		
		Integer [] listaNumeros = new Integer [4];
		listaNumeros[0] = 1;
		listaNumeros[1] = 3;
		listaNumeros[2] = 5;
		listaNumeros[3] = 7;
		
		System.out.println(Arrays.toString(reverse(listaNumeros)));
	}
	
	public static <T> T[] reverse (T[] arrayOriginal) {
		T[] arrayRiversado = (T[]) new Object[arrayOriginal.length];
		int contador = 0;
		
		for(int i = arrayOriginal.length-1; i > 0; i--) {
			arrayRiversado[contador]=arrayOriginal[i];
			contador++;
		}
		if (contador==arrayOriginal.length-1) {
			arrayRiversado[contador] = arrayOriginal[0];
		}
		return arrayRiversado;
		
	}
	

	
}
