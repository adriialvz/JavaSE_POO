package _09_TEATRO_;

	import java.util.Scanner;
	
	public class TEATRO extends LOCAL implements SALA {
		//hereda de la clase Local
		private OBRA obra; 
		private double precio;
		//Atributos
		private ESPECTADOR[][] localidades; 
		//Array de dos dimensiones
		Scanner IN= new Scanner(System.in);
		//Ponemos a funcionar el Scanner
		public TEATRO(String domicilio, int metros, int accesos, OBRA obra, double precio) {
			super(domicilio, metros, accesos);
			this.obra = obra;
			this.precio = precio; 	
			this.localidades = new ESPECTADOR[5][10];
			//constructor en marcha
		}
		
		
	        @Override
		public String verProgramacion() {
			return ("Hoy representamos " + obra.getTitulo() + ", género: " + obra.getGenero() 
				+ ", duración: " + obra.getMinutosDuracion() + 
				"\nEn " + this.getDomicilio() + ", local de " + this.getMetros() + " metros, con " 
				+ this.getAccesos() + " accesos.\nPrecio: " + this.getPrecio() + " €\n");
		//retornamos las cadenas de texto con la programación con todos los datos	
		}
		

	        @Override
		public String verLocalidades() {		
			StringBuilder todasLocalidades = new StringBuilder();
			for (int f = 0; f < localidades.length; f++) {		
				for (int c = 0; c < localidades[0].length; c++) {
					if (this.localidades[f][c] == null) {
						todasLocalidades.append(f + "." + c + " Libre ");	
					} else {
						todasLocalidades.append(f + "." + c + " Ocupada ");
					}
					if(c == localidades[0].length-1) {
						todasLocalidades.append("\n");
					}
				}
			}
			return todasLocalidades.toString();
			//retornamos las localidades
		}
		
	        @Override
		public String verLocalidadesOcupadas() {
			StringBuilder localidadesOcupadas = new StringBuilder();
			for (int f = 0; f < localidades.length; f++) {		
				for (int c = 0; c < localidades[0].length; c++) {
					ESPECTADOR tempEspectador = localidades [f][c];
					
					if (tempEspectador != null) {
						localidadesOcupadas.append(f + "." + c + " " + tempEspectador.getNombre() 
							+ ", tlf: "	+ tempEspectador.getTlf() 
							+ ", Tipo: " + tempEspectador.rangoEdad() + "\n");
					}
				}
			}
			if (localidadesOcupadas.length() == 0) {
				return ("De momento no hay plazas ocupadas.\n");
			}
			else {
				return localidadesOcupadas.toString();
				//localidades ocupadas
			}
			
		}
		
	        @Override
		public String venderLocalidad(int fila, int butaca, ESPECTADOR e) {
			
			if (localidades[fila][butaca] == null) {
				localidades[fila][butaca] = e;
				
				double precioFinal = calcularPrecio(e);
				
				return ("Se ha vendido la localidad " + fila + "." + butaca + " a " + e.getNombre() 
						+ " por " + precioFinal + " euros.\n");
			}
			else {
				return ("Esa plaza ya esá ocupada. Por favor intente otra plaza.\n");
			}
			/*Desde aquí informamos si las localidades están o no ocupadas
			 * si lo están "rezara" un mensaje informando que está ocupada
			 */
			
		}
		
		public double calcularPrecio(ESPECTADOR e) {
			double importe = getPrecio();
			if (e.rangoEdad().equalsIgnoreCase("infantil")) {
				importe = (importe -(importe * 50 / 100));
			}
			else if (e.rangoEdad().equalsIgnoreCase("menor")) {
				importe = (importe - (importe * 20 / 100));
			}
			else if (e.rangoEdad().equalsIgnoreCase("mayor")) {
				//importe no varia
			}
			else if (e.rangoEdad().equalsIgnoreCase("jubilado")) {
				importe = (importe - (importe * 66 / 100));
			}
			
			return importe;
			//calculamos el importe
		}

	        @Override
		public String cancelarLocalidad(int fila, int butaca) {
			ESPECTADOR espectadorCancelado = localidades[fila][butaca];
			localidades[fila][butaca] = null;
			if (espectadorCancelado == null) {
				return ("La plaza ya está libre.\n");
			}
			else {
			return (espectadorCancelado.getNombre() + " ha cancelado su reserva.\n");
			}
			//podemos cancelar la reserva gracias a este otro método
		}
		

	        @Override
		public String consultarLocalidad(int fila, int butaca) {
			ESPECTADOR reservaEspectador = localidades[fila][butaca];
			return ("Localidad ocupada por " + reservaEspectador.getNombre() 
				+ ", tlf: " + reservaEspectador.getTlf() 
				+ ", Tipo: " + reservaEspectador.rangoEdad() 
				+ ", Precio: " + calcularPrecio(reservaEspectador) + ".\n");
			//nueva consulta de localidades
		}
		
	        @Override
		public double calcularRecaudacion() {
			double recaudacionSuma = 0;
			for (int f = 0; f < localidades.length; f++) {		
				for (int c = 0; c < localidades[0].length; c++) {
					if (localidades[f][c] != null) {
						
						recaudacionSuma = recaudacionSuma + calcularPrecio(localidades[f][c]);
					}//recaudación total añadiendo la suma de las localidades
				}
			}
		
			return (recaudacionSuma);
		}

		//Métodos get/set
		public OBRA getObra() {
			return obra;
		}

		public void setObra(OBRA obra) {
			this.obra = obra;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public ESPECTADOR[][] getLocalidades() {
			return localidades;
		}

		public void setLocalidades(ESPECTADOR[][] localidades) {
			this.localidades = new ESPECTADOR[5][10];
		}


}
