package _11_ARRAY_REFRANERO_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		
		String refran[]= {
				
				"A LA TERCERA VA LA VENCIDA",
				"A MAS AÑOS, MAS DESENGAÑOS",
				"ANDE YO CALIENTE Y RIASE LA GENTE",
				"BURRO GRANDE, ANDE O NO ANDE"
		};
		
		modificarArray(refran);
		
	}
	
	
	public static void modificarArray(String refran[]) {
		
		for(int i=0;i<refran.length;i++) {
			refran[i]=refran[i].toLowerCase();
			System.out.println(refran[i]);
		}
	}

}
