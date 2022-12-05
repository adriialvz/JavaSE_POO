package _04_CLASE_INTERNA_;

public class CASA {
	
	//PROPIEDADES
	private int metros;
	private int numHabitaciones;
	private Propietario propietario;
	
	//CONSTRUCTOR
	public CASA(int metros, int numHabitaciones, String nombre, String telefono) {
		this.metros = metros;
		this.numHabitaciones = numHabitaciones;
		this.propietario = new Propietario(nombre, telefono);
	}
	
	public Propietario getPropietario() {
		return this.propietario;
	}
	
	//METODO HEREDADO DE OBJECT
	@Override
	public String toString() {
		return "Casa [metros=" + metros + ", numHabitaciones=" + numHabitaciones + ", "+ propietario.toString() + 
				"\n\n"+getPropietario().toString()+"]";
	}

		//OTRA CLASE
//***********************************************************************************************************************************
	
	//CLASE INTERNA PRIVADA
	private class Propietario {	
		
		//PROPIEDADES
		private String nombre;
		private String telefono;
		
		//CONSTRUCTOR
		public Propietario(String nombre, String telefono) {
			this.nombre = nombre;
			this.telefono = telefono;
		}

		//METODO HERADADO DE OBJECT
		@Override
		public String toString() {
			return "Propietario [nombre=" + nombre + ", telefono=" + telefono + "]";
		}
	}
}
