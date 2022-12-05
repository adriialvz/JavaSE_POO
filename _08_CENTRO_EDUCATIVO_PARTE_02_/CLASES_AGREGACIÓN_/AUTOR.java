package CLASES_AGREGACIÓN_;

public class AUTOR {

	//PROPIEDADES
	private String nombre;
	private String biografia;
	
	//CONSTRUCTOR
	public AUTOR(String nombre, String biografia) {
		this.nombre = nombre;
		this.biografia = biografia;
	}

	//MÉTODOS
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getBiografia() {
		return biografia;
	}


	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}


	@Override
	public String toString() {
		return "AUTOR [nombre=" + nombre + ", biografia=" + biografia + "]";
	}
}
