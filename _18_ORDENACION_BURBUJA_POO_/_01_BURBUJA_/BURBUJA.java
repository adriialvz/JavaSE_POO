package _01_BURBUJA_;

public class BURBUJA {

	
	public void Burbuja(String nombre[]) {
		
		for(int i=0;i<nombre.length;i++) {
			for(int j=0;j<nombre.length-1;j++) {							//-1
				
				if(nombre[i].compareToIgnoreCase(nombre[j])<0) {			//DE MAYOR A MENOR O MENOR A MAYOR
					String aux= nombre[i];
					nombre[i]= nombre[j];
					nombre[j]= aux;
				}
			}
		}
		for(int i=0;i<nombre.length;i++) {
			System.out.println(nombre[i]);
		}
	}
	
	
	public void Secuencial(String nombre[], String buscar) {
		
		int i;
		
		for(i=0;i<nombre.length && !nombre[i].equalsIgnoreCase(buscar);i++) {
		}

		if(i!=nombre.length) {
			System.out.println("ENCONTRADO EN LA POSICION -----> "+(i+1));
		} else {
			System.out.println("NO ENCONTRADO");
		}
	}
	
	
	
}
