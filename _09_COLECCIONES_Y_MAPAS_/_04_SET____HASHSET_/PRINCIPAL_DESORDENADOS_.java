package _04_SET____HASHSET_;


import java.util.HashSet;
import java.util.Set;


public class PRINCIPAL_DESORDENADOS_ {
	
	public static void main(String[] args) {
		
		
		Set<String> nombres = new HashSet<String>();
		
		
		nombres.add("Rosa");
		nombres.add("Carlos");
		nombres.add("Miguel");
		nombres.add("Carlos");			//ESTE NO SE AÑADIRA PORQUE NO PUEDE SI HAY DUCPLICADOS SOLO SACA EL PRIMERO
		nombres.add("Sole");
		nombres.add("Adrián");
		nombres.add("Angel");
		nombres.add("Amelia");
		nombres.add("Fernando");		//LOS SACA DESORDENADOS
		nombres.add("Sebas");
		nombres.add("Lucas");
		
		
		for (String n : nombres) {
			System.out.println(n);
		}
	}
}
