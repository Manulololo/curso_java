package BucleFor;

import java.util.Scanner;


public class Pedir10 {

	public static void main(String[] args) {
		// Pedir 10 numeros --> Indicar cuantos son multiplos de 3 y cuantos multiplos
		// de 5.

		
		
		System.out.println("Introduzaca un numero: ");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		//while(num<10) {
		//}
		// num++
		for ( int i = 0; i < 10; i++) {
			System.out.println("Mumero"+ i);
		int numero1 = scan. nextInt();
		
		if (numero % 3 == 0) {
			System.out.println(numero);
		}
		// no porque 15 es multiplo de 3 y 5 pero lo contaria solo de 3} else if (numero % 5 == 0) {
		if (numero%5==0) {
			contador5 ++;
		}
		}
			
			
			
			System.out.println(numero);
		
		
		
	
	System.out.println("Multiplos de 3 y 5:");

		scan.close();
		}
		}
	}

}
