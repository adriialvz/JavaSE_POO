package _08_CUENTA_BANCARIA_;

import java.time.LocalDate;

public class MOVIMIENTO {
	
	
	//PROPIEDADES
	private LocalDate fecha;
	private String concepto;
	private double cantidad;
	private double saldo;
	
	
	//CONSTRUCTOR
	public MOVIMIENTO(String concepto, double cantidad, double saldo) {
		this.concepto = concepto;
		this.cantidad = cantidad;
		this.saldo = saldo;
		this.fecha = LocalDate.now();
	}
	
	

	@Override
	public String toString() {
		return fecha + " Concepto=" + concepto + ", Cantidad=" + cantidad + ", Saldo=" + saldo;
	}
}
