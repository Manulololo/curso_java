package Interfaces.vehiculo.producto;

public class Autobus extends VehiculoMotorizado {

	
	public int autobus;
	
	
	
	public Autobus(long id, String motor, int autobus) {
		super(id, motor);
		this.autobus = autobus;
	}

	
	
	public int getAutobus() {
		return autobus;
	}



	public void setAutobus(int autobus) {
		this.autobus = autobus;
	}



	//esto son los metodos que implementa la clase de la cual se esta herdando(Clase abastracta e implementa interfaces).
	@Override
	public void encender() {
		System.out.println("Encendiendo " + this.getClass().getSimpleName());//
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagando " + this.getClass().getSimpleName());//
	}



	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
		
	}



	@Override
	public void Uptadate() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
