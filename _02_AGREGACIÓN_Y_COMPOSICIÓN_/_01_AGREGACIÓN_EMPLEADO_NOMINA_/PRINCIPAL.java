package _01_AGREGACIÓN_EMPLEADO_NOMINA_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		//INSTANCIA CON PARAMETROS
		EMPLEADO e1= new EMPLEADO("Adrian",630910599,"Programing");
		
		//INSTANCIA CON PARAMETROS, DONDE UN OBJETO NOMINA CONTIENE UN OBJETO EMPLEADO
		NOMINA e2= new NOMINA(2000, e1);
		
//**************************************************************************************			
		
		
		System.out.println(e1.toString());
		System.out.println("Trabajador: "+e1.getNombre()+"\n\n");
		
//**************************************************************************************		
		
		e1.setTlfn(765234234);
		System.out.println("Telefono: "+e1.getTelefono());
	
		
		//ACCEDEMOS, IMPRIMIMOS Y CAMBIAMOS EL TELEFONO A LA PROPIEDAD
		e2.getTrabajador().setTelefono(629080876);
		
		System.out.println(e1.getTelefono()+"\n\n");
		
//**************************************************************************************		
		
		System.out.println("Departamento: "+e1.getDepartamento());

		
		System.out.println("La nomina es de: "+e2.getSueldo()+"€");
		
		//System.out.println(e2.trabajador.toString());    //NO VISIBLE ES PRIVADO
		System.out.println(e2.getTrabajador().toString());
		
		System.out.println(e2.toString());
			
		
	}

}
