package _02_INTERFACES_;

public class COCHE implements INTERFACE_VEHICULO_{

	
	  int velocidad= 0;
	
	  
	  
	  
	  
	  public String acelerar(int cuanto) {
	     String cadena="";
	     velocidad= velocidad+cuanto;
	     
	     if (velocidad > VELOCIDAD_MAXIMA) {
	    	 cadena= "Exceso de velocidad ";
	     } else {
	    	 cadena= cadena+"El coche a acelerado y va a "+velocidad+" km/hora";
	     }
	     
	     return cadena;
	  }
	  
	  
	  
	  
	  
	  
	  
	  public String frenar(int cuanto) {
	     velocidad= velocidad-cuanto;
	     
	     return "El coche ha frenado y va a "+velocidad+" km/hora";
	  }
}
