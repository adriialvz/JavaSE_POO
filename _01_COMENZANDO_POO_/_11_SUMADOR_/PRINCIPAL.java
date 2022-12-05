package _11_SUMADOR_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		//INSTANCIA
		SUMADOR s1 = new SUMADOR(3,7);
		
		
		//LE DAMOS VALOR A LAS PROPIEDADES DE LA CLASE SUMADOR Y YA
		prueba(s1);
		
		System.out.println(s1.toString());
		System.out.println("Suma="+s1.suma());
	}

	
	//LE DAMOS VALOR A LAS PROPIEDADADES DE LA CLASE SUAMDOR Y YA
	public static void prueba(SUMADOR num) {
		num.setA(10);
		num.setB(7);
	}
}
