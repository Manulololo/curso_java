package Interfaces.vehiculo.producto;

public class Televisor extends ProductoElectronico implements Consultable, Insertable, Updatable {

	
	private int pulgadas;

	public Televisor(long id, String nombre, double precio, String fechaFabricacion, int pulgadas) {
		super(id, nombre, precio, fechaFabricacion);
		this.pulgadas = pulgadas;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
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



