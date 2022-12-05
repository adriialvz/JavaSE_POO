package _08_MANZANA_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		MANZANA m1= new MANZANA("Golden red");
		MANZANA m2= m1;
		
		
		
		System.out.println(m1.getTipo());
		System.out.println(m2.getTipo()+"\n\n");
		
//********************************************************************************			
		
		m2.setTipo("Manzanas en almibar");
		
		System.out.println(m1.getTipo());
		System.out.println(m2.getTipo()+"\n\n");
		
		//********************************************************************************			
		
		m1.setTipo("PERAS");
		
		System.out.println(m1.getTipo());
		System.out.println(m2.getTipo());
		
		
		System.out.println(m1.getTipo()+"\n"+m2.getTipo());

	}

}
