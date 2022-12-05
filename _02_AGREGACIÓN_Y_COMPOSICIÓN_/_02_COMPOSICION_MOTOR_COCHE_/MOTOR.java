package _02_COMPOSICION_MOTOR_COCHE_;

public class MOTOR {

	
	//PROPIEDADES
	private int caballos;
	private String tipoCombustible;
	
	
	//CONSTRUCTOR
	public MOTOR (int caballos, String tipoCombustible) {
		this.caballos=caballos;
		this.tipoCombustible=tipoCombustible;
	}
	
	//MÉTODOS
	public int getCaballos() {
		return this.caballos;
	}
	

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public String getTipoCombus() {
		return this.tipoCombustible;
	}
	
	
	//IMPRIMIR DATOS
	@Override
	public String toString() {
		return "MOTOR [caballos=" + caballos + ", tipoCombustible=" + tipoCombustible + "]";
	}
	
	
}
