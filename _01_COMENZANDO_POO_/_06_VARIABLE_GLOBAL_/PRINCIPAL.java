package _06_VARIABLE_GLOBAL_;

public class PRINCIPAL {

	static int num= 25;		//SIN EL "STATIC" NO PODEMOS ACCEDER A ELLA. AQUI NO HACE FALTA EL NOMBRE DE LA CLASE PORQUE YA ESTAMOS EN ELLA.
	
	public static void main(String[] args) {
		
		num= num+3;
		System.out.println(num);

	}

}
