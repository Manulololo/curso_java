package utils;

import java.util.Arrays;

public class Alumno {
// estos son privados "privado"
	// public String nombre; en Colegio.java seria: alumno2.nombre("Pere");
	private String nombre; //variables del objeto(que se puede crear en cualquier parte) (alumno0) no de la class Alumno
	private String dni;
	private double notaMedia;
	private String[] asignatura;
// constructor del objeto es public Alumno. Para inicializar el objeto.
	public Alumno(String nombre, String dni, double notaMedia, String[] asignatura) {
		super();
		this.nombre = nombre; // this es solo para ese objeto.
		this.dni = dni;
		this.notaMedia = notaMedia;
		this.asignatura = asignatura;
	}

	public Alumno(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

//si los tengo privados no puedo acceder a ellos. Creo metodos publicos para acceder a ellos. 
//para poder acceder porque (publicos) boton derecho _generate Getters and Setters _ select_generate.
	public String getNombre() { //metodos accesorios. Porque las variables son privadas.
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;// this: hace referencia al nombre de ese objeto.
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String[] getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String[] asignatura) {
		this.asignatura = asignatura;
	}

	public void estudiar() {
		System.out.println("El estudiante " + nombre + " tiene " + Arrays.toString(asignatura));
		System.out.println("Su nota media es: " + notaMedia);

		if (notaMedia < 5) {
			System.out.println("Suspendido.\n");

		}
		if (notaMedia > 5) {
			System.out.println("Aprobado.\n");

		}
		if (notaMedia > 9) {
			System.out.println("Fenomeno.\n");

		}

	}
}
