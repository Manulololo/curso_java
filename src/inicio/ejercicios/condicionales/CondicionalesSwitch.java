package inicio.ejercicios.condicionales;

public class CondicionalesSwitch {

	public static void main(String[] args) {
		String mes = "enero";
	//Tengo que poner break para que no pinte todo lo que veiene despues.	
		switch (mes) {
		case "enero" : System.out.println("Invierno");//si pongo enero me agrupa todo el invierno porque no he puesto un break
		case "febreo" : System.out.println("Invierno");
		case "marzo" : System.out.println("Invierno");
		case "abril" : System.out.println("Primavera");break;
		case "mayo" : System.out.println("Primavera");break;
		case "junio" : System.out.println("Horror1");break;
		case "julilo" : System.out.println("Horror2");
		}
System.out.println("Termina");
//default : System.out.println("Mes");
	}

}
