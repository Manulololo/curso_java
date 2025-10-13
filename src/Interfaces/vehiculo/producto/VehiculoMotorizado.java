package Interfaces.vehiculo.producto;

public abstract class VehiculoMotorizado extends Vehiculo implements Encendible, Apagable,Consultable,Updatable,Insertable{

	
	
	private String motor;

	public VehiculoMotorizado(long id, String motor) {
		super(id);
		this.motor = motor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	
	
	
}
