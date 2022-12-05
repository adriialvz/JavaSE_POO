package _05_SET____TREESET_;


import java.util.TreeSet;


public class PRINCIPAL2 {
	
	public static void main(String[] args) {
		
		
		TreeSet<TRIANGULO2> trians = new TreeSet<TRIANGULO2>();
		
		
		
		trians.add(new TRIANGULO2(1, 1, 1)); //LO HACE ORDENADO
		trians.add(new TRIANGULO2(2, 2, 1)); 
		trians.add(new TRIANGULO2(3, 1, 1)); //NO SE GUARDA, SE CONSIDERA DUPLICADO.
		trians.add(new TRIANGULO2(7, 1, 3));
		trians.add(new TRIANGULO2(9, 8, 7));	
		trians.add(new TRIANGULO2(9, 8, 7)); //NO SE GUARDA, SE CONSIDERA DUPLICADO.
		trians.add(new TRIANGULO2(5, 5, 2));
		trians.add(new TRIANGULO2(1, 1, 2));
		
		for (TRIANGULO2 t : trians) {
			System.out.println(t.verTipo());
		}
		
	}
}
