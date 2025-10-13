package Interfaces.vehiculo.producto;

public abstract class ProductoElectronico extends Producto implements Encendible, Apagable{

	private String fechaFabricacion;

	public ProductoElectronico(long id, String nombre, double precio, String fechaFabricacion) {
		super(id, nombre, precio);
		this.fechaFabricacion = fechaFabricacion;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
	
	
	
}
