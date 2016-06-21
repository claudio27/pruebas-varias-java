package formato.numeros;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatoNumerosMain {

	public static void ejemploFormatoNumeros() {
		
		double datos = 10023.9332432;
		DecimalFormat decimalFormat ;
		NumberFormat formato = NumberFormat.getNumberInstance(new Locale("es","CL"));
		
        decimalFormat = (DecimalFormat)formato;
        decimalFormat.applyPattern("####,####,###,###.####");
        
        System.out.println(decimalFormat.format(datos));
        ;


	}

}
