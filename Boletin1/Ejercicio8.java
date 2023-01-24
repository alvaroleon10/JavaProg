package Boletin1;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int contador = 0;
		int numero;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		while (contador < 15) {
			System.out.println("Introduzca un número:");
			numero = Integer.valueOf(sc.nextLine());
			total += numero;
			contador++;
			
		}
		System.out.println(total);
		
	}

}
