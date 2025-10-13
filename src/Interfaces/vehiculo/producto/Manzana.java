package Interfaces.vehiculo.producto;

public class Manzana extends Alimento implements Deleatable, Consultable { //las clases solo hereda de otra clase no hay herencia multiple.
                                         //implement vamos a impolementar una interfaz
	                                    // manzana nombre de la clase. Alimento lo que se herda. IMplementamos de las interfaces Delteable y Consultable.
	                                    //Cuando se implementan interfaces se puede.
	
	private int peso;
	private String color;

	public int getPeso() {
		return peso;

	}

	public Manzana(long id, String nombre, double precio, String fechaCaducidad, int peso, String color) {
		super(id, nombre, precio, fechaCaducidad);
		this.peso = peso;
		this.color = color;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void insert() {  //Cada vez que implementamos una interfaz estamos obligados a sobrescribir sus metodos. 
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

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}



}
