package Boletin3;

public class Ejercicio10 {

	public static void main(String[] args) {
		System.out.println(cifrar('a',3));
		System.out.println(cifrar("casado", 3));
		System.out.println(sonEquivalentes("casado", "FDVDGR"));
	}
		public static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz".toUpperCase();
		
		public static char cifrar(char caracter, int desplazamiento) {
			return ABECEDARIO.charAt((ABECEDARIO.indexOf(Character.toUpperCase(caracter))+desplazamiento)
					%ABECEDARIO.length());	
		}
		public static String cifrar(String palabra, int desplazamiento) {
			StringBuilder sb = new StringBuilder();
			if (palabra != null && !palabra.isEmpty()) {
			for (int i = 0; i < palabra.length(); i++) {
				sb.append(cifrar(palabra.charAt(i), desplazamiento));
			}
		}
			return sb.toString();
	}
		public static int sonEquivalentes(String palabra, String otraPalabra) {
			int desplazamiento = 0;
			boolean equivalentes = false;
			while(!equivalentes && desplazamiento<=ABECEDARIO.length()) {
				desplazamiento++;
				if(cifrar(palabra, desplazamiento).equalsIgnoreCase(otraPalabra)) {
					equivalentes=true;
				}
			}
			return equivalentes? desplazamiento: -1;

	}
}