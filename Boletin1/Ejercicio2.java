package Boletin1;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		String diaSemana = new Scanner(System.in).nextLine();
		
		switch (diaSemana) {
		case "Lunes": {
			System.out.println("Entornos de desarrollo");
			break;
		}case "Martes": {
			System.out.println("FOL");
			break;
		}case "Miércoles" : {
			System.out.println("Sistemas Informáticos");
			break;
		}case "Jueves" : {
			System.out.println("Base de Datos");
			break;
		}case "Viernes" : {
			System.out.println("Sistemas Informáticos");
			break;
		}default :{
			System.out.println("Día introducido fuera de los parámetros pedidos");
		}
		}
		
	}

}
