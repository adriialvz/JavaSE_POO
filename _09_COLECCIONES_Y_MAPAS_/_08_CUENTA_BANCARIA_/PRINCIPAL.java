package _08_CUENTA_BANCARIA_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		
	CUENTA_BANCARIA miCuenta = new CUENTA_BANCARIA(38143, "Amelia González");
	
	
	miCuenta.agregarMovimiento("Ingreso Nómina", 2000);
	miCuenta.agregarMovimiento("Pago luz", -120);
	miCuenta.agregarMovimiento("Compra supermercado", -27);
	miCuenta.agregarMovimiento("Ingreso Efectivo", 8000);
	
	
	System.out.println(miCuenta.toString());
	
	System.out.println(miCuenta.listarMovimientos());
	
	
	}
}