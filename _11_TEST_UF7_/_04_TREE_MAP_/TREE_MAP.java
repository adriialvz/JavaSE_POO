package _04_TREE_MAP_;


import java.util.TreeMap;


public class TREE_MAP {

	public static void main(String[] args) {
		
		Articulo a1= new Articulo("Cuaderno, ", 1.7);
		Articulo a2= new Articulo("Lapiz, ", 0.85); 
		Articulo a3= new Articulo("Boligrafo, ", 1.2);
		
		
		TreeMap<String, Articulo> almacen= new TreeMap<String, Articulo>();
		
/*		almacen.add("CU", a1);
		almacen.add("LA", a2);
		almacen.add("BO", a3);
		System.out.println(almacen.get("LA")); */    //ERROR
	}

}
