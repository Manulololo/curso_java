package inicio.ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String operacion =  scan.nextLine();
		String operacion2 = "suma";
		String operacion3 = new String ("Suma");
		
		if (operacion == "suma") {
			System.out.println("Suma1");
		}
		if(operacion2 == "suma") {
			System.out.println("Suma2");
		}
		if (operacion3 == operacion2 ) {
			System.out.println("Suma3");
		}
		}
	}
		
