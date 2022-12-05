package _01_CLASE_MADRE_CLASE_HIJA_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		FIGURA fig= new FIGURA(7,3,4,2,"Hexágono");
		
		System.out.println(fig.consultar());	
		
	System.out.println("\n");	
//***************************************************************		
		
		
		TRIANGULO tri = new TRIANGULO(3,3,5,7,5,7);
		
		System.out.println(tri.consultar());
		System.out.println("Area triangulo= " + tri.area());
		System.out.println(tri.toString()); //CADENA DE TEXTO CON INFO
		
	System.out.println("\n");	
//***************************************************************			
		
		
		RECTANGULO rec = new RECTANGULO(7,8,7,10);
		
		rec.alto= 12;
		System.out.println(rec.consultar());
		System.out.println("Area rectangulo= " + rec.area());
		System.out.println("Area rectangulo= " + rec.area2());
		System.out.println(rec.getAncho());
		System.out.println(rec.dato());
		System.out.println(rec.toString());
		
		
		
	System.out.println("\n");
//***************************************************************			
		
		
		CIRCULO cir = new CIRCULO(7,8,10,10,5);
		
		System.out.println(cir.consultar());
		System.out.println("Area circulo= " + cir.area());
		
		System.out.println(cir.toString());
		
		
	}
}
