package es.cursojava.metodos.ejercicios;

public class Ejercicio1 {
	public static void mosarTabla(int numero) {
	for (int i=1; i<=10;i++) {
		System.out.println(i+"x"+numero+ ":"+(i*numero));
	}
	
	}
	public static void mostrarTablasMultiplicar(int inicio, int fin) {
		for (int i = inicio; i<=fin; i++) {
			System.out.println("=============================");
			mosarTabla(i);
			System.out.println("=============================");
		}
	}
}
