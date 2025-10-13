package Interfaces.vehiculo.producto;

public class MainClass {

	public static void main(String[] args) {
		
		//Bicicleta bici1 = new Bicicleta(51615,2);
		//Utilidades.insertObject(bici1);
		
		//Autobus(long id, String motor, int autobus)
		
		Autobus bus1 = new Autobus(54945, "motor gasoil", 1);
		
		Utilidades.encender(bus1);
		

	}

}
