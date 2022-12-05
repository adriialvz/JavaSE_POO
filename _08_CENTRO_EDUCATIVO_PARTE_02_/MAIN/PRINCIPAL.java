package MAIN;

import CLASES_AGREGACIÓN_.*;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		//INSTANCIAS
		AUTOR a1= new AUTOR("ALMA RODRIGUEZ", "Puro deseo de tenerse");
		LIBRO l1= new LIBRO("OSCURO DESEO","PSICOLOGICO", a1);
		
		System.out.println(l1.toString()+"\n\n");

//*********************************************************************
		
		l1.getAutor().setBiografia("PURISMO OSCURO DESEO DE TENERSE");
		System.out.println(l1.toString()+"\n\n");

//*********************************************************************
		
		System.out.println(l1.getAutor().toString()+"\n\n");
		
//*********************************************************************		
		
		System.out.println(a1.toString()+"\n\n");
		
//*********************************************************************
		
		l1.setGenero("PASIONAL");
		System.out.println(l1.toString());
	}

}
