package inicio.ejercicios;

import java.util.Scanner;

public class PideDatos {

	public static void main(String[] args) {
		System.out.println("Introduce el nombre de tu calle:");
		Scanner scan = new Scanner(System.in);
		String nombreCalle = scan.nextLine();

		System.out.println("Introduce el numero de tu calle:");
		scan = new Scanner(System.in);
		int numeroCalle = scan.nextInt();

		System.out.println("Introduce el nombre de tu pueblo:");
		scan = new Scanner(System.in);
		String poblacion = scan.nextLine();

		System.out.println(nombreCalle + " " + numeroCalle + " " + poblacion);

		boolean esGrande = numeroCalle > 100;
		System.out.println("La calle es grande:" + esGrande);
		// numero calle = 7
		// numeroCalle = numeroCalle +1;
		// numeroCalle +=1;

		System.out.println(numeroCalle % 2 == 0);

		// 30/06/2025
		// numeroCalle *= 3;
		// System.out.println(numeroCalle);24
		// System.out.println(++numeroCalle);
		// System.out.println(numeroCalle);

		// System.out.println (Math.random());

		double numeroAleatorio;

	}

}
