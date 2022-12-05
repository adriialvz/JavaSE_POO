package MOVIMIENTOS_Y_CUENTABANCARIA;


	import java.time.LocalDate;

	
	public class MOVIMIENTOS {

		
			//PROPIEDADES
	       private LocalDate fecha;
	       private String concepto;
	       private double cantidad;
	       private double saldo;

	       
	       //CONSTRUCTOR
	       public MOVIMIENTOS(String concepto, double cantidad, double saldo) {

	              this.concepto= concepto;
	              this.cantidad= cantidad;
	              this.saldo= saldo;
	              this.fecha= LocalDate.now();

	             }

	       //METODOS
	      @Override
	      public String toString() {

	      return "MOVIMIENTOS ---->\n"+fecha + " Concepto=" + concepto + ", Cantidad=" + cantidad + ", Saldo=" + saldo;

	      }

}

