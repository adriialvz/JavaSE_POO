package _03_QUEUE____LINKEDLIST_;

import java.util.LinkedList;

public class PRINCIPAL {
	
	public static void main(String[] args) {
		
		
		
		LinkedList<String> nombres = new LinkedList<String>();
		
		
		
		nombres.add("Carmen");
		nombres.add("Rosa");
		nombres.add("Carmen");
		nombres.add("Miguel");
		nombres.add("Carmen");
		
		for (String n1 : nombres) {
			System.out.println(n1);
		}
	}
}
