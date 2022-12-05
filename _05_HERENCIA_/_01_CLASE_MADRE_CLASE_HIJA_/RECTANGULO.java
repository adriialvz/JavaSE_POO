package _01_CLASE_MADRE_CLASE_HIJA_;

public class RECTANGULO  extends FIGURA {							//RECTANGULO HEREDA DE FIGURA

	
	//CONSTRUCTOR CON 5 PARAMETROS HEREDADOS DE FIGURA
	 public RECTANGULO(int coordenadaX, int coordenadaY, int ancho, int alto) {
			super(coordenadaX, coordenadaY, ancho, alto, "Rectángulo");
		   }
	 
	 
	 
	 		//LOS ATRIBUTOS FUNCIONAN PORQUE ESTA EL PROTECTED EN LA CLASE PRINCIPAL
		   public double area() {
				return (double)alto * ancho;		//CAST PORQUE ESTA A ENTERO --> int
		   }
		   
		   
		   
		   
		   public double area2() {
				return (double)getAlto() * getAncho();
		   }
		   
		   
		   @Override
			public int getAncho() {
				return super.getAncho() * super.getAlto();
			}
		   
		   
		   
		   
		   //MÉTODOS PARA IMPRIMIR
		   public String dato() {
				return toString();
			}
		   
		   
		   @Override
			public String toString() {
				return super.toString();
			}

}
