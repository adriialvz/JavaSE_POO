package _05_VENTA_;


public class PRINCIPAL {

	public static void main(String[] args) {
		
		//INSTANCIAS
		VENTA v1= new VENTA("CHORIZOS", 20, 1.20F);
		VENTA v2= new VENTA("JAMON", 1, 320.54f);
		VENTA v3 = new VENTA("Pen Drive", 5.5f);
		
		
//*********************************************************************************************		
		
		System.out.println(v1.ver());
		System.out.println(v1.toString());
		System.out.println("Precio normal: "+v1.total()+"€");
		System.out.println("Precio con el descuento del 10%: "+v1.calcularTotal(10)+"€\n\n");
		
		
//*********************************************************************************************		
		
		
		System.out.println(v2.ver());
		System.out.println(v2.toString());
		System.out.println("Precio normal: "+v2.total()+"€");
		System.out.println("Precio con el descuento del 10%: "+v2.total(10)+"€\n\n");
		
		
//*********************************************************************************************	
		
		
		System.out.println(v3.ver());
		System.out.println(v3.toString());
		System.out.println("Precio normal: "+v3.total()+"€");
		System.out.println("Precio con el descuento del 10%: "+v3.calcularImporte(10.5f)+"€");
	}

}
