package _01_ELECTRODOMESTICOS_SIN_INTERFAZ_;

public class lavadora extends electrodomesticos {

	private final static double CARGA= 5;
	
	private double carga;
	
	//TODOS LOS DATOS POR DEFECTO
	public lavadora() {
		this(PRECIO, COLOR, CONSUMO, PESO, CARGA);
		
		this.precio= PRECIO;
		this.color= COLOR;
		this.consumo= CONSUMO;
		this.peso= PESO;
	}
	
	//MENOS PRECIO Y PESO QUE VAN POR PARAMETROS....EL RESTO VA POR DEFECTO
	public lavadora(double precio, double peso ) {
		this(precio, COLOR, CONSUMO, peso, CARGA);
	}
	
	//HAY QUE PASARLE POR PARAMETROS
	public lavadora(double precio, String color, char consumo, double peso, double carga) {
		super(precio, color, consumo, peso);
		this.carga = carga;
	}
	

	public double getCarga() {
		return carga;
	}
	
	
	@Override
	public double precioFinal() {
		double plus= super.precioFinal();
		
		if(carga > 30) {
			plus+= 50;
		}
		return plus;
	}
}
