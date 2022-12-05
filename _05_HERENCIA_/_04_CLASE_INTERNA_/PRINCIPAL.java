package _04_CLASE_INTERNA_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		//INSTANCIA
		CASA c1 = new CASA(100, 3, "Pepe", "906300200");
		
		
	
		System.out.println(c1.toString());
		
		
		//DE NINGUNA MANERA PODEMOS ACCEDER A LA PROPIEDAD PROPIETARIO
		//SOLO SE PUEDE DESDE LA CLASE CASA ACCEDER
		
		//System.out.println(c1.getPropietario().toString());
		
		//getPropietario().toString()  PERO DESDE LA CLASE CASA

	}

}
