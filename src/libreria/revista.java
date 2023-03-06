package libreria;

import java.util.Scanner;

public class revista extends publicacion{
	
	int numero;
	
	public revista() {
		super();
		this.numero = 0;
	}
	public revista(String codigo, String titulo, int año, int numero) {
		super(codigo, titulo, año);
		this.numero = numero;
	}
	
	@Override
	public void leer(Scanner sc) {
		
		System.out.println("Introduce el codigo de la revista");
		String codigo = sc.next();
		System.out.println("Introduce el titulo de la revista");
		String titulo = sc.nextLine();
		sc.nextLine();

		System.out.println("Introduce el año de la revista");
		int año = sc.nextInt();
		System.out.println("Introduce el numero de la revista");
		int numero = sc.nextInt();
		
		new revista(codigo, titulo, año, numero);
	}

	@Override
	public String toString() {
		return "Revista: " + super.toString() + "Numero de revista: " + this.numero ;
	}
	
	

}
