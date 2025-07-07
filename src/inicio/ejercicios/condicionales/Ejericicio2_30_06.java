package inicio.ejercicios.condicionales;

import java.util.Scanner;

public class Ejericicio2_30_06 {
	
	public static void main(String[] args) {
		System.out.println("Introduce nombre de asignatura: ");
		Scanner scan = new Scanner (System.in);
		String asignatura = scan.nextLine();
		
		System.out.println("Introduce nombre del alumno: ");
		scan = new Scanner (System.in);
		String alumno = scan.nextLine();
		
		System.out.println("Tu nota es: ");
		scan = new Scanner (System.in);
		int nota = scan.nextInt();
		
		if (nota<5) {
			System.out.println("Estas suspenso.");
		}
		else if (nota>=5 && nota<7) {
			System.out.println("Su nota es un aprobado.");
		}	
		else if (nota>=8 && nota<9) {
		   System.out.println("Su nota es notable.");
		}
		else {
			System.out.println("Su nota es un sobresaliente. ");
		}
		
	}
}

//Ver problema resuelto
		
	