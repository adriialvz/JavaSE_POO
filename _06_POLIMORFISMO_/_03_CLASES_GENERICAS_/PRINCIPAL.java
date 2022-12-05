package _03_CLASES_GENERICAS_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		
		 GENERICA<String> miObjeto1 = new GENERICA<String>("Hola mundo");
		 System.out.println(miObjeto1.informa());
		 
		 
		 
		 System.out.println();
		 
		 
		 
			
		 GENERICA<Integer> miObjeto2 = new GENERICA<Integer>(35);
		 System.out.println(miObjeto2.informa());
		 
		 
		 
		 
		 
		 System.out.println();
		 
		 
			
		 GENERICA<Double> miObjeto3 = new GENERICA<Double>(45.30);
		 System.out.println(miObjeto3.informa());

	}

}
