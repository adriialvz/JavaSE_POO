package _01_EXCEPCION_NO_COMPROBADA_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		
		COCHE miCoche= new COCHE("Ford", "Fiesta");
		miCoche.acelerar(70);
		miCoche.acelerar(50);
		System.out.println(miCoche.toString()+"\n\n");

		
//**********************************************************************************
		
		
		COCHE miCoche2= new COCHE("Ford", "Fiesta");
		System.out.println(miCoche2.toString());
		try {
			miCoche2.acelerar(100);
			miCoche2.acelerar(50);
			} catch (EXCESO_VELOCIDAD_EXPECTION e) {
				System.out.println("Cuidado, has excedido la velocidad permitida");
				System.out.println(e.toString());
			}
			System.out.println(miCoche2.toString()+"\n\n");
			
			
//**********************************************************************************
			
			
			COCHE miCoche3 = new COCHE("Ford", "Fiesta");
			System.out.println(miCoche3.toString());
			try {
			miCoche3.acelerar(100);
			miCoche3.acelerar(50);
			} catch (EXCESO_VELOCIDAD_EXPECTION e) {
				e.printStackTrace();
			}
			System.out.println(miCoche3.toString());
	}

}
