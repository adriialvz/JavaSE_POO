package _05_HASH_SET_;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class HASH_SET {
	public static void main(String[] args) {
		
		ArrayList <String> peli= new ArrayList<String>();
		
		peli.add("Pepi,");
		peli.add(" Luci");
		peli.add(", Bom");
		peli.add(" y otras chicas");
		peli.add(" del monton");
		
		for(String texto : peli) {
			
			System.out.print(texto);
		}
		
	}

}
