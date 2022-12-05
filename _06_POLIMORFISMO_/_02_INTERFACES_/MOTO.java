package _02_INTERFACES_;

public class MOTO implements INTERFACE_VEHICULO_ {

	
	  int velocidad= 0;
	
	  
	  
	  
	  
	  
	  
	  public String acelerar(int cuanto) {
	     String cadena="";
	     velocidad=velocidad+cuanto;
	     
	     if (velocidad > VELOCIDAD_MAXIMA) {
	         cadena= "Exceso de velocidad ";
	     } else {
	         cadena= cadena+"La moto a acelerado y va a "+velocidad+" km/hora";
	     }
	         return cadena;
		}
	  
	  
	  
	  
	  
	  
		
	  public String frenar(int cuanto) {
	     velocidad=velocidad-cuanto;
	     
	     return "La moto ha frenado y va a "+velocidad+" km/hora";
		}
}
