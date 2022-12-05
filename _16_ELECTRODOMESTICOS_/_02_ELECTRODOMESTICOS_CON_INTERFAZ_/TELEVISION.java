package _02_ELECTRODOMESTICOS_CON_INTERFAZ_;

public class TELEVISION extends ABSTRACTA_ELECTRODOMESTICOS{

  //Constantes
  private final static int RESOLUCION_DEF=20;
  
  
  //Atributos
  private int resolucion;
  private boolean sintonizadorTDT;
  
  
  //Constructor
  public TELEVISION(){
      this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
  }


  public TELEVISION(double precioBase, double peso){
      this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
  }

 
  public TELEVISION(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
      this.precioBase=precioBase;
      this.peso=peso;
      this.consumoEnergetico=consumoEnergetico;
      this.color=color;
      this.resolucion=resolucion;
      this.sintonizadorTDT=sintonizadorTDT;
  }
  
  
  @Override
  public double precioFinal(){
      //Invocamos el método precioFinal del método padre
      double plus=super.precioFinal();

      //Añadimos el codigo necesario
      if (resolucion>40){
          plus+=precioBase*0.3;
      }
      if (sintonizadorTDT){
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
