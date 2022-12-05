package _05_VENTA_;

public class VENTA {

	
	//PROPIEDADES
	private String producto;
	private int cantidad;
	private float precio;
	
	
	//CONTRUCTOR SOBRECARGADO
	public VENTA(String producto, int cantidad, float precio) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	//CONSTRUCTOR SOBRECARGADO
	public VENTA(String producto, float precio) {
		this.producto = producto;
		this.cantidad = 5;
		this.precio = precio;
		}
	
	//METODOS
	public float calcularTotal() {
		return this.cantidad * this.precio;
	}
	
	public float total(){
		return cantidad * precio;
	}
	
	public double calcularImporte(float descuento) {
		return cantidad * precio - ((total() * descuento) /100);
	}
	
	public float calcularTotal(int descuento) {
		float total= cantidad * precio;
		float des= total * descuento /100;
		return total - des;
	}
	
	public float total(int desc) {
		double descuento=total() - ((total()*desc)/100);
		return (float)descuento;
	}
	
	//IMPRIMIR DATOS
	public String ver() {
		return "Producto: "+this.producto+", Cantidad: "+this.cantidad+", Precio: "+this.precio+"€";
	}


	@Override
	public String toString() {
		return "VENTA [producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio + "€"+"]";
	}
	
}
