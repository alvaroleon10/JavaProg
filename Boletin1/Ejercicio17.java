package Boletin1;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
			int longitud;
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca la longitud");
			int fibonacci = 0;
			int fibonacci2 = 0;
			int auxiliar = 0;
			String cadena="";
			
			for (int i = 0; i = longitud + 1; i++) {
				fibonacci= fibonacci2+auxiliar;
				fibonacci2=auxiliar;
				auxiliar=fibonacci;
					if (i == longitud) {
						cadena+= String.valueOf(fibonacci);
					}
					else {
					cadena+= String.valueOf(fibonacci) + (", ");
					}
			}
			System.out.println(cadena);  

	}

}
