package _09_PUNTO_LINEA_;

public class PUNTO {

	
	//PROPIEDADES
    private int x;
    private int y;
    
    
    
    //CONSTRUCTOR
    public PUNTO(int x, int y) {

             this.x= x;
             this.y= y;
    }

	@Override
	public String toString() {
		return "PUNTO [x=" + x + ", y=" + y + "]";
	}
    
    
}
