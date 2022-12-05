package _01_CLASES_ABSTRACTAS_;

public class HIJA_TIRANOSAURIO_ extends ABSTRACTA_ANIMAL_ {

	
	
	
	//CONSTRCUTOR_
	public HIJA_TIRANOSAURIO_() {
		super ("Tiranosaurio");
	}
	
	public HIJA_TIRANOSAURIO_(String nombre) {
		super(nombre);
	}
	
	
	//METODOS
	@Override 
	public String morder(ABSTRACTA_ANIMAL_ animals) {
		return "Tiranosaurio muerde "+animals.nombre;
	}
	
	
	
	@Override
	public String mover()	{
		return "Tiranosaurio se mueve";
	}
	
	
	
	@Override
	public String toString() {
		return "Saludos del tiranosaurio";
	}
	
	
	
	// ESTE METODO ES ESCLUSIVO DE LA CLASE TIRANOSAURIO
	public String pisar(ABSTRACTA_ANIMAL_ animals) {
		return "Tiranosaurio pisa a "+animals.nombre;
	}
}
