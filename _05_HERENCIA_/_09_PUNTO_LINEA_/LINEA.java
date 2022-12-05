package _09_PUNTO_LINEA_;

public class LINEA {

	
	
	//PROPIEDADES
    private PUNTO inicio;
    private PUNTO fin;

    
    
    //CONSTRUCTOR
    public LINEA(int desdeX, int desdeY, int hastaX, int hastaY) {

                  inicio= new PUNTO(desdeX, desdeY);
                  fin= new PUNTO(hastaX, hastaY);
    }

	@Override
	public String toString() {
		return "LINEA [inicio=" + inicio + ", fin=" + fin + "]";
	}
    
    
}
