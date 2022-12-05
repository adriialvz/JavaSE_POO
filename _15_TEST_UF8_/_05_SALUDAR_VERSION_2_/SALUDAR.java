package _05_SALUDAR_VERSION_2_;

public class SALUDAR {

	public void saludar2() throws EXCEPTION888 {
		if(Math.random() < 0.5) 
			throw new EXCEPTION888();
		System.out.println("Hola");
	}

}
