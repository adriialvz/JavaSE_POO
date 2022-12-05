package _02_EXCEPCION_COMPROBADA_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		
	/*	COCHE miCoche= new COCHE("Ford", "Fiesta");
		System.out.println(miCoche.toString());
		miCoche.acelerar(100);
		miCoche.acelerar(50);
		System.out.println(miCoche.toString());  */
		

//**********************************************************************************		
		
		
		COCHE miCoche2 = new COCHE("Ford", "Fiesta");
		System.out.println(miCoche2.toString());
		try {
		miCoche2.acelerar(100);
		miCoche2.acelerar(50);
		} catch (EXCESO_VELOCIDAD_EXPECTION e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		System.out.println(miCoche2.toString());
		
	}

}
