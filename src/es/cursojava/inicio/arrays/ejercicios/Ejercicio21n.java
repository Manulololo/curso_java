package es.cursojava.inicio.arrays.ejercicios;
public class Ejercicio21n {

	public static void main(String[] args) {
	
		
				
				if (args.length<3) {
					System.err.println("Necesarios mínimo 3 datos (operación y números)");
				}else {
					System.out.println("Número de argumentos correcto "+args.length);
					
					String operacion = args[0];
					System.out.println("Se va a realizar la " + operacion + " de: ");
					int resultado = Integer.parseInt(args[1]);
					System.out.println(resultado);
					for (int i=2;i<args.length;i++) {
						System.out.println(args[i]);
						int numero = Integer.parseInt(args[i]);
						
						if (operacion.equalsIgnoreCase("+")) {
							resultado += numero;
							//resultado = resultado +
						}else if (operacion.equalsIgnoreCase("-")) {
							resultado -= numero;
						}else if (operacion.equalsIgnoreCase("x")) {
							resultado *= numero;
						}else {
							System.err.println("Operación no permitida");
							break;
						}
						
					}
//					if (resultadoMultiplica!=1) {
//						resultado = resultadoMultiplica;
//					}
					System.out.println("El resultado es: "+ resultado);
				}

			}

		} 
