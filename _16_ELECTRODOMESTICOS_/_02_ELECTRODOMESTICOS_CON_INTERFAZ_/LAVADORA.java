package _02_ELECTRODOMESTICOS_CON_INTERFAZ_;

public class LAVADORA extends ABSTRACTA_ELECTRODOMESTICOS {

	
	 //Constantes
   private final static int CARGA_DEF=5;
   
   
     //Atributos
   private int carga;
   
 
   //Constructor
   public LAVADORA(){
       this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
   }

   public LAVADORA(double precioBase, double peso){
       this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
   }
 
   public LAVADORA(double precioBase, double peso, char consumoEnergetico, String color, int carga){
       super(precioBase, peso, consumoEnergetico, color);
       this.carga=carga;
   }
   
   
   public int getCarga() {
       return carga;
   }
 

   	   @Override
   	   public double precioFinal(){
       //Invocamos el método precioFinal del método padre
       double plus=super.precioFinal();
 
       //añadimos el código necesario
       if (carga>30){
           plus+=50;
       }
 
       return plus;
   }
   
   
   	   @Override
       public void comprobarColor(String color){
        //Colores disponibles
       String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
       boolean encontrado=false;
       for(int i=0;i<colores.length && !encontrado;i++){
           if(colores[i].equals(color)){
               encontrado=true;
           }
             
       }
         
       if(encontrado){
           this.color=color;
       }else{
           this.color=COLOR_DEF;
       }
     
   }
   
   
   @Override
   public void comprobarConsumoEnergetico(char consumoEnergetico){
       char consumoEnergetico1=Character.toUpperCase(consumoEnergetico);
       if(consumoEnergetico1>=65 && consumoEnergetico1<=70){
           this.consumoEnergetico=consumoEnergetico1;
       }else{
           this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
       }
         
   }
  
}
