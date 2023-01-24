package Boletin1;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		String caracter = new Scanner(System.in).nextLine();
		switch (caracter) {
		case "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z":{
		System.out.println("Letra mayúscula");
		break;
		} case "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z":{
			System.out.println("Letra minúscula");
			break;
		} case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9":{
			System.out.println("Dígito entre 0 y 9");
			break;
		} case ".", ",", ";", ":":{
			System.out.println("Signo de puntuación");
			break;
		} case " ":{
			System.out.println("Espacio en blanco");
			break;
		} case "()", "{}":{
			System.out.println("Paréntesis o llaves");
			break;
		} default :{
			System.out.println("Otro carácter");}
			
		
		}
		}
		
		

	}


