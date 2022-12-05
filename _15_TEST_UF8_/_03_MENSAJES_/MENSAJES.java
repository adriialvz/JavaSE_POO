package _03_MENSAJES_;

public class MENSAJES {

	public static void main(String[] args) {
		
		
		String v= "0e";
		
		try {
			int num= Integer.parseInt(v);
			num= 25/num;
		}
		
		catch(NumberFormatException e1) {
			System.out.println("Mensaje 1");
		}
		
		catch(ArithmeticException e2) {
			System.out.println("Mensaje 2");
		}
		
		catch(Exception e3) {
			System.out.println("Mensaje 3");
		}
		
		finally {
			System.out.println("Otro mensaje");
		}
		
		System.out.println("Adios");
	}

}
