//Colegio con 2 aulas y 3 puestos en cada aula
//1. Insertar Alumnos -> Va a solicitar el nombre de los alumnos para las aulas que tengan puestos disponibles
//2. Mostrar Alumnos -> Muestra los alumnos por aula, si un puesto no tiene alumno, mostrar (vacio)
//3. Buscar Alumno -> Solicitar texto, Ju, mostrar aula y puesto en el que se encuentra el alumno que contenga el texto introducido
//4. Borrar Alumno -> Solcitar nombre, y se borra a todos los alumnos que tengan ese nombre.
//5. Salirpackage Arrays;
package Arrays;

import java.util.Scanner;
 
public class EjercicioClase {

	public static void main(String[] args) {

		System.out.println("");

		System.out.println();
		System.out.println("Introducir alumnos");
		String aulas[][] = new String[2][3];
		Scanner scan = new Scanner(System.in);
		boolean menu = true;
		int opcion = 0;
		while (menu) {
			System.out.println("1.Insertar Alumnos.");
			System.out.println("2.Mostrar Alumnos.");
			System.out.println("3.Buscar Alumno.");
			System.out.println("4.Borrar Alumno");
			System.out.println("5.Salir");

			System.out.println("Introduce una opción");
			opcion = scan.nextInt();
			if (opcion == 1) {
				scan.nextLine(); // <-- LIMPIAR BUFFER de nextInt()

				boolean alumnoIngresado = false;

				for (int i = 0; i < aulas.length; i++) {
					for (int j = 0; j < aulas[i].length; j++) {
						if (aulas[i][j] == null) {
							System.out.println("Introduce el alumno a ingresar: ");
							scan = new Scanner(System.in);
							String NombreAlumno = scan.nextLine();
							aulas[i][j] = NombreAlumno;
							System.out.println("El alumno " + NombreAlumno + " ha sido ingresado en Aula " + (i + 1)
									+ ", Puesto " + (j + 1));
							alumnoIngresado = true;
						}
					}
				}
			}
			
			if (opcion == 2) {
				for (int i=0; i< aulas.length; i++) {
					for(int j= 0; j< aulas[i].length; j++) {
						System.out.print("\t"+aulas[i][j]);
					}
					System.out.println();
				}
			}
			//3. Buscar Alumno -> Solicitar texto, Ju, mostrar aula y puesto en el que se encuentra el alumno que contenga el texto introducido
			if (opcion == 3) {
				System.out.println("Introduzca el nombre a buscar: ");
				scan = new Scanner(System.in);
				String nombreBuscar = scan.nextLine();
				for (int i=0; i< aulas.length; i++) {
					for (int j=0; j< aulas [i].length; j++) {
						if (nombreBuscar.equals(aulas [i][j])) {
							System.out.println("El aula en la que se encontra el alumno es " + i + " y el puesto es: " +j);
						}
					}
				}
			}
			
			
			
			
			if (opcion == 5) {
				menu = false;
			}

		}
		System.out.println("Adios");
	}

}
