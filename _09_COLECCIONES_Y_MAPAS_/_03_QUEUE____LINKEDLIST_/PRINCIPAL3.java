package _03_QUEUE____LINKEDLIST_;

import java.util.LinkedList;
import java.util.Queue;

public class PRINCIPAL3 {
	
	public static void main(String[] args) {
		
		
		
        Queue<String> mensajes = new LinkedList<String>();

        
        
        
		// ENTRADA DE LOS ELEMENTOS EN COLA.
		mensajes.add("La cripta mágica");
		mensajes.add("El perro de San Roque");
		mensajes.add("Mente sana, cuerpo sano");
		
		
		
		
		// SALIDA DE LOS ELEMENTOS EN COLA.
                while (!mensajes.isEmpty()) { 
        	       String sms = mensajes.remove();
                       System.out.println(sms);
                }
	}
}
