package _02_ELECTRODOMESTICOS_CON_INTERFAZ_;

public abstract class ABSTRACTA_ELECTRODOMESTICOS implements INTERFACE_ELECTRODOMESTICOS {

	//Constantes   
    protected final static String COLOR_DEF="blanco";
    protected final static char CONSUMO_ENERGETICO_DEF='F';
    protected final static double PRECIO_BASE_DEF=100;
    protected final static double PESO_DEF=5;
    
    
    //Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
    
    //Constructores
    
    public ABSTRACTA_ELECTRODOMESTICOS(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }
   

    public ABSTRACTA_ELECTRODOMESTICOS(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }
   
 
    public ABSTRACTA_ELECTRODOMESTICOS(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
    
    
    @Override
    public abstract void comprobarColor(String color);
    @Override
    public abstract void comprobarConsumoEnergetico(char consumoEnergetico);
   

    public double getPrecioBase() {
        return precioBase;
    }

    
    public String getColor() {
        return color;
    }
   
    
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    
    public double getPeso() {
        return peso;
    }

    
    @Override
    public double precioFinal(){
        double plus=0;
        switch(consumoEnergetico){
            case 'A':
                plus+=100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus+=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
            plus+=10;
        }else if(peso>=20 && peso<49){
            plus+=50;
        }else if(peso>=50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }
   
        return precioBase+plus;
    }
    
    
    public void setPrecioBase(double precio) {
        this.precioBase=precio;
    }
  
    
    public void setColor(String color) {
        this.color=color;
    }
   
   
    public void setConsumoEnergetico(char tipo) {
        this.consumoEnergetico=tipo;
    }
    
    
    public void setPeso(double peso) {
        this.peso=peso;
    }
 
}











