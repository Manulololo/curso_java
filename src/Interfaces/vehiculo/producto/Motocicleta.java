package Interfaces.vehiculo.producto;

public class Motocicleta extends VehiculoMotorizado implements Consultable, Insertable, Updatable  { //hereda de VehiculoMotorizado
//tiene que implementar consultable, Insertable, Updatable.
	
	private String motocicleta;

public Motocicleta(long id, String motor, String motocicleta) {
	super(id, motor);
	this.motocicleta = motocicleta;
}

public String getMotocicleta() {
	return motocicleta;
}

public void setMotocicleta(String motocicleta) {
	this.motocicleta = motocicleta;
}

@Override
public void encender() {
	// TODO Auto-generated method stub
	
}

@Override
public void apagar() {
	// TODO Auto-generated method stub
	
}

@Override
public void Uptadate() {
	// TODO Auto-generated method stub
	
}

@Override
public void insert() {
	// TODO Auto-generated method stub
	
}

@Override
public void select() {
	// TODO Auto-generated method stub
	
}
	
	
	 
	
}
