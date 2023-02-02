package Boletin2;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int numero;
	System.out.println("Inserte un número:");
	numero = Integer.valueOf(sc.nextLine());
	String numeroCad = String.valueOf(numero);
	
	String nuevoNumero = "";
	for(int contador=numeroCad.length()-1; contador >= 0; contador--) {
		nuevoNumero+=numeroCad.charAt(contador);
	}
	System.out.println(nuevoNumero);
		
	}
	

}
