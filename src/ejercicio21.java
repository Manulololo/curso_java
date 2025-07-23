import java.util.Scanner;

public class ejercicio21 {
	public static void main(String[] args) {
		
		System.out.println("\n1. Sumar \n2. Restar \n3. Multiplicar \n4. Division");
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		
		if (args.length < 2) {
			System.out.println("error");
			System.exit(1);
		}

		int[] numeros = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			numeros[i] = Integer.parseInt(args[i]);
		}
		
		int resultado = numeros[0];
		
		switch (opcion) {
		case 1: 
			for (int i = 0; i < numeros.length; i++) {
				resultado += numeros[i];
			}
			break;
		case 2:
			for (int i = 0; i < numeros.length; i++) {
				resultado -= numeros[i];
			}
			break;
	    case 3:
		    for (int i = 0; i < numeros.length; i++) {
			    resultado *= numeros[i];
		}
		break;
	    case 4:
			for (int i = 0; i < numeros.length; i++) {
				resultado /= numeros[i];
			}
			break;
		
		System.out.println("El resultado es: " + resultado);

	}
	}
}
