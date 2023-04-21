package boletin1_coleccionesEj6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Diccionario {
	private String palabra;
	private String significado;
	private Map<String,Set<String>>diccionario;
	
	
	public Diccionario(String palabra) {
		super();
		this.palabra = palabra;
		this.significado = significado;
		this.diccionario = new HashMap<>();
	}
	
	public void anadirPalabra (String palabra, String significado) {
		diccionario.put(palabra, new HashSet<String>());
		diccionario.get(palabra).add(significado);
	}
	
	public String buscarPalabra (String palabra) {
		StringBuilder sb = new StringBuilder();
		if(diccionario.containsKey(palabra)) {
			sb.append(diccionario.get(palabra));
		}
		return sb.toString();
	}
	
	public void borrarPalabra (String palabra) {
		if (diccionario.containsKey(palabra)) {
			diccionario.remove(palabra).remove(significado);
		}
	}
	
	public Map<String,Set<String>> devolverPalabraEmpezandoPorCadena (String cadena){
		Map<String,Set<String>> conjuntoPalabras = new TreeMap<>();
		for (String i: diccionario.keySet()) {
			if (i.startsWith(cadena)) {
				conjuntoPalabras.put(i, diccionario.get(i));
			}
		}
		return conjuntoPalabras;
	}
	
	
}
