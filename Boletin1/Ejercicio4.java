package Boletin1;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		float notaPractica = 0;
		float notaProblemas = 0;
		float notaTeorica = 0;
		System.out.println("Introduzca su nota de parte práctica:");
		System.out.println("Introduzca su nota en problemas:");
		System.out.println("Introduzca su nota en la parte teórica:");
		
		Scanner sc = new Scanner(System.in);
		notaPractica = Float.valueOf(sc.nextLine());
		notaProblemas = Float.valueOf(sc.nextLine());
		notaTeorica = Float.valueOf(sc.nextLine());
		
		float notaFinal = (float)((notaPractica*0.10)+(notaProblemas*0.50)+(notaTeorica*0.40));
		System.out.println(notaFinal);
		
		if ((0 <= notaPractica && notaPractica <= 10) && (0 <= notaProblemas && notaProblemas <= 10) && (0 <= notaTeorica && notaTeorica <= 10)) {
			if (notaFinal < 5){
				System.out.println("Insuficiente");
			}else if (5 <= notaFinal && notaFinal < 6) {
				System.out.println("Suficiente");
			}else if (6 <= notaFinal && notaFinal < 7) {
				System.out.println("Bien");
			}else if (7 <= notaFinal && notaFinal < 9) {
				System.out.println("Notable");
			}else {
				System.out.println("Sobresaliente");
			}
		}else {
			System.out.println("NOTAS INCORRECTAS");
		}
		

	}

}
