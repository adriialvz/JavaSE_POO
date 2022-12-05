package _04_TREE_MAP_;

public class Articulo {

	private String descripcion;
	private double precio;
	
	public Articulo(String descripcion, double precio) {
		this.descripcion= descripcion; 
		this.precio= precio; 
	}
	
	@Override
	public String toString() {
		return "Descripcion= "+descripcion+", Precio= "+precio;
	}
}
