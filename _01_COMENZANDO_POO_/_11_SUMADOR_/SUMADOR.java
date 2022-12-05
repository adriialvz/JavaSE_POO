package _11_SUMADOR_;

public class SUMADOR {

		//PROPIEDADES
		private int a;
		private int b;
		
		
		//CONSTRUCTOR
		public SUMADOR(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		//MÉTODOS
		public int suma() {
			return a + b;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}
		
		public String toString() {
			return "Sumador [a=" + a + ", b=" + b + "]";
		}
}

