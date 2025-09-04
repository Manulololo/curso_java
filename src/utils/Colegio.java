package utils;

public class Colegio {

	public static void main(String[] args) {
		Alumno alumno0 = new Alumno ();//objeto es alumno0.
		alumno0.setNombre("Manuel");
		alumno0.setDni("111A");
		alumno0.setNotaMedia(6.5);
		alumno0.setAsignatura(new String[] {"Mates", "Lengua", "Recreo"});
		
		alumno0.estudiar();
		
		Alumno alumno1 = new Alumno ();//objeto es alumno1.
		alumno1.setNombre("Paco");
		alumno1.setDni("333A");
		alumno1.setNotaMedia(8.7);
		alumno1.setAsignatura(new String[] {"Mates", "Lengua", "Recreo"});
		
		alumno1.estudiar();
		
		Alumno alumno2 = new Alumno ();//objeto es alumno2.
		
		//alumno2.nombre = "Pere"; si String nombre: public
		alumno2.setNombre("Pere"); // String nombre: private
		alumno2.setDni("555A");
		alumno2.setNotaMedia(3.5);
		alumno2.setAsignatura(new String[] {"Mates", "Lengua", "Recreo"});
		
		alumno2.estudiar();
		
		
	}

}
