package Interfaces.vehiculo.producto;//no constructor ni atributos, porque es una clase con metodos estaticos.(Se puede pero no hay necesidad).

public class Utilidades {

	public static void selectObject(Consultable c) {

		c.select();

	}
	
	public static void insertObject(Insertable i) {
		
		i.insert();
	}
	
	public static void updatable(Updatable u){
		
	    u.Uptadate();
	
	}
	
	public static void deletable(Deleatable d) {
		
		
		d.delete();
	}
	
	public static void encender(Encendible e) {
		e.encender();
		
	}

	public static void apagar(Apagable a) {
		// TODO Auto-generated method stub
		
	}





}
	
