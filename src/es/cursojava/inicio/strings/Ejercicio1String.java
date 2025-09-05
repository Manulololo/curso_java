package es.cursojava.inicio.strings;

import java.util.Scanner;

public class Ejercicio1String {

	public static void main(String[] args) {
//		Ejercicio 1
//		Escribe un programa que reciba un String y devuelva el texto invertido.
		System.out.println("Introduzca una frase:");
		Scanner scan = new Scanner(System.in);
		String palabraUsuario = scan.nextLine();

		String palabraInvertida = "";

		for (int i=palabraUsuario.length()-1; i >= 0; i--) {
			palabraInvertida += palabraUsuario.charAt(i);
		}

		System.out.println(palabraInvertida);

		if (palabraInvertida.equals(palabraUsuario)) {
			System.out.println(palabraUsuario + " es palindromo");

		} else {
			System.out.println(palabraUsuario + " NO es palindromo");
		}

	}
}
