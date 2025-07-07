
//Pintar el menu hasta que se puse la opción de salir. 
//1. Pintar Cuadrado2. Validar email3. Añadir Alumno4. Salir
//Elige una opción
//Si se pulsa la opción 1, solicitar el tamaño de los lados de un cuadrado y pintar el cuadrado de la siguiente manera:
//Por ejemplo si el tamaño es 4:

package Ejercicios;

import java. util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int opcion = 0; //tiene que estar fuera del bucle do para que coincida con el while.
		do {
			System.out.println("Menu:"+  " \n1. Pintar Cadrado." + "\n2 Validar." + "\n3 Añadir alumno. " + "\n4 Salir.");
			System.out.println("Elige una opcion:");
			Scanner scan = new Scanner (System. in);
			opcion = scan. nextInt ();
			
			//se puede usar switch"mejor porque es una sola variable".
			if (opcion == 1) {
			System.out.println( "Tamaño lados de un cuadrado: ");
			
			}else if (opcion == 2) {
			System.out.println("No funciona");
			
			}else if (opcion == 3) {
			System.out.println("No funciona");
			
			}else {
			
			System.out.println("Salir ");
			}
		
		}while(opcion !=4);//while = do
		
		
		
		

	}

}
//	swtich (opcion){
//case 1 -> System.out.println("Opcion1");
//case 2 ... (ver ejercicio resuelto)