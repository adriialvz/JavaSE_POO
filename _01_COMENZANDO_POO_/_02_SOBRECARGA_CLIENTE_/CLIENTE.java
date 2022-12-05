package _02_SOBRECARGA_CLIENTE_;

public class CLIENTE {

	
	//PROPIEDADES
	private String dni;
	private String nombre;
	private int edad;
	
	
	//CONSTRUCTOR SOBRECARGADO
	public CLIENTE(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//CONSTRUCTOR SOBRECARGADO
	public CLIENTE() {
		this.dni= null;
		this.nombre= "DESCONOCIDO"; 
		this.edad= 0;
	}
	
	
	//METODOS SOBRECARGADOS
	public void setDni(String dni) {
		this.dni= dni;
	}
	
	
	public String getDni() {
		return dni;
	}
	
	
	//METODOS SOBRECARGADOS
	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	//METODOS SOBRECARGADOS
	public void setEdad(int edad) {
		this.edad= edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	//IMPRIME DATOS
	public String getImprime() {
		return "El cliente con dni: "+getDni()+", se llama: "+getNombre()+" y tiene: "+getEdad()+" años.";
	}


	@Override
	public String toString() {
		return "CLIENTE [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
}
