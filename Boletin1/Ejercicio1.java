package Boletin1;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		System.out.println("Introduzca un número:");
		System.out.println("Introduzca otro número:");
		
		Scanner sc = new Scanner(System.in);
		number1 = Integer.valueOf(sc.nextLine());
		number2 = Integer.valueOf(sc.nextLine());
		
		System.out.println(number1%number2 == 0 || number2%number1 == 0);
	}

}
