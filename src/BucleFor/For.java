package BucleFor;

public class For {

	public static void main(String[] args) {
		
		for ( int i=0 ; i<5 ; i++) {
			if (i%2==0) {
				continue;  //Pasa hasta la segunda iteracion.
			}
			System.out.println("HOLA"+i);
			if (i%3==0) {
		break;
			}
		}
		System.out.println("Termina");
	}

}
