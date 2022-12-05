package _05_PROPIEDAD_CONSTANTE_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		
		
		//INSTANCIA
		TRIANGULO  tri = new TRIANGULO (3, 5, 4);
		
		
		
		//ACCESO CON EL NOMBRE DE LA CLASE
		System.out.println(TRIANGULO.PI); 
		System.out.println(tri.PI+"\n\n");

//**************************************************
		
		//ACCESO A PARTIR DE UN OBJETO
		System.out.println(tri.getLado1()+"\n\n"); 
		
//**************************************************		
		
		System.out.println(tri.toString());

		System.out.println(tri.verTipoTriangulo());	
		
		System.out.println(tri.area());
	}

}
