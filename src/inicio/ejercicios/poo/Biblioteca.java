package inicio.ejercicios.poo;

public class Biblioteca {
	
	public static void main(String[] args) {
		Direccion dir = new Direccion("Calle Mayor","Madrid",28035);
		Biblioteca biblio = new Biblioteca ("Local",dir); //la variable de biblioteca (dir)
		
		Libro libro1 = new Libro ("Harry Potter","JK Rowling", "333");
		Libro libro2 = new Libro ("","JK Rowling", "333");
		Libro libro3        = new Libro ("Harry Potter","JK Rowling", "333");
		
	}
	private String nombre; // en azul claro la variable.
	private Direccion direccion; // Va a tener un objeto de tipo direccion. Que lo he creado en Direccion.java
	private Libro[] libros; // Arreglo para hacerlo plural.
	private int contadorLibros;
	
	public Biblioteca (String nombre, Direccion direccion) {
		this.nombre = nombre;
		this.direccion = direccion;    
		this.libros = new Libro[10];
		this.contadorLibros = 0;//= new Libro [numLibros];
}

	// Hacer un metodo void (porque no retorna nada) para mostrar los libros de la
	// biblioteca.
	public void mostrarLibros() { // Mostrar la informacion de cada libro que hay en la biblioteca.
		for (Libro libro : libros) { // Libros azul claro, libros que hay en la biblioteca.//tipo de dato azul
										// oscuro.
			libro.mostrarInfo(); // Amarillo nombre de la variable del ciclo.

		}

	}

	public void mostrarInfoBiblioteca() {
		System.out.println("Biblioteca " + nombre);
		// llamar al metodo mostrarDireccion que esta en Direccion.java.
		direccion.mostrarDireccion(); // Luego mostrar los libros de la biblioteca. foreach
		// for (Libro libro : libros) {
		// libro.mostrarInfo(); en vez de hacerlo otra vez llamo al metrodo que tengo
		// hecho. mostrarLibros();
		// }
		mostrarLibros();

	}

	public void agregarLibro(Libro libro) {  // la clase libro asignamos variable a la clase de libro. La clase es en mayusculas. 
		if(contadorLibros < libros.length) {  //
			libros[contadorLibros] = libro;
		} else {
			System.out.println("La biblioteca esta llena");
		}
	}
	
	

	
	
	
	
	
	
	
	
	
	
}