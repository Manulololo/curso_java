//Crea un programa que cuente cuántas vocales (a, e, i, o, u) tiene un String. 
//Ignora las mayúsculas y minúsculas.
package es.cursojava.inicio.strings;

import java.util.Scanner;

public class EjercicioString3 {
	public static void main(String[] args) {
		String frase = "En un lugar de la Mancha" + "cuyo nombre no puedo acordarme";
		
		String fraseMinuscular= frase.toLowerCase();
		
		for (int i=0; i<frase.length(); i++){
			char caracter = fraseMinusculas.charAt(i);
			
			if (caracter == 'a'&|| caracter == 'e' || caracter == 'i')  || caracter == 'o'
|| caracter == 'u') {
	contadorVocales++;	
	vocalesFrase += caractr+"-";
			}
			
		}
		
		
		
		

	}

}
