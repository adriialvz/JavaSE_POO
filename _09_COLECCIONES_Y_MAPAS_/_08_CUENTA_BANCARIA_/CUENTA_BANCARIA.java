package _08_CUENTA_BANCARIA_;

import java.util.ArrayList;

public class CUENTA_BANCARIA {
	
	//PROPIEDADES
	private int numeroCuenta;
	private String cliente;
	private double saldo;
	private ArrayList<MOVIMIENTO> movimientos;
	
	
	//CONSTRUCTOR
	public CUENTA_BANCARIA(int numeroCuenta, String cliente) {
		this.numeroCuenta = numeroCuenta;
		this.cliente = cliente;
		this.saldo = 0;
		this.movimientos = new ArrayList<MOVIMIENTO>();
	}
	
	
	//METODOS
	public void agregarMovimiento(String concepto, double cantidad) {
		saldo = saldo + cantidad;
		movimientos.add(new MOVIMIENTO(concepto, cantidad, saldo));
	}
	
	@Override
	public String toString() {
		return "Numero=" + numeroCuenta + ", Cliente=" + cliente + ", Saldo=" + saldo+"\n";
	}

	public String listarMovimientos() {
		String listado = "";
		for (MOVIMIENTO mov : movimientos) {
			listado = listado + mov.toString()+"\n";
		}
		return listado;
	}
}
