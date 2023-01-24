package Boletin1;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int hora = 0;
		System.out.println("¿Qué hora es?:");
		
		Scanner sc = new Scanner(System.in);
		hora = Integer.valueOf(sc.nextLine());
		
		if (6 >= hora || hora <= 12) {
			System.out.println("Buenos días");
		} else if (13 >= hora || hora <= 20) {
			System.out.println("Buenas tardes");
		} else {
			System.out.println("Buenas noches");
		}

	}

}
