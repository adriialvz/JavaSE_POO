package _10_ARRAY_PUNTO_;


public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		//INSTANCIA VECTOR DE DOS POSICIONES 
		PUNTO vec[]= new PUNTO[2];
		//POSICION 0 CONTIENE DOS NUMEROS EL 2 Y EL 3 Y LE LLEGAN AL CONSTRUCTOR
		vec[0]= new PUNTO(2, 3);
		vec[1]= new PUNTO(7, 4);
		
		
		System.out.println(vec[0].getConsultar());
		System.out.println(vec[1].getConsultar()+"\n\n");
		
		
		

//********************************************************************************
		
		
		
		
		PUNTO p1= new PUNTO(34, 78);
		PUNTO p3= new PUNTO();			
		
		System.out.println(p1.getConsultar());
		
		System.out.println(p3.getConsultar());
	}

}
