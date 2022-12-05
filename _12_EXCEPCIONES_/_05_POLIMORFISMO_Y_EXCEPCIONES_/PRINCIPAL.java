package _05_POLIMORFISMO_Y_EXCEPCIONES_;

import java.util.*;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		
			Scanner lector= new Scanner(System.in);
		
			
			
		try {
			
			System.out.println("Introduce dividendo: ");
			String texto= lector.nextLine();
			int dividendo= Integer.parseInt(texto);
			
			
			
			System.out.println("Introduce divisor: ");
			texto= lector.nextLine();
			int divisor= Integer.parseInt(texto);
			
			
			
			int resultado= dividendo/divisor;
			
			
			
			int resto= dividendo%divisor;
			System.out.println("Resultado división: " + resultado);
			System.out.println("Resto: " + resto);
			lector.close();
		} 
		
		
		
		catch (Exception e) {
			System.out.println("Se ha producido una Excepción de tipo " + e.getClass().getName());
			System.out.println(e.getMessage());
		}
		
		System.out.println("El programa sigue aquí, no se ha abortado");

	}

}
