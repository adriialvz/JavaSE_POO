package _05_SET____TREESET_;


import java.util.Set;
import java.util.TreeSet;


public class PRINCIPAL_ORDENADOS_ {
	
	public static void main(String[] args) {
		
		
		
		Set<String> nombres = new TreeSet<String>();
		
		
		
		nombres.add("Rosa");
		nombres.add("Carlos");
		nombres.add("Miguel");
		nombres.add("Carlos"); 			//ESTE NO SE AÑADIRA, SE CONSIDERA DUPLICADO
		nombres.add("Sole");
		nombres.add("Adrián");
		nombres.add("Angel");
		nombres.add("Amelia");
		nombres.add("Fernando");		//LOS SACA ORDENADOS
		nombres.add("Sebas");
		nombres.add("Lucas");
		
		for (String n1 : nombres) {
			System.out.println(n1);
		}
	}
}
