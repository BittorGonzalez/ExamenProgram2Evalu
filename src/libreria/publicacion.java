package libreria;
import java.util.Scanner;

public abstract class publicacion {

	String codigo;
	String titulo;
	int año;
	
	publicacion(){
		this.codigo = "";
		this.titulo = "";
		this.año = 0;
	}
	
	public publicacion(String codigo, String titulo, int año) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.año = año;
	}
	
	@Override
	public String toString() {
		return "publicacion [codigo=" + codigo + ", titulo=" + titulo + ", año=" + año+"], ";
	}


	public abstract void leer(Scanner sc);

}