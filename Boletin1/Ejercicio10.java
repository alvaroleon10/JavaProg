package Boletin1;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int numero;
		int total = 0;
		int contador = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un número:");
		numero = Integer.valueOf(sc.nextLine());
		if (numero > 0) {
		
		while (contador < 100) {
			total += numero;
			contador++;
			numero++;
		}
		System.out.println(total);
		}
		else {
			System.out.println("Número no positivo");
		}

	}

}
