package _11_ARRAY_REFRANERO_;

public class REFRA {

	public void modificarArray(String refran[]) {
		
		for(int i=0;i<refran.length;i++) {
			refran[i]=refran[i].toLowerCase();
			System.out.println(refran[i]);
		}
	
	}
}
