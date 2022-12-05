package _06_PROPAGACION_DE_EXCEPCIONES_;


import java.io.FileNotFoundException;
import java.io.FileReader;


public class PRINCIPAL2 {
	
	public static void main(String args[]) {
		
		
		try {
			ejecutarTarea1();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return;
		}
	}
	
	
	
	public static void ejecutarTarea1() throws FileNotFoundException {
		ejecutarTarea2();
	}
	
	
	
	public static void ejecutarTarea2() throws FileNotFoundException {
		FileReader fichero = new FileReader("c:/datos.txt");
		System.out.println("El fichero ha sido abierto");
	}
}