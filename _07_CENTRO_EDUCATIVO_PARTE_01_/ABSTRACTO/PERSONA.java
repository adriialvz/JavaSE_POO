package ABSTRACTO;

public abstract class PERSONA {

	//PROPIEDADES
	private String nif;
	private String nombre;
	private String direccion;
	private String telefono;
	
	
	//CONSTRUCTOR
	public PERSONA(String nif, String nombre, String direccion, String telefono) {
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	
	//MÉTODOS
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String llamar(PERSONA person) {
		return nombre+" llamando a "+person.nombre;
	}
		
	public abstract String trabajar();

	
	@Override
	public String toString() {
		return "[nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion +
				", telefono=" + telefono+ "]";
	}
}
