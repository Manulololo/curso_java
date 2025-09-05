package Ejercicios;

//saldo = 500
//Si es otro numero numero se vuelve a formular la pregunta
//
//¿Cuánto dinero quieres apostar? 
//Si el importe de la apuesta es > que el saldo disponible por el usuario,
//se notifica y se vuelve a formular la pregunta
//
//De manera aleatoria generar un nº entre 0 y 36
//
//Si el numero apostado es = al nº aleatorio, se multiplica lo apostado *36 y se suma al saldo no apostado
//Si no lo es le restamos del saldo la cantidad apostada
//
//Si tiene saldo le perguntamos ¿Quieres seguir jugando? si dice que no le indicamos el saldo con el que se va y si no tiene saldo le indicamos que se ha quedado sin dineropackage Ejercicios;

import java.util.Scanner;

public class Ruleta {

public static void main(String[] args) {
		int numero = 0;
		double saldo = 500;
		
		do {
		
			System.out.println("Del 0 al 36, por que número quieres apostar:? ");
			Scanner scan = new Scanner (System.in);
			int numero1 = scan .nextInt();
			if (numero > 36)
				System.out.println("Opcion incorrecta.");
			
			int dinero = 0;
			
			System.out.println("Cuanto dinero quieres apostar?");
			scan = new Scanner (System.in);
			dinero = scan.nextInt();
			
			if (saldo > 500) {
				System.out.println("No apostar mas de 500€");
			}else {
				System.out.println("Continue.");
			}
			
			int numero2= (int) (Math.random()*37);
			System.out.println(numero);
		
		}while(numero < 36);
		
	System.out.println("El numero ");	
			
	}

}
