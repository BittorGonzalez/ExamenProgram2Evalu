package libreria;

import java.util.Scanner;

public class libro extends publicacion {

	int numPaginas;
	
	public libro() {
		super();
		this.numPaginas = 0;
	}

	
	public libro(String codigo, String titulo, int año, int numPaginas) {
		super(codigo, titulo, año);
		this.numPaginas = numPaginas;
	}

	

	@Override
	public void leer(Scanner sc) {
		System.out.println("Introduce el codigo del libro");
		String codigo = sc.next();
		System.out.println("Introduce el titulo del libro");
		String titulo = sc.nextLine();
		sc.nextLine();
		System.out.println("Introduce el año del libro");
		int año = sc.nextInt();
		System.out.println("Introduce el numero de paginas del libro");
		int numero = sc.nextInt();
		
		new libro(codigo, titulo, año, numero);
		
	}
	
	@Override
	public String toString() {
		return "Libro: " + super.toString() + "Numero de paginas: " + this.numPaginas ;
	}
	
}
