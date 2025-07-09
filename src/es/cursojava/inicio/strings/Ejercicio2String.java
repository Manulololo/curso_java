package es.cursojava.inicio.strings;

import java.util.Scanner;

public class Ejercicio2String {

	public static void main(String[] args) {
//		Ejercicio 1
//		Escribe un programa que reciba un String y devuelva el texto invertido.
		String texto = "Monitor";
		String palabraInvertida = "";

		for (int i = palabraInvertida.length() - 1; i >= 0; i--) {
			System.out.print(texto.charAt(i));
		}

		System.out.println(palabraInvertida);
	}
}
