package _04_CATCH_;

import java.util.*;

public class PRINCIPAL {

	public static void main(String args[]) {
		
		
		Scanner in= new Scanner(System.in);
		
		
		try {
			
			System.out.println("Introduce dividendo: ");
			String texto= in.nextLine();
			int dividendo= Integer.parseInt(texto);
			
			
			
			System.out.println("Introduce divisor: ");
			texto= in.nextLine();
			int divisor= Integer.parseInt(texto);
			
			
			
			int resultado= dividendo/divisor;
			
			
			
			int resto= dividendo%divisor;
			System.out.println("Resultado división: " + resultado);
			System.out.println("Resto: " + resto);
			
		} 
		
		
		catch (ArithmeticException e1) {
			System.out.println("Se ha producido una ArithmeticException");
			System.out.println(e1.getMessage());
		}
		
		
		catch (NumberFormatException e2) {
			System.out.println("Se ha producido un NumberFormatException");
			System.out.println(e2.getMessage());
		}
		
		System.out.println("El programa sigue aquí, no se ha abortado");
	}
}
