package _07_SALUDAR_NEW_2_;


public class PRINCIPAL {

	public static void main(String[] args) {
		
		SALUDAR s1= new SALUDAR();
		
		try {
			s1.saludar();
		}
		
		catch (EXCEPTION888 e) {
			System.out.println(e.getMessage());
	
		}


	}

}
