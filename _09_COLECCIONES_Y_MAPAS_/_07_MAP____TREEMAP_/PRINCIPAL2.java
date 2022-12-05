package _07_MAP____TREEMAP_;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class PRINCIPAL2 {
	
	public static void main(String args[]) {
		
		
		Map<Integer, TRIANGULO2> trians = new TreeMap<Integer, TRIANGULO2>();
		
		
		
		trians.put(1, new TRIANGULO2(1, 2, 2));
		trians.put(2, new TRIANGULO2(2, 2, 3));
		trians.put(3, new TRIANGULO2(1, 2, 3));
		trians.put(4, new TRIANGULO2(4, 4, 4));
		
		
		
		Set<Integer> claves = trians.keySet();
		for (Integer key : claves) {
			System.out.println(trians.get(key).verTipo());
		}
		
	}
}
