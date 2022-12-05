package _01_FUSIÓN_DE_ARRAYS_;


public class PRINCIPAL extends FUSION {

	public static void main(String[] args) {
		

		 /*Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en
        una tercera, de forma que sigan ordenados*/
        int i, j, k;          
        
        
        FUSION.carga();
        FUSION.imprimir(a);
        FUSION.imprimir(b);
        
        
        // comenzamos a fusionar a y b en c
        i=0; // utilizaremos i como índice de a;
        j=0; // utilizaremos j como índice de b;
        k=0; // utilizaremos k como índice de c
        
        
        while(i<10 && j<10){
            if (a[i] < b[j]){ // nos interesa el elemento de a
                c[k] = a[i];
                i++; // incrementamos i para tomar el siguiente elemento de a
            } else {
                c[k] = b[j];
                j++; // incrementamos j para tomar el siguiente elemento de b
            }
            k++; // como hemos copiado a c[k], incrementamos k, para
            // en la siguiente vuelta, utilizar el siguiente hueco de la tabla
        }
        // cuando salimos de while es por que alguna de las tablas (a o b) ha llegado al final
        if(i==10) { // hemos copiado toda la tabla a en c, queda por copiar un resto de b
        	while (j<10){
        		c[k] = b[j];
        		j++;
        		k++;
        	} 
        } else { // hay que copiar el resto de a en c
        	while (i<10){           
        		c[k] = a[i];
        		i++;
        		k++;
        }
       FUSION.imprimir(c);
       FUSION.imprimir(ordenacionBurbuja(c));
    }
        
        
	}
}
