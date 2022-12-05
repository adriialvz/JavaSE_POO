package _01_EXCEPCION_NO_COMPROBADA_;

public class COCHE {

	
	//PROPIEDADES
	private String marca;
	private String modelo;
	private int velocidad;
	
	
	
	//CONSTRUCTOR
	public COCHE(String marca, String modelo) {
		this.marca= marca;
		this.modelo= modelo;
		this.velocidad= 0;
	}
	
	
	//METODOS
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + "]";
	}


	/*public void acelerar(int cuanto) {
		velocidad= velocidad + cuanto;
	}*/
	
	
	public void acelerar(int cuanto) {
		velocidad= velocidad + cuanto;
		if (velocidad > 120) {
			throw new EXCESO_VELOCIDAD_EXPECTION(velocidad);
		}
	}
		
	public void frenar(int cuanto) {
		velocidad= velocidad - cuanto;
	}
}
