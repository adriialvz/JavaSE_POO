package _01_CLASES_ABSTRACTAS_;


//CLASE ABSTRACTA
//SOLO PUEDE SER USADA PARA CREAR CLASES HIJA
public abstract class ABSTRACTA_ANIMAL_ {

	
	
		//VARIABLE DE INSTANCIA DE CLASE
		String nombre;

		
		
		//CONSTRUCTOR
		public ABSTRACTA_ANIMAL_(String nombre) { 
			this.nombre= nombre;
		}
		
		
		
	    //METODO ABSTRACTO, DEBE DE SER SOBRESCRITOS POR UNA CLASE HIJA
		public abstract String morder(ABSTRACTA_ANIMAL_ animals);
		public abstract String mover();
		
		
		
	    //METODO NO ABSTRACTO, PODRA SER O NO SOBRESCRITO EN LA CLASE HIJA
		@Override
		public String toString() {
			return "ANIMAL [nombre=" + nombre + "]";
		}
}
