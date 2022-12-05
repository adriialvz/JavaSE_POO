package _01_LIST____VECTOR_Y_ARRAYLIST_;

public class TRIANGULO {

	
	//PROPIEDADES
	private int lado1;
	private int lado2;
	private int lado3;
	
	
	//CONSTRUCTOR
	public TRIANGULO(int lado1, int lado2, int lado3) {
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
	
}
