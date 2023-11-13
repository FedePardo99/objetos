package clase;

import java.util.Scanner;

public class Pruebas {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String [] args) {
	 // Libro l;
	  System.out.print("ingrese la cantidad de libros: ");
	  int libros = scan.nextInt();
	  
	  Libro arrayLibros[] = new Libro[libros];
	  
	  for(int i = 0;i<arrayLibros.length;i++) {
		  System.out.println("Datos del libro "+(i+1)+":");
		  scan.nextLine();
		  System.out.print("Ingrese ISBN: ");
		  String ISBN = scan.nextLine();
		  
		  System.out.print("Ingrese titulo: ");
		  String titulo = scan.nextLine();
		  
		  System.out.print("Ingrese autor: ");
		  String autor = scan.nextLine();
		  
		  System.out.print("Ingrese cantidad de paginas del libro: ");
		  int nPaginas = scan.nextInt();
		  
		  System.out.println();
		  arrayLibros[i] = new Libro(ISBN,titulo,autor,nPaginas);
	  
	  }
	  
	  int maxPagina = buscarIndice(arrayLibros);
	  
	  System.out.println("el libro con mas paginas es: ");
	  
	  arrayLibros[maxPagina].imprimirLibro();
	  
	  
	  
	}
	
	public static int buscarIndice(Libro array[]) {
		int maximo = array[0].getNumPagina();
		int indice = 0;
		for(int i = 1;i<array.length;i++) {
			if(maximo < array[i].getNumPagina()) {
				maximo = array[i].getNumPagina();
				indice = i;
			}
		}
		return indice;
	}
	
}
