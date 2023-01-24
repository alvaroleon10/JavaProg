package Boletin1;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número:");
		numero = Integer.valueOf(sc.nextLine());
		while (numero >= 0) {
			System.out.println("El cuadrado de " +numero +" es "+numero*numero);
			System.out.println("Introduzca un número");
			numero = Integer.valueOf(sc.nextLine());
		}

	}

}
