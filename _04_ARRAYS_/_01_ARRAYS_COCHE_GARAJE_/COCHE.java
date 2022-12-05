package _01_ARRAYS_COCHE_GARAJE_;

public class COCHE {
	
	
	private String matricula;
	private String marca;
	private String modelo;
	
	
//*****************************************************************************************************************	
	
	
	public COCHE(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	
//*****************************************************************************************************************	
	
	
	public String verCoche() {
		return this.matricula + " " + this.marca + " " + this.modelo;
	}
}
