package _02_FUSION_UN_PROGRAMA_;

public class PRINCIPAL {

    public static void main(String[] args) {
        /*Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en
        una tercera, de forma que sigan ordenados*/
        int i,j,k;          
        carga();
        imprimir(a);
        imprimir(b);
        // comenzamos a fusionar a y b en c
        i=0; // utilizaremos i como índice de a;
        j=0; // utilizaremos j como índice de b;
        k=0; // utilizaremos k como índice de c
        while(i<10 && j<10){
            if (a[i] < b[j]){ // nos interesa el elemento de a
                c[k] = a[i];
                i++; // incrementamos i para tomar el siguiente elemento de a
            }
            else{
                c[k] = b[j];
                j++; // incrementamos j para tomar el siguiente elemento de b
                }
            k++; // como hemos copiado a c[k], incrementamos k, para
            // en la siguiente vuelta, utilizar el siguiente hueco de la tabla
        }
        // cuando salimos de while es por que alguna de las tablas (a o b) ha llegado al final
        if(i==10) // hemos copiado toda la tabla a en c, queda por copiar un resto de b
        while (j<10){
            c[k] = b[j];
            j++;
            k++;
        }
        else // hay que copiar el resto de a en c
        while (i<10){           
            c[k] = a[i];
            i++;
            k++;
        }
       imprimir(c);
       imprimir(ordenacionBurbuja(c));
 }
    
        private static final int MAX=100;
        private static final int MIN=0;
        private static final int TAM=10;
        private static int a[]= new int[TAM];
        private static int b[]= new int[TAM];
        private static int c[]= new int[TAM*2];
        // leemos a
        /**
         * @param args the command line arguments
         * 
         */
        static void carga(){
            for (int i=0;i<TAM;i++){
                a[i]=numeroAleatorioEnRango(MIN, MAX);
                b[i]=numeroAleatorioEnRango(MIN, MAX);
            }    
            
        }
        static int numeroAleatorioEnRango(int min, int max){
             int range = (max - min) + 1;     
             return (int)(Math.random() * range) + min;
        }
        static void imprimir(int [] v){
          for (int f=0; f<v.length; f++) {
                System.out.print(v[f]+"    ");
    	    }
            System.out.println("  ");
          }	
        public static int [] ordenacionBurbuja(int vec[]){
                int temp;
                final int N=vec.length;//saco el número de filas
                //System.out.println(N);
                //saco el número de columnas
                for(int i=0;i<N;i++){
                    for(int j=0;j<N-1;j++){
                       if(vec[j]>vec[j+1]){
                                    temp=vec[j+1];
                                    vec[j+1]=vec[j];
                                    vec[j]=temp;
                                    }
                    }
                }
                return vec;
          }
}