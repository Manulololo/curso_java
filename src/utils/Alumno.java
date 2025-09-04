package utils;

import java.util.Arrays;

public class Alumno {
// estos son privados "privado"
	//public String nombre;      en Colegio.java seria:          alumno2.nombre("Pere");
	public String nombre;        
	private String dni;
	private double notaMedia;
	private String[] asignatura;

//para poder acceder porque (publicos) boton derecho _generate Getters and Setters _ select_generate.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
			System.out.println("Suspendido.");

		}
		if (notaMedia > 5) {
			System.out.println("Aprobado.");

		}
		if (notaMedia > 9) {
			System.out.println("Fenomeno.");

		}

	}
}
