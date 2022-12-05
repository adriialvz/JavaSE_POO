package _02_CLASE_FIESTA_RAUL_;

import _02_CLASE_FIESTA_RAUL_.FIESTA;

public class PRINCIPAL {
	public static void main(String[] args) {
	
	FIESTA.tipoFiesta fiesta1 = null;
	FIESTA f= new FIESTA();
	FIESTA f1=new FIESTA("Disfraces",10,15);
	
	
    f.settipoFiesta(fiesta1.CASTILLOS);
    f.invitar(20);
    f1.invitar(30);
    f.setBebidas(50);
    f.setnumBoca(70);
    f1.setBebidas(150);
    f1.setnumBoca(170);
    f.Consultar();
    f1.Consultar();
    f.invitar();
    f.invitar(200);
    
    
    int precioFiesta=f.precioFiesta();
    System.out.println("El precio de la fiesta es: "+precioFiesta+" €");
    int precioFiesta1=f1.precioFiesta();
    System.out.println("El precio de la fiesta 1 es: "+precioFiesta1+" €");
    System.out.println("El número de veces que f ha llamado al constructor: "+f.cuentaConstructor());
    
    
    
	}
}
	
