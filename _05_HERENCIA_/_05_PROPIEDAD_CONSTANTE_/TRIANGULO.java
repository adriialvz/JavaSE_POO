package _05_PROPIEDAD_CONSTANTE_;

	public class TRIANGULO {
		
		//PROPIEDAD
		//CONSTANTE PUBLICA, SU VALOR NO PUEDE SER MODIFICADO
		//ADEMAS PERTENCE A LA CLASE, NO AL OBJETO
		public static final float PI = 3.141592F;
			
		//PROPIEDADES
		private int lado1;
		private int lado2;
		private int lado3;
		
		//CONSTRUCTOR
		public TRIANGULO(int lado1, int lado2, int lado3) {
			this.lado1= lado1;
			this.lado2= lado2;
			this.lado3= lado3;
		}
		
		//MÉTODOS 
		public int getLado1() {
			return lado1;
		}
		
		public int getLado2() {
			return lado2;
		}
		
		public int getLado3() {
			return lado3;
		}
		
		public float area() {
			return lado1*lado2*lado3*PI;
		}
		
		public final String verTipoTriangulo() {
			   if (this.lado1==lado2 && lado2==lado3){
					return "Equilátero";
		
			   } else if (lado1==lado2 || lado2==lado3 || lado1==lado3) {
					return "Isósceles";
			  
			   } else {
					return "Escaleno";
			  }
		}
		
		@Override
		public String toString() {
			return "TRIANGULO [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
		}	
}
