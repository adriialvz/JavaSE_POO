package _03_TRIANGULO_HASHCODE_EQUALS_;

public class TRIANGULO {

	//PROPIEDADES
	private float lado1;
	private float lado2;
	private float lado3;
			
	
	//CONSTRUCTOR
	public TRIANGULO(float lado1, float lado2, float lado3) {
		this.lado1= lado1;
		this.lado2= lado2;
		this.lado3= lado3;
	}
	
	//METODO HEREDADO DE LA CLASE OBJECT
	@Override
	public String toString() {
	   return "Triangulo [lado1="+lado1+
			   ", lado2="+lado2+ ", lado3="+lado3+ "] "+tipo();
	}
	
	//METODO RETURN
	public String tipo() {
	   if (lado1==lado2 && lado2==lado3) {
			return "EQUILATERO";
			
	   } else if (lado1==lado2 || lado2==lado3 || lado1==lado3) {
			return "ISOSCELES";
			
	   } else {			
		   	return "ESCALENO";
	   
	   } 
	}
	
	//METODO HEREDADO DE LA CLASE OBJETC
	@Override
	public int hashCode() {
		return (int) Math.round(lado1+lado2+lado3);
	}
	
	//METODO HEREDADO DE LA CLASE OBJECT
	@Override
	public boolean equals(Object obj) {
		if (hashCode() == obj.hashCode())
			return true;
		else
			return false;
	}
	
	
}
