package Interfaces.vehiculo.producto;

public class Ordenador extends ProductoElectronico implements Consultable {

private String  marca;

public Ordenador(long id, String nombre, double precio, String fechaFabricacion, String marca) {
	super(id, nombre, precio, fechaFabricacion);
	this.marca = marca;
}
// Cuando implementamos una interfaz tenemos que 
public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
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
public void select() {
	// TODO Auto-generated method stub
	
}





}





