package _01_CLASES_ABSTRACTAS_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		//INSTANCIAS 
		ABSTRACTA_ANIMAL_ ani1 = new HIJA_PULGA_();
		ABSTRACTA_ANIMAL_ ani2 = new HIJA_TIRANOSAURIO_();
		
		
		
		
		//SACA LA INFO DEL METODO PERO DE LA CLASE PULGA
		System.out.println(ani1.toString());
		
		
		//LLAMA AL METODO MORDER DE PULGA 
		//LLAMA AL NOMBRE DE LA CLASE TIRANOSAURIO
		System.out.println(ani1.morder(ani2));
		
		
		//LLAMA LA METODO MOVER DE PULGA
		System.out.println(ani1.mover());
		
		
		//LLAMA AL METODO TOSTRING DE TIRANOSAURIO
		System.out.println(ani2.toString());
		
		
		//LLAMA AL METODO MORDER DE TIRANOSAURIO 
		//LLAMA AL NOMBRE DE LA CLASE PULGA
		System.out.println(ani2.morder(ani1));
		
		
		//LLAMA AL METODO MOVER DE TIRANOSAURIO
		System.out.println(ani2.mover());
		
		
		//NO FUNCIONA HAY QUE CONVERTIRLO(CASH ENTRE CLASES)
		//System.out.println(ani2.pisar(ani1));
		
		
		//CASH DE LA CLASE + ANI2 + PISAR + ANI1 
		System.out.println(((HIJA_TIRANOSAURIO_)ani2).pisar(ani1));
	}
}
