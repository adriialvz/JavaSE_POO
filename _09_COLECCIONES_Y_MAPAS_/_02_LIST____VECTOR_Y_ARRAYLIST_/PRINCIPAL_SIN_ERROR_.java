package _02_LIST____VECTOR_Y_ARRAYLIST_;

import java.util.ArrayList;
import java.util.Iterator;

public class PRINCIPAL_SIN_ERROR_ {

	public static void main(String[] args) {
		
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		
		nombres.add("Carmen");
		nombres.add("Rosa");
		nombres.add("Carmen");
		nombres.add("Miguel");
		nombres.add("Carmen");
		
		
		
		Iterator<String> itera = nombres.iterator();
		String cadaNombre; 
		while (itera.hasNext()) {
			cadaNombre = itera.next();
			System.out.println(cadaNombre);
			if (cadaNombre.equals("Carmen")) {
				itera.remove();
			}
		}	
		
		
		
		System.out.println("Recorrido después de borrar las Carmenes");
		for (String n1 : nombres) {
			System.out.println(n1);
		}

	}

}
