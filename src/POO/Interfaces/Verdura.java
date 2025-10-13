package POO.Interfaces;

public abstract class Verdura {

	private String procedencia;
	
	public Verdura(String procendencia) {
		
		super();
		this.procedencia = procedencia;
		
		
	} 

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	
	
	
	
}
