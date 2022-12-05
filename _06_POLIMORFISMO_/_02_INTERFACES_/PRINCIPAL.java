package _02_INTERFACES_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		INTERFACE_VEHICULO_ v1 = new MOTO();
		
		
		INTERFACE_VEHICULO_ v2 = new COCHE();
		
		
		
		System.out.println(v1.acelerar(100));
		System.out.println(v1.frenar(25));
		
		
		System.out.println("*******************"
				+ "*******************");
		
		
		System.out.println(v2.acelerar(130));
		System.out.println(v2.frenar(25));

	}

}
