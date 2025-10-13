package ejerciciosClase;

import java.util.HashMap;
import java.util.Map;

import es.cursojava.oo.Persona;

public class Mapas {
	
	public static void main (Strin[]args) {
		
		Map<String,Persona> persona = new HashMap();
		
		Persona p = new Persona ("N1", "A1","111A", 18);
		personas.put(p.getDn1 () ,p);
		Persona p2 = new Persona ("N2", "A2", "111A", 38);
		Persona p3 = personas.put(p2.getDni(),p2);
		System.out.println(p3.getNombre());
		
		Persona p4 = new Persona("N2", "A2", "222B", 38);
		personas.put (p4.getDni(), p2);
		
		//Recupero los datos de una persona.
		String dni= Utilidades.pideDatoCadena("Introduce un dni");
		Persona persona = personas.get(dni);
		
	}
    
}
 