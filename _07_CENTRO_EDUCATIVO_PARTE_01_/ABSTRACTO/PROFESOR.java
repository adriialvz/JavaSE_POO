package ABSTRACTO;

public class PROFESOR extends PERSONA {

	//PROPIEDADES
	private String competencias;
	
	
	//CONSTRUCTOR
	public PROFESOR(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		
		this.competencias=competencias;
	}
	
	
	//MÉTODOS
	
	@Override
	public String trabajar() {
		return "EL PROFESOR "+getNombre()+" va a impartir su clase";
	}
	
	
	public String ponerNotas() {
		return "EL PROFESOR "+getNombre()+" va a corregir los examenes";
	}
	
	@Override
	public String toString() {
		return super.toString()+" Competencias: "+competencias;
	}
	
}
