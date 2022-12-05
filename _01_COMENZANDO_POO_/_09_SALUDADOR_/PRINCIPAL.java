package _09_SALUDADOR_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		//LLAMAMOS AL PRIMER METODO SALUDAR
		SALUDADOR.saludar();
		
		
		//LLAMAMOS AL SEGUNDO METODO SALUDAR Y PASAMOS PARAMETROS
		SALUDADOR.saludar("Pepita");
		
//***********************************************************************************			
		
		//CASCA PORQUE NO RETORNA
//		System.out.println(_02_SALUDADOR_.saludar());
		
		//CASCA PORQUE NO RETORNA
//		System.out.println(_02_SALUDADOR_.saludar(" Carmen"));
		
//***********************************************************************************		
		
		//EL METODO NO LLEVA EL STATIC, NO PODEMOS ACCEDER A EL Y DA ERROR
//		System.out.println(_02_SALUDADOR_.saludar2());
		
		
		
		//EL METODO NO LLEVA EL STATIC, NO PODEMOS ACCEDER A EL Y DA ERROR
//		System.out.println(_02_SALUDADOR_.saludar2(" Carmen"));
		
		
//***********************************************************************************			

		
		//EL METODO LLEVA STATIC Y PODEMOS ACCEDER AL METODO
		System.out.println(SALUDADOR.saludar3());
		
		
		
		//EL METODO LLEVA STATIC Y PODEMOS ACCEDER AL METODO
		System.out.println(SALUDADOR.saludar3(" Carmen"));
		
		
	}

}
