package _03_INTEGER_STRING____MAP_;


import java.util.Map; 
import java.util.Set; 
import java.util.TreeMap;


public class MAP {

	public static void main(String[] args) {
		
		
		
		Map<Integer, String> personas = new TreeMap<Integer, String>();
		
		
		personas.put(8, "Carlos");
		personas.put(3, "Alicia");
		personas.put(1, "Miguel");
		
		
		//RECORRER EL MAPA 
		Set<Integer> claves= personas.keySet();
		
		for(Integer key : claves) {
			System.out.println(key+" "+personas.get(key));
		}

	}

}
