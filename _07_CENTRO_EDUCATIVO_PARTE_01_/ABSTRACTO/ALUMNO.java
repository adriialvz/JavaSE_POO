package ABSTRACTO;

public class ALUMNO extends PERSONA {

	//PROPIEDADES
	private String curso;
	
	
	//CONSTRUCTOR
	public ALUMNO(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		
		this.curso = curso;
	}
	
	
	
	//MÉTODOS
	@Override
	public String trabajar() {
		return "EL ALUMNO "+getNombre()+" va a estudiar para el curso 1º Bachillerato";
	}
	

	public String hacerExamen() {
		return "EL ALUMNO "+getNombre()+" va a hacer su examen.";
	}
	
	
	@Override
	public String toString() {
		return super.toString()+" Cursando: "+curso;
	}
}
