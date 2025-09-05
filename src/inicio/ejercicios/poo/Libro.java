package inicio.ejercicios.poo;

public class Libro {

	private String titulo;
	private String autor;
	private String isbn;

	public Libro (String autor, String titulo, String isbn) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}
	public void mostrarInfo() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Isbn: " + isbn);
		System.out.println();
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
	


}
