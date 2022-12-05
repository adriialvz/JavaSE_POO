package MOVIMIENTOS_Y_CUENTABANCARIA;


	import java.util.ArrayList;

	
	public class CUENTA_BANCARIA {

		  //PROPIEDADES
	      private int numeroCuenta;
	      private String cliente;
	      private double saldo;
	      private ArrayList <MOVIMIENTOS> movimientos;

	      
	      //CONSTRUCTOR
	      public CUENTA_BANCARIA(int numeroCuenta, String cliente) {

	             this.numeroCuenta= numeroCuenta;
	             this.cliente= cliente;
	             this.saldo= 0;
	             this.movimientos= new ArrayList();

	               }

	      //METODOS
	       public void agregarMovimiento(String concepto, double cantidad) throws NUMEROS_ROJOS_EXCEPTION {
	              saldo= saldo + cantidad;
	              if(saldo>0) {
	            	  movimientos.add(new MOVIMIENTOS(concepto, cantidad, saldo));
	              } else if (saldo < 0) {
	            	  movimientos.add(new MOVIMIENTOS(concepto, cantidad, saldo));
	            	  throw new NUMEROS_ROJOS_EXCEPTION(saldo);
	            	
	             }
	       }
	       
	      @Override
	      public String toString() {

	      return "Número=" + numeroCuenta + ", Cliente=" + cliente + ", Saldo=" + saldo;

	      }

	      
	      
	      public String listarMovimientos() {

	            String listado= "";

	            for (MOVIMIENTOS mov : movimientos) {

	                    listado= listado + mov.toString()+"\n";

	                }                          

	                 return listado;

	      }
	}
