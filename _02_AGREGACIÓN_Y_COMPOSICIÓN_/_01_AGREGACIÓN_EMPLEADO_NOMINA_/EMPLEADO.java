package _01_AGREGACIÓN_EMPLEADO_NOMINA_;

public class EMPLEADO {
	
	
	//PROPIEDADES
	private String nombre;
	private int telefono;
	private String departamento;
	
	
	//CONTRUCTOR
	public EMPLEADO(String nombre, int telefono, String departamento) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.departamento = departamento;
	}
		
	
	//MÉTODO 
	public String getNombre() {
		return nombre;
	}
	
	
	public int getTelefono() {
		return telefono;
	}
	
	public void setTlfn(int tlfn) {
		this.telefono = tlfn;
	}
	
	public void setTelefono(int telefono) {
		System.out.print("Segundo telefono: ");
		System.out.println(telefono);
		//PARA IMPRIMIMIR Y CAMBIAR LA PROPIEDAD METEMOD EL THIS.TELEFONO=TELEFONO
		//PARA IMPRIMIR, SOLO METEMOS TELEFONO
	}

	public String getDepartamento() {
		return departamento;
				
	}
	
	//IMPRIMIR DATOS
	@Override
	public String toString() {
		return "EMPLEADO [nombre=" + nombre + ", telefono=" + telefono +
				", departamento=" + departamento + "]";
	}
}
