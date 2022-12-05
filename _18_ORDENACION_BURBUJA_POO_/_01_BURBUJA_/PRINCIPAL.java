package _01_BURBUJA_;

import java.util.Scanner;

public class PRINCIPAL {
	
	public static void main(String[] args) {

	Scanner in= new Scanner(System.in);
	
	BURBUJA b1= new BURBUJA();
	
	String nombre[]= new String[10];
	
	nombre[0]= "Pepe";
	nombre[1]= "Juan";
	nombre[2]= "Luis";
	nombre[3]= "Alicia";
	nombre[4]= "Rosa";
	nombre[5]= "Carlos";
	nombre[6]= "Pedro";
	nombre[7]= "Lucas";
	nombre[8]= "Maria";
	nombre[9]= "Carlota";
	
	b1.Burbuja(nombre);
	
	System.out.println("INTRODUCE UN NOMBRE A BUSCAR");
	String buscar=in.nextLine();
	b1.Secuencial(nombre, buscar);
 }
}
