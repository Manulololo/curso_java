package POO.Interfaces;

public abstract class Mueble implements Limpiable{//clase abstracta.no se pueden crear objetos de esta clase.
	           // clase es abstracta (un mueble puede ser una silla, una mesa etc) no hay necesidad de implementar los metodos a no se que los queramos sobrescribir.               
	private String color;
	
	public Mueble(String color) {
		super();
		this.color=color;
		
	}
	
	public String gertColor() {
		return color;
	}

	public void setColor(String color) {
		this.color=color;
	}
	
}
