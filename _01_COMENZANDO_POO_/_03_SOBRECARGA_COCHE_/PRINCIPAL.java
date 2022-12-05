package _03_SOBRECARGA_COCHE_;

public class PRINCIPAL {

	public static void main(String[] args) {
		

		COCHE c1= new COCHE("6534PLK","KIA","SPORTAGE","BLANCO");
		COCHE c2= new COCHE("2420JRM","KIA","SPORTAGE","blanco",120);
	
		
		System.out.println(c1.toString()+"\n\n");

//*******************************************************************
		
		c1.setAcelerar(100);
		c1.setAcelerar();
		
		c2.setAcelerar(50);
		c2.setAcelerar();
		
//*******************************************************************
		
		System.out.println(c1.toString());
		System.out.println(c2.real()+"\n\n");

//*******************************************************************		
		
		c1.setFrenar(30);
		c1.setFrenar();
		
		c2.setFrenar(20);
		c2.setFrenar();
		
		System.out.println(c1.toString());
		System.out.println(c2.real()+"\n\n");

//*******************************************************************		
		
		c2.velocity();
		c1.velocity();
	}
}
