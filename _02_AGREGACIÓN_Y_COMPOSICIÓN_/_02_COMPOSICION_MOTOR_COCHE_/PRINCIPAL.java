package _02_COMPOSICION_MOTOR_COCHE_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		//INSTANCIA
		COCHE c1= new COCHE("2387LKB","BMW","M135i",300,"Gasolina");

		c1.setInfo();

//********************************************************************		
		
		System.out.println("CV: "+c1.getMotor().getCaballos()+"\n");
		
//********************************************************************			
		
		System.out.println(c1.toString()+"\n");
		
//********************************************************************
		
		//CAMBIAMOS LA PROPIEDAD CABALLOS DE VALOR
		c1.getMotor().setCaballos(250);
		
		System.out.println(c1.getMotor());
	}

}
