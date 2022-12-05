package _07_RECTANGULO_;


public class PRINCIPAL {

	public static void main(String[] args) {
		
		//INSTANCIA
		RECTANGULO r1= new RECTANGULO("Figura de 4 lados", 20, 20);
		
//********************************************************************************		
		
		System.out.println(r1.toString());
		
		System.out.println(r1.area()+"\n\n");
		
//********************************************************************************			
		
		//PARA ACCEDER A UNA PROPIEDAD SIN LA INSTANCIA, ACCEDEMOS CON "STATIC"
		//DIRECTAMENTA CON EL NOMBRE DE LA CLASE ACCEDEMOS
		//ADEMAS LA PODEMOS MODIFICAR AL SER PUBLIC STATIC
		System.out.println(RECTANGULO.descripcion);
		
		//CAMBIAMOS VALOR
		RECTANGULO.descripcion= "BUENAS";
		
		System.out.println(RECTANGULO.descripcion);
		
		System.out.println(r1.toString()+"\n\n");
		
//********************************************************************************			
		
		//CAMBIAMOS VALOR
		r1.setDescripcion("HOLA MACARENO");
		
		System.out.println(r1.toString());
		
		System.out.println(r1.toString()+r1.area());
		
		
		//System.out.println(r1.ancho());				ERROR
		//System.out.println(RECTANGULO.ancho());		ERROR
		
	}

}
