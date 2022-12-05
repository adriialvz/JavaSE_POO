package GESTION_DE_CALIFICACIONES_;

import java.util.ArrayList;

public class ALUMNO {

		//PROPIEDADES
		 private String nombre;
		 private int matricula;
		 private ArrayList<CALIFICACION> calificaciones;
		 
		 
		 //CONSTRUCTOR
		 public ALUMNO(String nombre, int matricula) {
			 this.nombre = nombre;
			 this.matricula = matricula;
			 this.calificaciones = new ArrayList<CALIFICACION>();
			 // ASIGNAR A LAS PROPIEDADES NOMBRE Y MATRICULA LOS VALORES DE LOS PARAMETRO
			 // CONSTRUIR EL OBJETO ArrayList calificaciones.
		    }
		 
		 
		// AÑADIR LA NUEVA CALIFICACION A LA COLECCION DE CALIFICACIONES
		  public void calificar(String asignatura, int nota) {
				calificaciones.add(new CALIFICACION(asignatura, nota));
		}
		 	
		 		
		 
		// AÑADIR METODOS "GET" PARA LAS TRES PROPIEDADES QUE SERAN DE SOLO LECTURA
		public String getNombre() {
				return nombre;
		 	}


		public int getMatricula() {
				return matricula;
			}


		public ArrayList<CALIFICACION> getCalificaciones() {
				return calificaciones;
			}
		 
		          
		@Override
		public String toString() {
			return "Alumno Matricula: "+matricula+ " - "+ nombre+"\n";
		   // DEVOLVER UNA CADENA SIMILAR A LA DE ESTE EJEMPLO:
		   // “ALUMNO MATRICULA: 31553 - Carmen Torres”
		  }
		
		
		//LISTADO DE ASIGNATURA + NOTA Y LA NOTA MEDIA AL FINAL
		public String listado() {
			String listado="";
			int cont=0;
			int cont2=0;
			double media;
			for(CALIFICACION cali: calificaciones) {
				listado= listado + cali.toString();
				cont+=cali.getNota();
				cont2++;
			}
			media=(double)cont/cont2;
			return listado+"\n"+"NOTA MEDIA: "+media;
		}
}

