package es.cursojava.metodos.ejercicios;

public class Ejercicio2 {
	public static int nombres(String[]texto){
		int numeroNombres=0;
		for (int i=0  ;i< texto.length  ;i++) {
			if (texto[i].startsWith("A")&& texto[i].contains("t")) {
				numeroNombres++;
			}
		
	}
return numeroNombres;
}
}