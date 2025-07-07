package inicio.ejercicios.condicionales;

public class CondicionalesIf {

	public static void main(String[] args) {
		
		//int numero = Math.random()*10;
		//me daria un double.lo tengo que convertir a entero.
		int numero = (int) (Math.random()*10);
		System.out.println(numero);
		
		if (numero>5) {
			System.out.println("El número es mayor de 5,"+ numero);
		}else if (numero>=5 && numero<7) {
			System.out.println("El numero es mayor de 5 y menor de 7");
			
			
		}else if (numero>=2 || numero<5) {
			System.out.println("El numero es");
			
			
			
			
		}else {
			System.out.println("El número es menor de 5");
			
		}
		
		

	}

}
