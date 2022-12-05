package MOVIMIENTOS_Y_CUENTABANCARIA;

import java.util.Scanner;

public class PRINCIPAL {

	 public static void main(String args[]) throws NUMEROS_ROJOS_EXCEPTION {

	       Scanner in= new Scanner(System.in);

	       
	       System.out.println("Vamos a crear una cuenta y realizar el primer ingreso de 100 euros");
	       
	       
	       //INSTANCIA
	       CUENTA_BANCARIA miCuenta= new CUENTA_BANCARIA(38143, "Amelia González");

	       
	       //INGRESAMOS 100
	       System.out.println("******************************************************************");
	                miCuenta.agregarMovimiento("Ingreso inicial", 100);
	                System.out.println(miCuenta.toString()+"\n\n");
	                System.out.println(miCuenta.listarMovimientos());
	                
	                
	                int dinero;
	           try {
	                System.out.println("Cuánto dinero deseas retirar: ");
	                dinero= Integer.parseInt(in.nextLine());
	                
	         } catch (NumberFormatException e) {	//SALTA LA EXCEPCION SI METEMOS UN VALOR NO NUMERICO
	        	   System.out.println("Ha ocurrido una excepción de tipo NumberFormatException");
	   			   System.out.println(e.getMessage());
	   			   return;
	         }     
	          
	           try {
	           		miCuenta.agregarMovimiento("Retirada de fondos", -dinero);
	           } catch (NUMEROS_ROJOS_EXCEPTION e) {			//SALTA SI LA CUENTA SE QUEDA EN NEGATIVO
	           		System.out.println(e.getMessage());
	           		System.out.println(e.toString());
	           		
	           }
	           		System.out.println(miCuenta.toString());       
	           		System.out.println("\n"+miCuenta.listarMovimientos());
	  }

}
