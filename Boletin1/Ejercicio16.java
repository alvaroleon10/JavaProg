package Boletin1;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int numero;
		int suma = 0;
		int mayores = 0;
		while (contador < 10) {
			System.out.println("Inserte su salario:");
			numero = Integer.valueOf(sc.nextLine());
			contador++;
			suma += numero;
			if (numero > 1000) {
				mayores ++;
			}
		}
		System.out.println(suma);
		System.out.println(mayores);
	}

}
