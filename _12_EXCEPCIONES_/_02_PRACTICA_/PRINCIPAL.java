package _02_PRACTICA_;

import java.util.*;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		
		System.out.println("Introduce radio de la circunferencia: ");
		String num= in.nextLine();
	
		
		int radio;
		
		
		try {
			radio= Integer.parseInt(num);
		} 
		
		
		catch (NumberFormatException e) {
			System.out.println("Ha ocurrido una excepción de tipo NumberFormatException");
			System.out.println(e.getMessage());
			return;
		} 
		
		
		System.out.println("Longitud: " + (2*Math.PI*radio));
		System.out.println("Area: " + (Math.PI*radio*radio));
		System.out.println("Fin del programa");

	}

}
