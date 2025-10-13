package Ropa;

public class Maniqui {

	private int id;
	private Pantalon pantalon;
	private Camisa camisa;
	private Vestido vestido;

	public Maniqui (Pantalon pantalon, Camisa camisa) {
		
	this.pantalon = pantalon;
	this.camisa = camisa;
	this.id = (int) (Math.random()*10);//add cast no lo pide el ejercicio pero es para que todo tenga un ID.
}
	public Maniqui(Vestido vestido) {
	this.vestido = vestido;
	this.id = (int) (Math.random()*10);//add cast
	}
	
	public Maniqui() {
	this.id = (int) (Math.random()*10);//add cast
	
	}
	public void mostrarInfo() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}
}
