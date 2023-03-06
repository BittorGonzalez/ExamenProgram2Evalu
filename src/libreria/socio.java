package libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class socio {

	String dni;
	String nombre;
	String apellido;
	int edad;
	ArrayList<publicacion> aPublicacion;
	
	public socio() {
		this.aPublicacion = new ArrayList<publicacion>();

	}

	public socio(String dni, String nombre, String apellido, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.aPublicacion = new ArrayList<publicacion>();
	}
	
	public void leer(Scanner sc) {
		System.out.println("Introduce tu dni");
		this.dni = sc.next();
		System.out.println("Introduce tu nombre");
		this.nombre = sc.next();
		System.out.println("Introduce tu apellido");
		this.apellido = sc.next();
		System.out.println("Introduce tu edad");
		this.edad = sc.nextInt();
		while(this.edad < 0) {
			System.out.println("ERROR, tu edad debe ser mayor a 0");
			System.out.println("Introduce de nuevo");
			this.edad = sc.nextInt();
		}
		
	}
	
	public void añadirPublicacion(publicacion p) {
		
		this.aPublicacion.add(p);
	}
	
	public void print() {
		
		System.out.println("DNI: " + this.dni);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Edad: " + this.edad);
		for(publicacion s:aPublicacion) {
				System.out.println(s);
			}
		System.out.println("*****************************");
	}
	
	
}
