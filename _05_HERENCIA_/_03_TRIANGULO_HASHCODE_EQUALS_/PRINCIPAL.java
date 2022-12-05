package _03_TRIANGULO_HASHCODE_EQUALS_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		//INSTANCIAS
		TRIANGULO t1 = new TRIANGULO(3,3,3);
		TRIANGULO t2 = new TRIANGULO(3,3,3);
		
		
		
		//TO STRING
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		
		
		
		//BORRANDO EL METODO HASHCODE 
		//DE LA CLASE TRIANGULO DA UN HASHCODE DISTINTO
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		
		
		//CON EL METODO HASCODE 
		//DE LA CLASE TRIANGULO DA UN HASCODE IGUAL
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		
		
		//BORRANDO EL METODO EQUAL 
		//DE LA CLASE TRIANGULO DA UN EQUALS FALSE
		System.out.println(t1.equals(t2));
		
		
		
		//EL METODO EQUAL 
		//DE LA CLASE TRIANGULO DA UN EQUALS TRUE
		System.out.println(t1.equals(t2));

	}

}
