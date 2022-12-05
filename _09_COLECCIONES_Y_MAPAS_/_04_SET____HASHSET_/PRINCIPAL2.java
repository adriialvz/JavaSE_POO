package _04_SET____HASHSET_;

import java.util.HashSet;

public class PRINCIPAL2 {
	
	public static void main(String[] args) {
		
		
		HashSet<TRIANGULO2> trians = new HashSet<TRIANGULO2>();
		
		
		
		trians.add(new TRIANGULO2(1, 1, 1));
		trians.add(new TRIANGULO2(2, 2, 1)); 
		trians.add(new TRIANGULO2(3, 1, 1)); //NOS SE GUARDA, SE CONSIDERA DUPLICADO
		trians.add(new TRIANGULO2(7, 1, 3));
		trians.add(new TRIANGULO2(9, 8, 7));
		trians.add(new TRIANGULO2(9, 8, 7)); //NO SE GUARDA, SE CONSIDERA DUPLICADO
		trians.add(new TRIANGULO2(5, 5, 2));
		trians.add(new TRIANGULO2(1, 1, 2));
		
		for (TRIANGULO2 t : trians) {
			System.out.println(t.verTipo());
		}
	}
}