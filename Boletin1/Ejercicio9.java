package Boletin1;
import java.util.Scanner;


public class Ejercicio9 {

	public static void main(String[] args) {
		int contador = 0;
		int numero;
		
		Scanner sc = new Scanner (System.in);
		while (contador < 5) {
			System.out.println("Introduzca un número:");
			numero = Integer.valueOf(sc.nextLine());
			if (numero % 3 == 0) {
				System.out.println(numero+" es múltiplo de 3");
			}
				else {
					System.out.println(numero+" no es múltiplo de 3");
		}
			contador++;

	}

	}
}
