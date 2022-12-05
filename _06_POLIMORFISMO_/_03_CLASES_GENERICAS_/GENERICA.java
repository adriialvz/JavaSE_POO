package _03_CLASES_GENERICAS_;

public class GENERICA <T> {

	//PROPIEDADES
	private T dato;

	
	//CONSTRUCTOR
	public GENERICA(T dato) {
		this.dato= dato;
	}
	
	
	
	//METODO
	public String informa() {
		return "El objeto contiene un dato de tipo: "+dato.getClass().getName()+"\nValor = "+dato.toString();
	}
}
