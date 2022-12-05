package _06_SALUDAR_NEW_1_;

public class EXCEPTION888 extends Exception{

		private static final long serialVersionUID= 1L;
		private int num;
		
		
		public EXCEPTION888(){
			super("Ha ocurrido una exception de prueba");
			num= 25;
		}
		
		
		public int getNum() {
			return num;
		}
		
}
