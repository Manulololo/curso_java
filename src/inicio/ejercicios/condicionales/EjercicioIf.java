package inicio.ejercicios.condicionales;

import java.util.Scanner;
public class EjercicioIf {

	public static void main(String[] args) {
		
	System.out.println("Introducir numero: ");
	Scanner scan = new Scanner(System.in);
	int numero = scan.nextInt(); //pedirle al usuario que introduzca un numero.
	
	
	if (numero %2 ==0){ //numero%2 != 0 (Para saber si en impar)
		System.out.println("El numero" + numero + " es par");
		
	}else {
		System.out.println("Su numero"+ numero+ " es impar");
	}
	
	}	
}

//Otra forma de hacerlo con una doble negativa.

//boolean resultadoCero= numero%2==0;
//if(!resultadoCero){
	//System.out.println("El numero "+numero+" es impar");
//else {
// System.out.println("El numero "+numero+" es par")