package _01_CLASES_ABSTRACTAS_;


//ESTA ES UNA CLASE HIJA QUE HEREDA UNA CLASE ABSTRACTA.
//SERA OBLIGATORIO IMPLEMENTAR LOS METODOS ABSTRACTOS DE LA CLASE ABSTRACTA.
public class HIJA_PULGA_ extends ABSTRACTA_ANIMAL_{
	
	
	
	//CONSTRUCTOR
	HIJA_PULGA_()	{
		super ("Pulga");
	}	
	
	public HIJA_PULGA_(String nombre) {
		super(nombre);
	}
	
	
	
	//PARAMETROS PASADOS POR EL CONSTRUCTOR ABSTRACTO
	@Override
	public String morder(ABSTRACTA_ANIMAL_ animals) {
		return "Pulga muerde "+animals.nombre;
	}

	
	
	@Override
	public String mover() {
		return "Pulga se mueve";
	}

	
	
	@Override
	public String toString() {
		return super.toString() + "Saludos de pulga";
	}
}
