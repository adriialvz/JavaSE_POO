package ABSTRACTO;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		
		//INSTANCIA
		PERSONA p1= new PROFESOR("34876545P","Alma Alvarez","C/ LA GOMERA, 76", "654987654","Matematicas y lengua");
		System.out.println("PROFESOR "+p1.toString());
		System.out.println(p1.trabajar());
		
		
		//INSTANCIA
		PERSONA p2=new ALUMNO("32765423W","Esteban Perez", "C/ LA CALZADA, 23", "232334987","1º BACHILLER");
		System.out.println("\nALUMNO "+p2.toString());
		System.out.println(p2.trabajar());
		
		
		//INSTANCIA
		PERSONA p3= new ADMINISTRATIVO("45566745Q","Mari Puri",
									   "GRAN VIA, 39","234123098","Hacer matriculas y controlar asistencia");
		System.out.println("\nADMINISTRATIVO "+p3.toString());
		System.out.println(p3.trabajar()+"\n\n");
		
		
		System.out.println(((ALUMNO)p2).llamar(p1));
		System.out.println(((PROFESOR)p1).llamar(p2));
		System.out.println(((ADMINISTRATIVO)p3).llamar(p1));
		
		
		System.out.println("\n\n"+((PROFESOR)p1).ponerNotas());
		System.out.println(((ALUMNO)p2).hacerExamen());
		System.out.println(((ADMINISTRATIVO)p3).gestionarMatricula());
	}

}
