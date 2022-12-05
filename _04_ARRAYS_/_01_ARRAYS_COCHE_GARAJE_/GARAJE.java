package _01_ARRAYS_COCHE_GARAJE_;

public class GARAJE {
	
	
	private String domicilio;
	private COCHE[] plazas;
	
	
//*****************************************************************************************************************
	
	
	public GARAJE(String domicilio) {
		this.domicilio = domicilio;
		this.plazas = new COCHE[20];
	}
	
	
//*****************************************************************************************************************
	
	
	public String getDomicilio() {
		return this.domicilio;
	}

	
	public String verGaraje() {
		String texto="El garaje con domicilio en "+this.domicilio+" tiene las siguientes plazas: ";
		texto = texto.concat("\n");
		for (int i=0; i<20; i++) {
			texto = texto.concat("  Plaza nº " + i + ": ");
			String estado = (this.plazas[i]==null) ? "Libre" : this.plazas[i].verCoche();
			estado = estado.concat("\n"); // Salto de línea.
			texto = texto.concat(estado);
		}
		
		return texto;
	}
	
	
	public int aparcar(COCHE coche) {
		int i=0;
		while (!(this.plazas[i]==null)) {
			i++;
		}
		
		if (i<20) {
			this.plazas[i] = coche;
			return i;
		} 
		else {
			return -1;
		}
	}
	
	
	public COCHE desaparcar(int numPlaza) {
		if (this.plazas[numPlaza]==null) {
			return null;
		}
		else {
			COCHE c = this.plazas[numPlaza];
			this.plazas[numPlaza] = null;
			return c;
		}
	}
}
