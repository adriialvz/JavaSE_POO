package _01_AGREGACIÓN_EMPLEADO_NOMINA_;

public class NOMINA {

	//PROPIEDADES CON CLASE EMPLEADO
	private double sueldo;
	private EMPLEADO trabajador;
	
	
	//CONSTRUCTOR CON CLASE EMPLEADO
	public NOMINA(double sueldo, EMPLEADO trabajador) {
		this.sueldo = sueldo;
		this.trabajador = trabajador;
	}
	
	
	//MÉTODOS
	public double getSueldo() {
		return this.sueldo;
	}
	
	
	//MÉTODO QUE AL LLAMARLO ACCEDEMOS A LO PUBLIC DE EMPLEADO
	public EMPLEADO getTrabajador() {
		return trabajador;
	}
	
	//IMPRIMIR DATOS
	@Override
	public String toString() {
		return "NOMINA [sueldo=" + sueldo + ", " + trabajador.getTelefono()+" ---->" + getTrabajador().getTelefono()+"]";
		//SIN LLAMAR AL METODO TAMBIEN ACCEDEMOS A LA CLASE EMPLEADO
		//Y LLAMANDO A GETTRABAJADOR() NOS DA EL TOSTRING DE EMPLEADO
	}
}
