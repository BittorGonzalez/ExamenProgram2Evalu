package libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaSocios {

	ArrayList<socio> listaSocios;
	
	public ListaSocios(ArrayList<socio> array) {
		this.listaSocios = array;
	}
	
	public void fillData() {
		listaSocios.add(new socio("4738473Q", "Pedro", "Jimenez", 73));
		listaSocios.add(new socio("9274627F", "Paula", "Gimenez", 34));
		listaSocios.add(new socio("0346273Y", "Gorka", "Barredo", 47));
	}
	
	public boolean esSocio(String dni) {
		
		for(socio s: listaSocios) {
			if(s.dni.equals(dni)) {
				return true;
			}
		}
		return false;
		
	}
	
	public void hacerSocio() {
		Scanner sc = new Scanner(System.in);
		socio socio = new socio();
		socio.leer(sc);
		
		listaSocios.add(socio);
		
	}
	
	public int posicionSocio(String dni) {
		for(int i = 0; i<listaSocios.size(); i++) {
			if(listaSocios.get(i).dni.equals(dni)) {
				return i;
			}
		}
		return -1;
		
	}

	
}
