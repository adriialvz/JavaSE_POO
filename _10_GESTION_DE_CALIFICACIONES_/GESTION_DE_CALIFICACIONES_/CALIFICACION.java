package GESTION_DE_CALIFICACIONES_;

public class CALIFICACION {

	
      private String asignatura;
      private int nota; // VALOR DE 0 A 100
  
      
    // CONSTRUCTOR QUE RECIBA ARGUMENTOS PARA LAS DOS PROPIEDADES
    public CALIFICACION(String asignatura, int nota) {
    	  this.asignatura = asignatura;
    	  this.nota = nota;
    } 
      
    // METODOS GET Y SET
    public String getAsignatura() {
  		return asignatura;
  	}

  	public void setAsignatura(String asignatura) {
  		this.asignatura = asignatura;
  	}

  	public int getNota() {
  		return nota;
  	}

  	public void setNota(int nota) {
  		this.nota = nota;
  	}
  
      
    @Override
    public String toString() {
        return asignatura+": "+nota+"\n";               
    // DEVOLVER UNA CADENA TIPO: “Lengua: 55”
    }
}


