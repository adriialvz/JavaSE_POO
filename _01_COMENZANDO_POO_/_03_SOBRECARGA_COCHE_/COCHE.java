package _03_SOBRECARGA_COCHE_;

public class COCHE {
	
	
	//PROPIEDADES
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private int velocidad;
	
	
	//CONSTRUCTORES SOBRECARGADOS
	public COCHE(String matricula, String marca, String modelo, String color, int velocidad) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad = velocidad;
	}
	
	public COCHE(String matricula, String marca, String modelo, String color) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad = 0;
	}
	
	
	//MÉTODOS SOBRECARGADOS SETTER
	public void setAcelerar(int velocity) {
		velocidad+=velocity;
	}
	
	public void setFrenar(int velocity) {
		velocidad-=velocity;
	}
	
	public void setAcelerar() {
		velocidad+=20;
	}
	
	public void setFrenar() {
		velocidad-=10;
	}
	
	
	//MÉTODOS
	public int real() {
		return velocidad;
	}
	
	
	//MÉTODOS PARA IMPRIMIR
	public void velocity() {
		System.out.println("LA VELOCIDAD ES DE..."+velocidad);
	}

	
	@Override
	public String toString() {
		return "COCHE [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + 
				", color=" + color + ", velocidad=" + velocidad + "]";
	}
}
