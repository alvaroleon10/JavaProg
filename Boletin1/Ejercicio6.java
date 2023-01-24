package Boletin1;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int dia = 0;
		int mes = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime dia y mes: ");
		
		dia = Integer.valueOf(sc.nextInt());
		mes = Integer.valueOf(sc.nextInt());
		
		if (mes==3) {
			if (dia>20) {
				System.out.println("Primavera: 20º");
			}else {
				System.out.println("Invierno: 19º");
			}
		}else if (mes==6) {
			if (dia<21) {
				System.out.println("Primavera: 20º");
			}else {
				System.out.println("Verano: 24º");
			}
		}else if (mes==9) {
			if (dia<23) {
				System.out.println("Verano: 24º");
			}else {
				System.out.println("Otoño: 19º");
			}
		}else if (mes==12) {
			if (dia<21) {
				System.out.println("Otoño: 19º");
			}else {
				System.out.println("Invierno: 19º");
			}
		}else if (mes<3) {
			System.out.println("Invierno: 19º");
		}else if (mes>3 && mes<6) {
			System.out.println("Primavera: 20º");
		}else if (mes>6&&mes<9) {
			System.out.println("Verano: 24º");
		}else {
			System.out.println("Otoño: 19º");
		}
		

	}

}