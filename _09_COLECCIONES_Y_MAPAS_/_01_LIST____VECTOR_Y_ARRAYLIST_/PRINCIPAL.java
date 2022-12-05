package _01_LIST____VECTOR_Y_ARRAYLIST_;

import java.util.ArrayList;
import java.util.Iterator;

public class PRINCIPAL {
	public static void main(String[] args) {
		
		ArrayList<TRIANGULO> trians = new ArrayList<TRIANGULO>();
		
        //AÑADIMOS TRES ELEMENTOS A LA LISTA
		trians.add(new TRIANGULO(1, 2, 3));
		trians.add(new TRIANGULO(1, 1, 2));
		trians.add(new TRIANGULO(1, 1, 1));

//*********************************************************************************	
		
		// trians.size() ---> NO DEVUELVE EL NUMERO TOTAL DE ELEMENTOS GUARDADOS.
		System.out.println("Nº de elementos guardados: " + trians.size()+"\n");
		
//*********************************************************************************	
		
		System.out.println("Accediendo a la posición 1 ---->");
        // trians.get(1) ---> NO DEVUELVE EL ELEMENTO QUE OCUPA LA POSICION 1, 
		// ES DECIR, EL SEGUNDO ELEMENTO,YA QUE EL PRIMER ELEMENTO ES EL 0.
		System.out.println(trians.get(1).verTipo());

//*********************************************************************************			
		
		System.out.println("\nRecorriendo todos los elementos ---->");
		for (int i=0; i<trians.size(); i++) {
			System.out.println(trians.get(i).verTipo()); 
		}
		
//*********************************************************************************	
		
		//AÑADIR NUEVO ELEMENTO EN LA POSICION DESEADA
		trians.add(1, new TRIANGULO(7, 8, 9));
		System.out.println("\nRecorriendo de nuevo todos los elementos ---->");
		for (int i=0; i<trians.size(); i++) {
		     System.out.println(trians.get(i).verTipo());
		}
		
//*********************************************************************************	
		
		//BORRA EL ELEMENTO DE LA POSICION PASADA POR PARAMETROS
		TRIANGULO t = trians.remove(2);
		System.out.println("\nSe ha eliminado el triángulo: " + t.verTipo());
		for (int i=0; i<trians.size(); i++) {
		     System.out.println(trians.get(i).verTipo());
		}
		
//*********************************************************************************	
		
		//FOR EACH
		System.out.println("\nBUCLE POR EACH ---->");
		for (TRIANGULO t1 : trians) {
			System.out.println(t1.verTipo());
		}
		
//*********************************************************************************	
		
		//ITERATOR
		System.out.println("\nITERATOR ---->");
		Iterator<TRIANGULO> itera = trians.iterator();
		TRIANGULO cadaTriangulo; 
		while (itera.hasNext()) {
			cadaTriangulo = itera.next();
			System.out.println(cadaTriangulo.verTipo());
		}
	}
}
