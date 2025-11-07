package curso.java.notainvalida;

import lombok.Getter;
import lombok.Setter;

public class Alumno {

	private int edad;
	private double nota;

	@Getter
	@Setter

	public Alumno(int edad, double nota) throws NotaInvalidaException {

		if (edad <= 0) {
			throw new IllegalArgumentException("La edad tiene que se mayor de 0.");

		} else {

			this.edad = edad;

		}
		if (nota < 0 || nota > 10) {

			throw new NotaInvalidaException("La nota debe estar entre 0 y 10");

		} else {

			this.nota = nota;

		}

	}
}
