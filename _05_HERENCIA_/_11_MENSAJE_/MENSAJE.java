package _11_MENSAJE_;

public class MENSAJE {

	public static void main(String[] args) {
		
		 char a = '8';

         int b = 8;

         System.out.println(entregarMensaje(a));

         System.out.println(entregarMensaje(b));
	}
	
	 public static String entregarMensaje(char x) {

         	return "Good Day!";

	 }

	 public static String entregarMensaje(int x) {

             return "Good Luck!";

	 }

}
