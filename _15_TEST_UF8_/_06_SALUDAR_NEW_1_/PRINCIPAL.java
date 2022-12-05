package _06_SALUDAR_NEW_1_;


public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		SALUDAR s1= new SALUDAR();
		
		try {
			s1.saludar();
		}
		
		catch (EXCEPTION888 e) {
			System.out.println(e.getMessage());
			System.out.println(e.getNum());
		}

	}

}
