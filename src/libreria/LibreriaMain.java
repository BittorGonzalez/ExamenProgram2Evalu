package libreria;
import java.util.ArrayList;
import java.util.Scanner;

public class LibreriaMain {

	public static void main(String[] args) {
		
		boolean registrado = false;
		boolean encontrado = true;
		int opc;
		String tipo = "";
		
		Scanner sc = new Scanner(System.in);
		ListaSocios ls = new ListaSocios(new ArrayList<socio>());
		socio socio = new socio();
		Catalogo catalogo = new Catalogo(new ArrayList<publicacion>());
		
		ls.fillData();
		catalogo.fillData();
		

		System.out.println("*****************Bienvenido a la libreria virtual**********************");
		System.out.println("Introduce tu dni");
		String dni = sc.next();
		
		if(ls.esSocio(dni) == false) {
			System.out.println("No estas registrado, introduce tus datos para hacerlo");
			socio.leer(sc);
			ls.listaSocios.add(socio);
			System.out.println("Los datos del socio se han guardado");
		}
		
		
		do {
			System.out.println();
			System.out.println("0- Salir");
			System.out.println("1- Mostrar el catalogo");
			System.out.println("2- Alquilar algo");
			System.out.println("3- Mostrar todos los socios");
			System.out.println("4- Añadir una revista o un libro");
			System.out.println("5- Mostrar las publicaciones que tiene un socio alquiladas");
			System.out.println("Opcion: ");
			 opc = sc.nextInt();
			 
			 switch(opc) {
			 	case 1:
			 		System.out.println("********Mostrar el catalogo********");
			 		for(publicacion p:catalogo.lista) {
			 			System.out.println(p);
			 		}
			 		break;
			 		
			 	case 2:
			 		System.out.println("********Alquilar algo********");
			 		System.out.println("Introduce un codigo de producto");
			 		String codigo = sc.next();
			 		
			 				 
			 			for(publicacion p: catalogo.lista) {
				 			if(p.codigo.equals(codigo)) {
				 				
				 				ls.listaSocios.get(ls.posicionSocio(dni)).añadirPublicacion(p);
				 				
				 				System.out.println("La publicacion ha sido alquilada");
				 				encontrado = false;
				 		}
				
			 			}
			 		
			 	
			 		
			
			 		
			 		
			 		break;
			 		
			 	case 3:
			 		System.out.println("********Mostrar todos los socios de la libreria********");
			 		for(socio s: ls.listaSocios) {
			 			s.print();
			 		}
			 		
			 		break;
			 	case 4:
			 		System.out.println("********Añadir una revista o un libro********");
			 		System.out.println("Quieres añadir un libro o una revista");
			 		 tipo = sc.next();
			 		 
			 		while(!tipo.equalsIgnoreCase("libro") && !tipo.equalsIgnoreCase("revista")) {
			 			System.out.println("Quieres añadir un libro o una revista");
				 		 tipo = sc.next();
			 		}
			 		
			 		if(tipo.equalsIgnoreCase("libro")) {
			 			libro l = new libro();
			 			l.leer(sc);
			 			catalogo.lista.add(l);
			 		}else if(tipo.equalsIgnoreCase("revista")) {
			 			revista r = new revista();
			 			r.leer(sc);
			 			catalogo.lista.add(r);
			 		}
			 		
			 		break;
			 		
			 	case 5:
			 		System.out.println("********Mostrar publicaciones alquiladas de un socio********");
			 		System.out.println("Introduce un dni: ");
			 		String dni2 = sc.next();
			 		
			 		if(ls.esSocio(dni2) == false){
			 			System.out.println("Ese socio no existe en la libreria");
			 		}else {
			 			
			 			for(socio s:ls.listaSocios) {
			 				if(s.dni.equals(dni2)) {
			 					s.print();
			 				}
			 			}
			 		}
			 		break;
			 	case 0:
			 		sc.close();
			 		System.out.println("Saliendo del programa...");
			 		System.exit(0);
			 }
			
		}while(opc != 0);
		
	
	}

}

