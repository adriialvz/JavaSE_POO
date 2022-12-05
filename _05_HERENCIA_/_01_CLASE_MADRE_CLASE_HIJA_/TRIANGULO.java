package _01_CLASE_MADRE_CLASE_HIJA_;

public class TRIANGULO extends FIGURA {

	
	//PROPIEDADES
	private int base;
	private int altura;
	
	
	//CONTRUCTOR QUE HERADA LOS 4 PRIMEROS PARAMETROS DE FIGURA. EN TOTAL HAY 7 PARAMETROS
    public  TRIANGULO(int coordenadaX, int coordenadaY, int ancho, int alto, int base, int altura) {
    	
    	//CONTRUCTOR DE LA CLASE FIGURA. ESTOS 5 PARAMETROS HEREDAN DE LA CLASE FIGURA.
    	super(coordenadaX, coordenadaY, ancho, alto, "Triángulo");
		
		this.base= base;
		this.altura= altura;
	}

    
    //EL @OVERRIDE INFORMA DE QUE ESTE MÉTODO YA EXISTE EN LA MADRE (FIGURA) 
    //Y ESTA SIENDO SOBRESCRITO EN LA CLASE HIJA(TRIANGULO)
	@Override
	public String consultar() {
		return super.consultar()+", Base= "+base+", Altura="+altura;
		//USAR LA PALABRA SUPER PARA LLAMAR EL METODO DE LA CLASE FIGURA 
		//CONSULTA() SIN NADA MAS LLAMAS A LA TRIANGULO
	}

	
	
	public double area() {
		return (double)base * altura / 2;
	}


	@Override
	public String toString() {
		return "TRIANGULO [base=" + base + ", altura=" + altura + "]";
	}
	
	
	
}
