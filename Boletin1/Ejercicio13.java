package Boletin1;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int numero = 0;
		int minimo = 0;
		int maximo = 100;
		while (contador < 10) {
			System.out.println("Introduzca un numero:");
			numero = Integer.valueOf(sc.nextLine());
			if (numero > maximo) {
				maximo = numero;
			}
			else if (numero < minimo) {
				minimo = numero;
			}
			contador ++;
		}
		System.out.println(maximo);
		System.out.println(minimo);
	}

}
