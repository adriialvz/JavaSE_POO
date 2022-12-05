package _02_LIST____VECTOR_Y_ARRAYLIST_;

import java.util.ArrayList;

public class PRINCIPAL_CON_ERROR_ {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		
		nombres.add("Carmen");
		nombres.add("Rosa");
		nombres.add("Carmen");
		nombres.add("Miguel");
		nombres.add("Carmen");
	
		
		
		for (String n1 : nombres) {
			System.out.println(n1);
			if (n1.equals("Carmen")) {
				nombres.remove(n1);
			}
		}
		
	}
}
