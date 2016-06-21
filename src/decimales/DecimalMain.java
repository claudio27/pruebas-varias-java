package decimales;

import java.text.DecimalFormat;

public class DecimalMain {

	/**
	 * @param args
	 */
	public static void init() {

		double a = 1.23546451164654;
		DecimalFormat df = new DecimalFormat("#.##");
		DecimalFormat df4 = new DecimalFormat("#.####");
		
		String format1 = df.format(a);
		String format2 = df4.format(a);
		
		double b = Double.valueOf(format1);
		double c = Double.valueOf(format2);
		
		
		
		System.out.println(a);
		System.out.println(format1);
		System.out.println(format2);
		System.out.println(b); // Fijarse que redondea
		System.out.println(c); // Fijarse que redondea , ver método rint
		Math.rint(12.321212);
	}

}
