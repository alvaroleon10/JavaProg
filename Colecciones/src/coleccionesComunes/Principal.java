package coleccionesComunes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		GenericoEjemplo <String, String> entradaDiccionario = new GenericoEjemplo<String,String>("Abedul", "tipo de árbol");
		
		//System.out.println(entradaDiccionario);
		
		
		List<String> listaNombres = new ArrayList<>();
		
		listaNombres.add("Álvaro");
		listaNombres.add("Fernando");
		listaNombres.add("Martin");
		listaNombres.add("Andrés");
		listaNombres.add("Jaime");
		listaNombres.add("Álvaro");
		listaNombres.add("Fernando");
		listaNombres.add("Martin");
		listaNombres.add("Andrés");
		listaNombres.add("Jaime");

		System.out.println(listaNombres.size());
		System.out.println(listaNombres);
		
		Set <String> listaNoRepe = new HashSet<>();
		listaNoRepe.addAll(listaNombres);
		System.out.println(listaNoRepe.size());
		System.out.println(listaNoRepe);
	}

}
