package _01_ARRAYS_COCHE_GARAJE_;

public class PRINCIPAL {

	public static void main(String[] args) {
		
		GARAJE garaje = new GARAJE("C/ Oca, 54");
		
		// Vamos a aparcar 3 coches.
		COCHE coche1 = new COCHE("5544MJK", "SUZUKI", "IGNIS");
		COCHE coche2 = new COCHE("4455ABC", "FORD", "FIESTA");
		COCHE coche3 = new COCHE("3344AJA", "RENAULT", "25");
		
		int numPlaza = garaje.aparcar(coche1);
		System.out.println("Un coche ha aparcado en la plaza " + numPlaza);
		numPlaza = garaje.aparcar(coche2);
		System.out.println("Un coche ha aparcado en la plaza " + numPlaza);
		numPlaza = garaje.aparcar(coche3);
		System.out.println("Un coche ha aparcado en la plaza " + numPlaza);
		
		System.out.println(garaje.verGaraje());
		
		COCHE unCoche = garaje.desaparcar(1);
		System.out.println("El " + unCoche.verCoche() + " ha salido del garaje");
		System.out.println(garaje.verGaraje());

	}

}
