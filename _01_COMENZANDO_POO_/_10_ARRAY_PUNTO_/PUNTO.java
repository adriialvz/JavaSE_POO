package _10_ARRAY_PUNTO_;

public class PUNTO {

	
	
	//PROPIEDADES
	private int x;
	private int y;
	
	
	
	//CONSTRUCTOR
	public PUNTO(int x, int y) {
		this.x= x;
		this.y= y;
	}
	
	
	
	public PUNTO() {
		x= 18;
		y= 54;
	}
	
	
	public String getConsultar() {
		
		return "El punto esta en coordenadas "+x+"."+y;
	}
}
