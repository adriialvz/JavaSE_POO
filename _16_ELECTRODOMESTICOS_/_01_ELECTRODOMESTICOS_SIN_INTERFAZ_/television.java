package _01_ELECTRODOMESTICOS_SIN_INTERFAZ_;

public class television extends electrodomesticos {

	
	private final static double RESOLUCION= 20;
	
	private double resolucion;
	private boolean tdt;
	
	
	
	public television() {
		this(PRECIO, COLOR, CONSUMO, PESO, RESOLUCION, false);
		
		this.precio= PRECIO;
		this.color= COLOR;
		this.consumo= CONSUMO;
		this.peso= PESO;
		this.tdt= false;
		
	}
	
	
	
	public television(double precio, double peso) {
		this(precio, COLOR, CONSUMO, peso, RESOLUCION, false);
	}
	
	
	
	public television(double precio, String color, char consumo, double peso, double resolucion, boolean tdt) {
		super(precio, color, consumo, peso);
		this.resolucion= resolucion;
		this.tdt= tdt;
	}
	
	

	public double getResolucion() {
		return resolucion;
	}

	public boolean getTdt() {
		return tdt;
	}
	
	@Override 
	public double precioFinal() {
		double plus= super.precioFinal(); 
		
		if(resolucion > 40) {
			plus+= precio*0.3; 
		}
		if(tdt) {
			plus+=50;
		}
		return plus;
	}
}
