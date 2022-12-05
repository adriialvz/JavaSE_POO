package _03_QUEUE____LINKEDLIST_;

import java.util.LinkedList;

import _01_LIST____VECTOR_Y_ARRAYLIST_.TRIANGULO;

public class PRINCIPAL2 {
	
	public static void main(String[] args) {
		
		
		
		LinkedList<TRIANGULO> trians = new LinkedList<TRIANGULO>();
		
		
		
		trians.add(new TRIANGULO(1, 2, 3));
		trians.add(new TRIANGULO(1, 1, 2));
		trians.add(new TRIANGULO(1, 1, 1));
		
		for (int i=0; i<trians.size(); i++) {
			System.out.println(trians.get(i).verTipo()); 
		}
	}
}
