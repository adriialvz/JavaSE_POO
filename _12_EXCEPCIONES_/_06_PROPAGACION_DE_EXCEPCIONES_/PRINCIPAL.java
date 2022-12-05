package _06_PROPAGACION_DE_EXCEPCIONES_;

import java.io.FileNotFoundException;

import java.io.FileReader;

public class PRINCIPAL {

	public static void main(String args[])throws FileNotFoundException {
		
		ejecutarTarea1();
	}
	
	
	
	public static void ejecutarTarea1()throws FileNotFoundException {
		ejecutarTarea2();
	}
	
	
	
	public static void ejecutarTarea2()throws FileNotFoundException {
		FileReader fichero = new FileReader("c:/datos.txt");
		System.out.println("El fichero ha sido abierto");
	}
}
