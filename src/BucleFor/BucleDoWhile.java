package BucleFor;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		
		String respuesta="";
		int contador = 0;
		do {
			
			//Contador++;  
			System.out.println("Hola");
			Scanner scan = new Scanner(System.in);
			System.out.println("Quieres continuar?");
			respuesta = scan.nextLine();
			contador++;   //Depende donde pones el contador suma 2 o 3.

		}while (respuesta.equals("si"));
		System.out.println("Termina");

	}
}
