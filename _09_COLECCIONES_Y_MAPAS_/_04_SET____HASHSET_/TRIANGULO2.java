package _04_SET____HASHSET_;

public class TRIANGULO2 {

	
	//PROPIEDADES
	private int lado1;
	private int lado2;
	private int lado3;
	
	
	//CONSTRUCTOR
	public TRIANGULO2(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	
	//MÉTODOS
	
	@Override
	public String toString() {
		return "Triangulo [" + lado1 + ", " + lado2 + ", " + lado3 + "] ";
	}
	
	public String verTipo() {
		if (lado1==lado2 && lado2==lado3) {
			return toString() + " Equilátero";	
		}
		else if (lado1==lado2 || lado2==lado3 || lado1==lado3) {
			return toString() + " Isósceles";
		}
		else {
			return toString() + " Escaleno";
		}
	}
	
	@Override
	public int hashCode() {
		return lado1+lado2+lado3;
	}
	 
	@Override
	public boolean equals(Object obj) {
		if (hashCode() == obj.hashCode())
			return true;
		else
			return false;
	}
}
