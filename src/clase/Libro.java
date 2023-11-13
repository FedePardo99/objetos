package clase;

public class Libro {
	
	private String ISBN;
	private String titulo;
	private String autor;
	private int numPagina;
	
	public Libro(String ISBN, String titulo, String autor, int numPagina){
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPagina = numPagina;
	}
		

	public int getNumPagina() {
		return numPagina;
	}
	
	public void imprimirLibro() {
		System.out.println("el Libro "+this.titulo+" con ISBN "+this.ISBN+" creado por el autor "+this.autor+", tiene "+this.numPagina+" paginas.");
	}
	
	

}
