package Ropa;

public class Boton {

	private String color; //atributos
	private String tamaño;
	private String forma;
	
	public Boton (String color, String tamaño, String forma) {//constructor
	
	this.color = color;
	this.tamaño = tamaño;
	this.forma = forma;
}
	
	public void mostrarInfo() {
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	
	
}


