package _02_SOBRECARGA_CLIENTE_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		//INSTANCIAS
		CLIENTE c1= new CLIENTE("71614587P", "Veleros",31);
		CLIENTE c2= new CLIENTE();
		
//**********************************************************
				
		System.out.println(c1.getDni());
		//CAMBIAMOS VALOR DEL DNI
		c1.setDni("64876432L");
		System.out.println(c1.getDni());
		System.out.println(c2.getDni()+"\n\n");
				
//**********************************************************				
				
		System.out.println(c1.getNombre());
		System.out.println(c2.getNombre());
		//METEMOS VALOR A C2
		c2.setNombre("Pirolas");
		System.out.println(c2.getNombre()+"\n\n");
				
//**********************************************************
				
		System.out.println(c1.getEdad());
		//CAMBIAMOS EDAD
		c1.setEdad(32);
		System.out.println(c1.getEdad()+"\n\n");
				
//**********************************************************			
				
		System.out.println(c1.getImprime());
		System.out.println(c1.toString());
		System.out.println(c2.getImprime());
		System.out.println(c2.toString());

	}

}
