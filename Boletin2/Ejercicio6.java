package Boletin2;

public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println(horaMayor(12,30,43,13,40,43));

	}
	public static int horaMayor (int hora1, int minuto1, int segundo1, int hora2, int minuto2, int segundo2) {
		int resultado = 0;
		
		if ((hora1 >= 0 && hora1 <= 23)&&(minuto1 >= 0 && minuto1 <= 59)&&(segundo1 >= 0 && segundo1 <= 59)&&(hora2 >= 0 && hora2 <= 23)&&(minuto2 >= 0 && minuto2 <= 59)&&(segundo2 >= 0 && segundo2 <= 59)) {
			if (hora1 > hora2) {
				resultado = 1;
			} else if (hora2 > hora1) {
				 resultado = 2;
			} else if (hora1 == hora2) {
				if (minuto1 > minuto2) {
					 resultado = 1;
				}else if(minuto2 < minuto1){
					resultado = 2;
				}else {
					 resultado = 0;
				}
			}else if (hora1 == hora2 && minuto1 == minuto2) {
				if (segundo1 > segundo2) {
					 resultado = 1;
				} else if (segundo2 < segundo1) {
					 resultado = 2;
				} else {
					 resultado = 0;
				}
			}
		}else {
			 resultado = -1000;	
		}
		return resultado;
		
	}

}
