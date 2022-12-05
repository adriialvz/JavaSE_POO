package _08_DATE_;

import java.time.LocalDate; 
import java.time.format.DateTimeFormatter;

public class DATE {

	public static void main(String[] args) {
		
		
		LocalDate hoy= LocalDate.of(2018, 03, 04);
		
		String texto= hoy.format(DateTimeFormatter.ofPattern("EEEE dd 'de' MMMM 'de' YYYY"));
		
		System.out.println(texto);

	}

}
