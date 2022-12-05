package _07_RECTANGULO_;

public class RECTANGULO {

	
	//PROPIEDADES
	public static String descripcion= "Figuritas";
	private int ancho;
	private int alto;
	
	
	//CONSTRUCTOR
	public RECTANGULO(String descripcion, int ancho, int alto) {
		this.descripcion=descripcion;
		this.ancho=ancho;
		this.alto=alto;
	}

	
	
	//MÉTODOS
	public String area() {
		return "El area del rectangulo es: "+ancho * alto;
	}

	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "RECTANGULO: "+descripcion+ " [ancho= " + ancho + " X alto= " + alto + "]";
	}
}
