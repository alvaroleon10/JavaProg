package Boletin2;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println(segundosEntre(16,32,23,12,45,53));
	}
	
		public static int segundosEntre (int hora1, int minuto1, int segundo1, int hora2, int minuto2, int segundo2) {
			int resultado = 0;
			
			if ((hora1 >= 0 && hora1 <= 23)&&(minuto1 >= 0 && minuto1 <= 59)&&(segundo1 >= 0 && segundo1 <= 59)&&(hora2 >= 0 && hora2 <= 23)&&(minuto2 >= 0 && minuto2 <= 59)&&(segundo2 >= 0 && segundo2 <= 59)) {
				segundo1 += hora1*3600;
				segundo2 += hora2*3600;
				segundo1 += minuto1*60;
				segundo2 += minuto2*60;
			}
			if (segundo1 > segundo2) {
				resultado = segundo1 - segundo2;
			} else {
				resultado = segundo2 - segundo1;
			}
			return resultado;
	}
}

