package _02_EXCEPCION_COMPROBADA_;

public class EXCESO_VELOCIDAD_EXPECTION extends RuntimeException {

	
	//PROPIEDADES
	private static final long serialVersionUID= 1L;
	private int nuevaVelocidad;
	
	
	//CONSTRUCTOR
	public EXCESO_VELOCIDAD_EXPECTION (int nuevaVelocidad) {
		super("Exceso de velocidad");
		this.nuevaVelocidad= nuevaVelocidad;
	}

	//METODOS
	@Override
	public String toString() {
		return "ExcesoVelocidadException [nuevaVelocidad=" + nuevaVelocidad	+ "]";
	}
}
