package _01_FUSIÓN_DE_ARRAYS_;

public class FUSION {

		protected static final int MAX= 100;
		protected static final int MIN= 0;
		protected static final int TAM= 10;
		protected static int a[]= new int[TAM];
		protected static int b[]= new int[TAM];
		protected static int c[]= new int[TAM*2];
	    
	    
	 
	    public static void carga(){
	        for (int i=0;i<TAM;i++){
	            a[i]=numeroAleatorioEnRango(MIN, MAX);
	            b[i]=numeroAleatorioEnRango(MIN, MAX);
	        }    
	        
	    }
	    
	    
	    
	    
	   public static int numeroAleatorioEnRango(int min, int max){
	         int range = (max - min) + 1;     
	         return (int)(Math.random() * range) + min;
	    }
	   
	   
	   
	   
	   
	    public static void imprimir(int [] v){
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
