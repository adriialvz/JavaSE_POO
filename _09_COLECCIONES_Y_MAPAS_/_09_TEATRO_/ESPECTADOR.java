package _09_TEATRO_;

public class ESPECTADOR {

		private String nombre;
		private String tlf;
		private int edad; 
		//Propiedades encapsuladas de nuevo
		
		public ESPECTADOR(String nombre, String tlf, int edad) {
			this.nombre = nombre; 
			this.tlf = tlf;
			this.edad = edad;
			//creamos el constructor
		}
	        public ESPECTADOR(){
	            
	        }
		
		public String rangoEdad() {
			/* M�todo rangoEdad() para detectar la edad recibida y 
			devolver cadena de texto clasificando por edades
			seg�n pide el ejercicio.
			Lo estructuramos con una secuencia alternativa multiple.
			*/
			String rangoEdad = null;
			if (edad >= 0 && edad <= 12) {
				rangoEdad = "Infantil";
				//si la edad llega hasta los 12 a�os es infantil
			} else if(edad >= 13 && edad <= 17) {
				//de 13 a 17 es menor
				rangoEdad = "Menor";
			} else if (edad >= 18 && edad <= 64) {
				//de 18 a 64 es mayor
				rangoEdad = "Mayor";
			} else if (edad >= 65) {
				//a partir de 65 jubilado
				rangoEdad = "Jubilado";
			}
			return rangoEdad; 
			//devuelveme el rango de la edad
		}
		
		//Apicamos los getter y setter para cada atributo
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getTlf() {
			return tlf;
		}

		public void setTlf(String tlf) {
			this.tlf = tlf;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		@Override
		public String toString() {
			return "Espectador [nombre=" + this.getNombre() + ", tlf=" + this.getTlf() + ", edad=" + this.getEdad()+ "]";
			//Retornanos el espectador con el nombre, el telefono y la edad.
		}
		

}
