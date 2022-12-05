package GESTION_DE_CALIFICACIONES_;

import java.util.*;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
	
		//INSTANCIA
		ALUMNO a1= new ALUMNO("Adrian", 786453);
		
	
		// PARA QUE NO HAYA NOTAS MAYORES DE 100 Y MENOS DE 0
		int nota[]= new int[6];
		for(int i=0; i<nota.length; i++) {
			int num;
			do {
			System.out.println("INTRODUCE UNA NOTA");
			num=in.nextInt();
			if(num<0 || num>100) {
				System.out.println("¡¡¡ERRORRRRR!!! ----> INTRODUCE UN NUMERO ENTRE 0 Y 100");
			}
			} while(num<0 || num>100);
			nota[i]=num;
		}
		
		//LLAMAMOS AL METODO TOSTRING()
		System.out.println("\n\n"+a1.toString());

		
		//PASAMOS DATOS AL METODO CALIFICAR()
		a1.calificar("MATEMATICAS", nota[0]);
		a1.calificar("LENGUA", nota[1]);
		a1.calificar("INGLES", nota[2]);
		a1.calificar("FÍSICA", nota[3]);
		a1.calificar("EDUCACION FÍSICA", nota[4]);
		a1.calificar("BIOLOGÍA Y GEOLOGÍA", nota[5]);
		
		
		//LAMAMOS AL METODO LISTADO()
		System.out.println(a1.listado());
		
	}

}
