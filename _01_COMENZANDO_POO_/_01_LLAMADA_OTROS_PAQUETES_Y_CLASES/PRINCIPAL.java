package _01_LLAMADA_OTROS_PAQUETES_Y_CLASES;

//		*******************************************************
//		**FORMAS DE LLAMAR A OTRAS CLASES, DESDE OTRO PAQUETE**
//		**      IMPORT NOMBRE PAQUETE . NOMBRE CLASE;	     **
//		*******************************************************


				import _01_CLASES_.RESTADOR;

				import _01_CLASES_.SUMADOR;

				import _01_CLASES_.*;



public class PRINCIPAL {

	public static void main(String[] args) {
		
		
	//CON LA INSTANCIA ASÍ TAMBIEN VALE ---> NOMBRE PAQUETE . NOMBRE CLASE   2 VECES
		_01_CLASES_.SUMADOR s1= new _01_CLASES_.SUMADOR();
		
		_01_CLASES_.RESTADOR r1= new _01_CLASES_.RESTADOR();
		

	}

}
