package Interfaces.vehiculo.producto;

public abstract class Objeto {

	
	private long id;  //se crea esta para que Producto y Vehiculo hereden el id de aqui.

	public Objeto(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
