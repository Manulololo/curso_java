package Interfaces.vehiculo.producto;

public class Bicicleta extends Vehiculo {

	
	int nuMarchas;

	public Bicicleta(long id, int nuMarchas) {
		super(id);
		this.nuMarchas = nuMarchas;
	}

	public int getNuMarchas() {
		return nuMarchas;
	}

	public void setNuMarchas(int nuMarchas) {
		this.nuMarchas = nuMarchas;
	}
	
	
	
	
	
}
