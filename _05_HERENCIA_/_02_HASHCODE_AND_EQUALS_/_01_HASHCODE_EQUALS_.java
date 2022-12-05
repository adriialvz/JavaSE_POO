package _02_HASHCODE_AND_EQUALS_;

public class _01_HASHCODE_EQUALS_ {

	public static void main(String[] args) {
		
		//DOS VARIABLES CON DOS CADENAS
		
		
		String saludo1 = "Hola mundo";
		String saludo2 = "Hola mundo";
		
		
	
		//LLAMAMOS A SALUDO1 Y QUE NOS SAQUE EL HASHCODE	
		System.out.println(saludo1.hashCode());
		
		
		//LLAMAMOS A SALUDO2 Y QUE NOS SAQUE EL HASHCODE
		System.out.println(saludo2.hashCode());
		
		
		
		
		
		//DOS OBJETOS CON LA MISMA CADENA TIENE EL MISMO HASHCODE
		//SI SON DOS NUMEROS IGUALES TAMBIEN
		//DIFERENCIA ENTRE MAYUSCULAS Y MINUSCULAS
		
		
		
		
		//LLAMAMOS A SALUDO1 Y EL DECIMOS QUE LA COMPARE CON SALUDO2
		//DEVUELVE UN BOOLEANO TRUE O FALSE
		System.out.println(saludo1.equals(saludo2));

	}

}
