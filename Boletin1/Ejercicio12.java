package Boletin1;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		int numero = Integer.valueOf(sc.nextLine());
		int contador = 0;
		while (numero > 0) {
			System.out.println("Introduzca un número:");
			numero = Integer.valueOf(sc.nextLine());
			contador ++;			
		}
		System.out.println(contador);
	}

}
