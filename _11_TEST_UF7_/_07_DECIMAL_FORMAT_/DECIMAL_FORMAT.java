package _07_DECIMAL_FORMAT_;

import java.text.DecimalFormat;

public class DECIMAL_FORMAT {

	public static void main(String[] args) {
		
		DecimalFormat df= new DecimalFormat("000000");
		System.out.println(df.format(25));

	}

}
