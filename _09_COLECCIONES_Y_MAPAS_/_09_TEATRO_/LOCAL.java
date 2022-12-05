package _09_TEATRO_;

public class LOCAL {

		private String domicilio; 
		private int metros; 
		private int accesos;
		/*Declaramos los atributos con el modificador private
		 * as� los encapsulamos y los podemos ver a trav�s de 
		 * los getter y modificarlos con los setter
		 */
		
		public LOCAL(String domicilio, int metros, int accesos) {
			this.domicilio = domicilio;
			this.metros = metros; 
			this.accesos = accesos;
			//creamos el constructor
		}
	        public LOCAL (){
	            
	        }
	        //A�adimos getter y setter para cada atributo
		public String getDomicilio() {
			return domicilio;
		}
		public void setDomicilio(String domicilio) {
			this.domicilio = domicilio;
		}
		public int getMetros() {
			return metros;
		}
		public void setMetros(int metros) {
			this.metros = metros;
		}
		public int getAccesos() {
			return accesos;
		}
		public void setAccesos(int accesos) {
			this.accesos = accesos;
		}

		@Override
		public String toString() {
			return "Local [domicilio=" + this.getDomicilio() + ", metros=" + this.getMetros() + ", accesos=" + this.getAccesos() + "]";
		/* Necesitamos un m�todo que indique como est� nuestro objeto en cada momento
		 * �Por que usamos String? Porque queremos que nos devuelva una cadena con el
		 * valor de cada atributo.
		 */
		} 
		
		
	
}
