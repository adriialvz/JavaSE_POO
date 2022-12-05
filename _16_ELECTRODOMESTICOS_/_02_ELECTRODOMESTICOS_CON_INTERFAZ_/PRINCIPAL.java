package _02_ELECTRODOMESTICOS_CON_INTERFAZ_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		 //Creamos un array de Electrodomesticos
        ABSTRACTA_ELECTRODOMESTICOS listaElectrodomesticos[]=new ABSTRACTA_ELECTRODOMESTICOS[9];
        
        /*Asignamos cada una de las posiciones como queramos
        Ya no es posible porque es una clase abstracta
        listaElectrodomesticos[0]=new Electrodomesticos(200, 60, 'C', "Verde");*/
        listaElectrodomesticos[0]=new LAVADORA(250, 90);
        listaElectrodomesticos[1]=new LAVADORA(150, 30);
        listaElectrodomesticos[2]=new TELEVISION(500, 80, 'E', "negro", 42, false);
        listaElectrodomesticos[5]=new LAVADORA(300, 40, 'Z', "blanco", 40);
        listaElectrodomesticos[6]=new TELEVISION(250, 70);
        listaElectrodomesticos[7]=new LAVADORA(400, 100, 'A', "verde", 15);
        listaElectrodomesticos[8]=new TELEVISION(200, 60, 'C', "naranja", 30, true);
        
        //Creamos las variables que usaremos para almacenar la suma de los precios
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
        
        //Recorremos el array invocando el metodo precioFinal
        for(int i=0;i<listaElectrodomesticos.length;i++){
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */
   
            if(listaElectrodomesticos[i] instanceof ABSTRACTA_ELECTRODOMESTICOS){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof LAVADORA){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof TELEVISION){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
   
        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);

	}

}
