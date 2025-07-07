package inicio.ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1.Pintar cuadrado");
		System.out.println("2.Validar email");
		System.out.println("3.Añadir alumno");
		System.out.println("4.Salir");

		System.out.println("Elegir una opcion: ");
		String opcion = scanner.nextLine();

		if (opcion.equals("1")) {
			System.out.println("Ha seleccionado Pintar cuadrado ");
		} else if (opcion.equals("2")) {
			System.out.println("Ha selceccionado Validar email");
		} else if (opcion.equals("3")) {
			System.out.println("Ha selceccionado Añadir alumno");
		} else if (opcion.equals("4")) {
			System.out.println("Adios");
		
			
			
		}
	}

}
