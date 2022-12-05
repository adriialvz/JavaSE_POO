package _01_ELECTRODOMESTICOS_SIN_INTERFAZ_;

public class principal {

	public static void main(String[] args) {
		
		
		electrodomesticos l1[]= new electrodomesticos[10];
		
		
		l1[0]= new electrodomesticos(200, "Verde", 'C', 60);
		l1[1]= new lavadora(150, 30);
		l1[2]= new television(500, "Negro", 'E', 80, 42, false );
		l1[3]= new electrodomesticos();
		l1[4]= new electrodomesticos(600, "Gris", 'D' , 20);
		l1[5]= new lavadora(300, "Blanco", 'Z', 40, 40 );
		l1[6]= new television(200, 70);
		l1[7]= new lavadora(400, "Verde", 'A', 100, 15);
		l1[8]= new television(200, "Naranja", 'C', 60, 30, true);
		l1[9]= new electrodomesticos(50, 10);
		
		
		
		double sumaElectro=0;
		double sumaTele=0;
		double sumaLava=0;
		
		
		
		for(int i=0;i<l1.length;i++) {
			
			if(l1[i] instanceof electrodomesticos) {
				sumaElectro+= l1[i].precioFinal();
			}
			
			if(l1[i] instanceof lavadora) {
				sumaLava+= l1[i].precioFinal();
			}
			
			if(l1[i] instanceof television) {
				sumaTele+= l1[i].precioFinal();
			}
		}
		
		
		
		System.out.println("La suma del precio de los electrodomesticos es de: "+sumaElectro);
		System.out.println("La suma del precio de las lavadoras es de: "+sumaLava);
		System.out.println("La suma del precio de las televisiones es de: "+sumaTele);
	}
}
