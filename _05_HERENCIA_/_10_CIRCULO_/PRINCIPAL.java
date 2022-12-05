package _10_CIRCULO_;

public class PRINCIPAL {

	public static void main(String[] args) {
		

		CIRCULO c1 = new CIRCULO(17.4);

        c1.area = Math.PI * c1.getRadio() * c1.getRadio();

        System.out.println(c1.toString());
	}

}
