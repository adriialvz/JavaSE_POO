package _01_CLASE_FIESTA_;

import java.util.*;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		
		System.out.println("Elige un tipo de fiesta: Infantil, Cumpleaños, Disfraces, Despedida...");
			String tipo=in.nextLine();
		
		
		System.out.println("Introduce el numero de invitados a la fiesta...");
			int num=in.nextInt();
		
		System.out.println("********************************************************\n"
				+ "********************************************************\n" 
				+ "********************************************************");
		
//****************************************************************************************************************************************************************		
		
		//INSTANCIA CON PARAMETROS
		FIESTA f1= new FIESTA(tipo,num,num,"Calle La Calzada Nº58  8ºB, 58000 Huelva");
		
		//BUCLE QUE EN CADA PASADA LLAMA AL METODO Y EL METODO CUENTA LAS PERSONAS QUE VAN A LA FIESTA
		for(int i=0;i<=num;i++) {
			f1.setInvitar();	
		}
		
		
		System.out.println("Hubo alguna cancelacion de ultima hora...???");
			int num2=in.nextInt();
		
		System.out.println("********************************************************\n"
				+ "********************************************************\n" 
				+ "********************************************************");
		
//****************************************************************************************************************************************************************
		
		//BUCLE QUE EN CADA PASADA LLAMA AL METODO Y EL METODO QUITA PERSONAS QUE NO VAN A ASISTIR A LA FIESTA
		for(int i=0;i<=num2;i++) {
			f1.setCancelarInvitados();
		}
		
		//BUCLE QUE EN CADA BAJA DE PERSONAS QUE HAYA LLAMA A LOS METODOS PARA QUITAR BOCATAS Y BEBIDAS Y SACA LOS BOCATAS TOTALES DE LA GENTE QUE VA A ASISTIR
		for(int i=0;i<num2;i++) {
			f1.setBocatas();
			f1.setBebidas();
		}
		
		//LLAMAMOS AL METODO PARA VER TODA LA INFORMACION DE LA FIESTA
		System.out.println(f1.getConsultar1());
		System.out.println("********************************************************\n"
							+ "********************************************************\n" 
							+ "********************************************************");	
			
//****************************************************************************************************************************************************************		
			
		//INSTANCIA SIN PARAMETROS, ENTONCES COGE EL SEGUNDO CONSTRUCTOR QUE TIENE INFORMACION POR DEFECTO
		FIESTA f2= new FIESTA();
			f2.setInvitar();
			f2.setInvitar();
			f2.setInvitar();		//INVITAMOS A 6 PERSONAS Y HAY UNA CANCELACION
			f2.setInvitar();		
			f2.setInvitar();
			f2.setInvitar();
			f2.setCancelarInvitados();
			System.out.println(f2.getConsultar2());
	}
}
