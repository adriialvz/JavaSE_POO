package _07_MAP____TREEMAP_;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class PRINCIPAL {
	
	public static void main(String args[]) {
		
		
		Map<String, String> nombres = new TreeMap<String, String>();
		
		
		
		nombres.put("51666443R", "Carlos Maldonado Gómez");		//SE CARGA A CARLSO POR DNI DUPLICADO
		nombres.put("51666443R", "Luis Santos Gómez");
		nombres.put("52664443A", "Alicia Torres Durán");
		nombres.put("31234443H", "Soledad Delgado Perico");
		nombres.put("45666443R", "Miguel Rubio gonzález");
		nombres.put("82333333T", "Alicia Pimiento Pérez");
		nombres.put("51777788Z", "Angel Ruiz Califato");
		nombres.put("91549494P", "Fernándo García Solera");
		
		
		// ACCEDER A UN ELEMENTO POR LA CLAVE
		System.out.println(nombres.get("31234443H"));
		
		
		
		// RECORRER EL MAPA
		Set<String> claves = nombres.keySet();
		
		for (String key : claves) {
			System.out.println(key + " - " + nombres.get(key));
		}
		
		System.out.println("Hay " + nombres.size() + " personas");
	}
}
