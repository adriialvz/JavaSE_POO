package _09_ARRAY_LIST_;

import java.util.ArrayList;

public class ARRAY_LIST {

	public static void main(String[] args) {
		
		ArrayList<String> mensajes= new ArrayList<String>();
		
		mensajes.add("Hoy te tocara la loteria"); 
		mensajes.add("Hoy te entrara una piedra en el zapato");
		mensajes.add("Hoy conoceras una persona muy especial");
		mensajes.add("Hoy pisaras un charco");
		mensajes.add("Hoy encontraras un billete de 50 euros");
		
		int ale1= (int)(Math.random()*5);
		int ale2= (int)(Math.random()*5+0);
	//	int ale3= new Random().nextInt(5);
		
		System.out.println(mensajes.get(ale1));
		System.out.println(mensajes.get(ale2));

	}

}
