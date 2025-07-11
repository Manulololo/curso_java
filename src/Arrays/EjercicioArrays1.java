//Solicitar el numero de alumnos de una clase. 
//Por cada alumno pedir nota y guardar en la posicion del arrays.
//Cuantos alumnos han aprobado.
//Nota media de todos los alumnos.
package Arrays;

import java.util.Scanner;

public class EjercicioArrays1 {

	public static void main(String[] args) {
		System.out.println("Numero alumnos clase: ");
		Scanner scan = new Scanner(System.in);
		int numeroAlumnos = scan.nextInt();

		double[] notas = new double[numeroAlumnos];

		for (int i = 0; i < numeroAlumnos; i++) {
			System.out.println("Introduce la nota del alumno " + (i + 1) + " :");
			double notaAlumno = scan.nextDouble();
			notas[i] = notaAlumno;
		}
		
		for (int i = 0 ; i< numeroAlumnos; i++) {
			System.out.println(notas[i]);
		}
		
		for ( double nota : notas ) {

		 System.out.println(nota);

	}
}
}