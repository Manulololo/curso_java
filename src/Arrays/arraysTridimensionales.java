package Arrays;

import java.util.Scanner;

public class arraysTridimensionales {

	public static void main(String[] args) {

		int[][] numeros = new int[2][3];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				// System.out.println("Numeros en la posicion:" + numeros[i][j] );
				// Ingresar.
				System.out.println("Introduzca el numero en la posicion:" + "  [" + i + "]" + "[" + j + "]");
				numeros[i][j] = scan.nextInt();
			}

		}
		for (int i = 0; i < numeros.length; i++)
			

		{

		}
	}

}