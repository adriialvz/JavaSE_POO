package _02_COMPOSICION_MOTOR_COCHE_;

public class COCHE {

	private String matricula;
	private String marca;
	private String modelo;
	private MOTOR motor;
	
	
	public COCHE (String matricula, String marca, String modelo, int caballos, String tipoCombustible) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.motor = new MOTOR(caballos, tipoCombustible);
	}
	
	
	
	//METODOS
	public MOTOR getMotor() {
		return this.motor;
	}
	

	public void setInfo() {
		System.out.println("Matricula: "+this.matricula+" Marca: "+this.marca+" Modelo: "+this.modelo+" Caballos: "
				+motor.getCaballos()+"CV"+" Combustible: "+motor.getTipoCombus()+" "+getMotor()+"\n");
	}


	@Override
	public String toString() {
		return "COCHE [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + 
				", motor=" + motor.getCaballos()+", combustible="+getMotor().getTipoCombus()+ "]";
	}
	
}
