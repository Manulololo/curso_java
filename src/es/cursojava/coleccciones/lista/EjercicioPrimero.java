package es.cursojava.coleccciones.lista;


import java.util.ArrayList;
import java.util.List;

import utils.Alumno;

public class EjercicioPrimero {

	public static void main(String[] args) {
		
		List<Alumno>lista = new ArrayList<>();
		
		
		Alumno a1 = new Alumno ("Pepe", "74112824D",9);
		Alumno a2 = new Alumno ("Ana", "23884393L",6);
		Alumno a3 = new Alumno ("Tina", "54103928R",8);
		Alumno a4 = new Alumno ("Alicia", "52103528S",9.5);
		Alumno a5 = new Alumno ("Tomas", "66103922N",9);
		Alumno a6 = new Alumno ("Tobias", "34303928Q",4);
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.add(a5);
		lista.add(a6);
		
		mostrarInfoAlumnos(listaAlumnos);   
		
		
		
		}

	public static void mostrarAlumnos(List<Alumno>listaAlumno) {//
	
		System.out.println("Lista completa alumnos: ");
		for (Alumno a : listaAlumno) {
			System.out.println(a);
		
//son los dos estaticos no necesito crear un objeto. si es de instancia si.
		}
		
		}
		//cambiando la clase recorre la copia mientra elimina del original.
	// cuando borra un suspenso se desplaza uno y no puede ser.
	//CopyWriteArrayLIst
	 
	
	}
	

