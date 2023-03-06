package libreria;

import java.util.ArrayList;

public class Catalogo {

	ArrayList<publicacion> lista;
	
	public Catalogo(ArrayList<publicacion> array) {
		this.lista = array;
		
	}
	
	public void fillData() {
		
		lista.add(new revista("REV1", "MasQMotos", 2015, 56 ));
		lista.add(new revista("REV2", "MasQCoches", 2022, 12 ));
		lista.add(new revista("REV3", "CiclismoAFondo", 2019, 456 ));
		lista.add(new libro("LIB1", "Caperucita roja", 1934, 322 ));
		lista.add(new libro("LIB2", "Los tres cerditos", 1945, 180 ));
		lista.add(new libro("LIB3", "Hansel y gretel", 1967, 233 ));

		
	}
	
	public int posicionPublicacion(String codigo) {
		
		for(int i = 0; i<lista.size(); i++) {
			if(lista.get(i).codigo.equals(codigo)) {
				return i;
			}
		}
		return -1;
		

		
	};
	
}
