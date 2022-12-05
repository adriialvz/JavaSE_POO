package ABSTRACTO;

public class ADMINISTRATIVO extends PERSONA {

	//PROPIEDADES
	private String tareas;
	
	
	//CONSTRUCTOR
	public ADMINISTRATIVO(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		
		this.tareas = tareas;
	}
	
	
	
	//MÉTODOS
	
	@Override
	public String trabajar() {
		return "EL ADMINISTRATIVO "+getNombre()+" va a realizar estas tareas: "+tareas;
	}
	
	
	
	public String gestionarMatricula() {
		return "EL ADMINISTRADOR "+getNombre()+" va a gestionar una matricula.";
	}
	
	
	@Override
	public String toString() {
		return super.toString()+" Tareas: "+tareas;
	}
}
