package POO.Interfaces;

public class Silla extends Mueble  {

	private String material;


	public Silla(String color,String material) {
	
	super(color);
	this.material = material;
	
	
}
   public String getMaterial() {
	  
	   return material;
 }
   
   public void setMaterial(String material) {
	   this.material = material;
   }
   
   
   @Override//si lo pongo aquie es solo para silla. si lo pongo en mueble es para todos los muebles.
   public void limpiar() {
	   System.out.println("Limpiar silla");
   }
}
   
   
   