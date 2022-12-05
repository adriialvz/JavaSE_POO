package _09_TEATRO_;


	import java.util.Scanner;

	/**
	 *
	 * @author rauls
	 */
	public class PRINCIPAL {	
		private static Scanner IN;
		
		public static OBRA obra = new OBRA("La cena de los idiotas", "Comedia", 95);
		public static TEATRO teatro = new TEATRO("C/ Sol, 45", 300, 2, obra, 30);
		public static void main(String[] args) {

			
			IN = new Scanner(System.in);

			char opc;

			do {

				opc = mostrarMenu();
				
				switch (opc) {

					case '1': 
							Programacion();
							break;
							
					case '2':
							todasLocalidades();
							break;
					case '3':
							localidadesOcupadas();
							break;
					case '4':
							ventaLocalidades();	
							break;
					case '5':
							cancelacionLocalidades();
							break;
					case '6':
							consultaLocalidades();
							break;
					case '7':
							recaudacionTotal();
							break;
					case '8':
							System.out.println("Hasta pronto!");
							break;
					default:

				}

			} while (opc!='8');

			IN.close();

	}

		public static char mostrarMenu() {

			String opcion;
	                System.out.println ("*****************************************************");

			System.out.println ("TEATRO LA BOMBILLA DE DON BLAS");

			System.out.println ("------------------------------");

			System.out.println ("1. Ver la programaci�n actual");

			System.out.println ("2. Mostrar todas las localidades");

			System.out.println ("3. Mostrar localidades ocupadas");

			System.out.println ("4. Vender localidad");

			System.out.println ("5. Cancelar localidad");

			System.out.println ("6. Consultar localidad");

			System.out.println ("7. Calcular recaudaci�n");

			System.out.println ("8. Terminar programa");

			System.out.println ("*******************************************");

			System.out.println ("�Qu� opci�n deseas?");

			opcion = IN.nextLine();
			
			return opcion.charAt(0); 
		
		
		}
		
		private static void Programacion() {
			System.out.println(teatro.verProgramacion());
		}
		
		private static void todasLocalidades() {
			System.out.println(teatro.verLocalidades());
		}
		
		private static void localidadesOcupadas() {
			System.out.println(teatro.verLocalidadesOcupadas());
		}
		
		private static void ventaLocalidades() {
			System.out.println("En qu� fila quieres sentarte (0-4)?");
			int fila = Integer.parseInt(IN.nextLine());
			System.out.println("Y en qu� butaca (0-9)?");
			int butaca = Integer.parseInt(IN.nextLine());
			System.out.println("C�mo se llama?");
			String nombre = IN.nextLine();
			System.out.println("Su tel�fono?");
			String tlf = IN.nextLine();
			System.out.println("Cu�ntos anos tiene?");
			int edad = Integer.parseInt(IN.nextLine());
			
			ESPECTADOR nuevoEspectador = new ESPECTADOR(nombre, tlf, edad);
			System.out.println(teatro.venderLocalidad(fila, butaca, nuevoEspectador));
		}
		
		private static void cancelacionLocalidades() {
			System.out.println("Fila (0-4)?");
			int fila = Integer.parseInt(IN.nextLine());
			System.out.println("Butaca (0-9)?");
			int butaca = Integer.parseInt(IN.nextLine());
			
			
			System.out.println(teatro.cancelarLocalidad(fila, butaca));
		}
		
		private static void consultaLocalidades() {
			System.out.println("Fila (0-4)?");
			int fila = Integer.parseInt(IN.nextLine());
			System.out.println("Butaca (0-9)?");
			int butaca = Integer.parseInt(IN.nextLine());
			
			System.out.println(teatro.consultarLocalidad(fila, butaca));
		}
		
		private static void recaudacionTotal() {
			System.out.println("Recaudaci�n: " + teatro.calcularRecaudacion());
		}


}
