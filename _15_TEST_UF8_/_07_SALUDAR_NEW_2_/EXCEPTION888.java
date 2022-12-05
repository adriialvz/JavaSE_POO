package _07_SALUDAR_NEW_2_;

import java.time.LocalDateTime;

public class EXCEPTION888 extends Exception {

	private static final long serialVersionUID = 1L;
	
	public EXCEPTION888() {
		super("Ha ocurrido una excepcino de prueba "+ LocalDateTime.now());
	}
	
}
