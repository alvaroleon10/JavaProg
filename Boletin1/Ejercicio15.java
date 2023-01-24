package Boletin1;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		String mensaje = "";
		
		while (!mensaje.equals("fin")) {
			System.out.println("Introduce un numero:");
			mensaje = sc.nextLine();
			
			if (!mensaje.equals("fin")) {
				suma += Integer.valueOf(mensaje);
			}
		}
		System.out.println(suma);

	}

}
