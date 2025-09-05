package Ejercicios;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		//Solicitar por consola el numero de alumnos de un aula. 
		//Pedir para cada alumno su nota
		//Indicar la nota media de todos los alumnos del aula.
		Scanner scan= new Scanner (System.in);
		System.out.println("Introduce el numero de alumnos: ");
		int alumnos = scan.nextInt();
		
		int sumatorioNotas = 0;
		
		
		for (int i = 0; i < alumnos; i++) {
			System.out.println("alumno"+ (i+1));
			int nota = scan.nextInt();
		
		sumatorioNotas+=nota;
		
		
		
		
		
		
		
		}
		
		//System.out.println("La nota media es" + "alumno es " + (sumatorioNotas/numeroAlumnos));
			
	}

}