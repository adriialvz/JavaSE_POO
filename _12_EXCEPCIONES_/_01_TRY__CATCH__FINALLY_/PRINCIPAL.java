package _01_TRY__CATCH__FINALLY_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		int cero= 0;
		int resul;
		
		
		
		
		try {
			resul= 6/cero;
			System.out.println(resul);
		} 
		
		
		catch (ArithmeticException e) {
			System.out.println("Se ha producido una excepción");
			System.out.println(e.getMessage());
		}
		
		
		finally {
			System.out.println("Hasta pronto");
		}

	}

}
