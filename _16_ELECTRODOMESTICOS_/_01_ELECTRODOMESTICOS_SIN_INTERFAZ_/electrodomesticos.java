package _01_ELECTRODOMESTICOS_SIN_INTERFAZ_;

public class electrodomesticos {

	
	protected final static String COLOR= "Blanco";
	protected final static char CONSUMO= 'F';
	protected final static double PRECIO= 100;
	protected final static double PESO= 5;
	
	
	protected double precio;
	protected String color;  
	protected char consumo;
	protected double peso;
	
//****************************************************************	
	
	public electrodomesticos() {
		this(PRECIO, COLOR, CONSUMO, PESO);
		
		this.precio= PRECIO;
		this.color= COLOR;
		this.consumo= CONSUMO;
		this.peso= PESO;
	}
	
	
	public electrodomesticos(double precio, double peso) {	
		this(precio, COLOR, CONSUMO, peso);
	}

	
	public electrodomesticos(double precio, String color, char consumo, double peso) {
		this.precio= precio;
		this.peso= peso;
		
		comprobarConsumo(consumo);
		comprobarColor(color);
	}
	
//****************************************************************		
	
	public double getPrecio() {
		return precio;
	}
	public String getColor() {
		return color;
	}
	public char getConsumo() {
		return consumo;
	}
	public double getPeso() {
		return peso;
	}
	
//****************************************************************		
	
	private  void comprobarConsumo(char consumo) {
		if(consumo>=65 && consumo <=70) {
			this.consumo= consumo;
		} else {
			this.consumo= CONSUMO;
		}
	}
	
//****************************************************************	
	
	public void comprobarColor(String color) {
		String colores[]= {
				"Blanco",
				"Negro",
				"Rojo",
				"Azul",
				"Gris"
		};
		boolean buscar= false;
		for(int i=0;i<colores.length && !buscar;i++) {
			if(colores[i].equals(color)) {
				buscar=true;
			}
		}
		if(buscar) {
			this.color= color;
		} else {
			this.color= COLOR;
		}
	}
	
//****************************************************************
	
	public double precioFinal() {
		double plus= 0;
		switch(consumo) {
		
			case 'A': plus+=100;break;
			case 'B': plus+=80; 
			case 'C': plus+=60;break;
			case 'D': plus+=50;break;
			case 'E': plus+=30;break;
			case 'F': plus+=10;break;
		}
		
		if(peso > 0 && peso<19) {
			plus+=10;
		} else if(peso >=20 && peso < 49) {
			plus+=50;
		} else if(peso >= 50 && peso <=79) {
			plus+=80;
		} else if (peso >= 80) {
			plus+=100;
		}
		return precio+plus;
	}
}
