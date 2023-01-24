package Boletin1;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Introduzca un número:");
		numero = Integer.valueOf(sc.nextLine());
		int contador = 0;
		int impares = 0;
		int sumaImpares = 0;
		int mayorPar = 0;
		while (numero >=  0) {
			contador ++;
			if (numero % 2 == 0) {
				if (numero > mayorPar) {
					mayorPar = numero;
				}
			} else {
				impares ++;
				sumaImpares += numero;
			}
			System.out.println("Introduzca un número:");
			numero = Integer.valueOf(sc.nextLine());
		}
		System.out.println(contador);
		System.out.println(mayorPar);
		System.out.println(sumaImpares/impares);
		

	}

}
