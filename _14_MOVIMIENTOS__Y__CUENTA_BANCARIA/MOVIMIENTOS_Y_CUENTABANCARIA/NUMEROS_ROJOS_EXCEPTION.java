package MOVIMIENTOS_Y_CUENTABANCARIA;

public class NUMEROS_ROJOS_EXCEPTION extends RuntimeException {
	
	
	private static final long serialVersionUID = 1L;
	private double rojos;
	
	
	public NUMEROS_ROJOS_EXCEPTION(double rojos) {
		super("\n*****Su cuenta esta en numeros rojos*****");
		this.rojos= rojos;
	}


	@Override
	public String toString() {
		return "NUMEROS_ROJOS_EXCEPTION [rojos=" + rojos + "]";
	}
	
	
}
