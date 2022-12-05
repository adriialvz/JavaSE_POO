package _01_CLASE_MADRE_CLASE_HIJA_;

public class CIRCULO extends FIGURA {

	
	//PROPIEDADES
	private int radio;
	
	
	
	//CONSTRUCTOR
    public CIRCULO(int coordenadaX, int coordenadaY, int ancho, int alto, int radio) {
    	super(coordenadaX, coordenadaY, ancho, alto, "Círculo");
    	this.radio= radio;
    }
    
    
    //MÉTODO
    public double area() {
	return Math.PI * radio * radio;
    }


	@Override
	public String toString() {
		return "_05_CIRCULO_ [radio=" + radio + ", ancho=" + ancho + ", alto=" + alto + ", area()=" + area() + "]";
	}
    
    
}
