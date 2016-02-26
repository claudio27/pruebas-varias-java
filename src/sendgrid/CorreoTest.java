package sendgrid;
import java.util.Date;

import com.sendgrid.*;


public class CorreoTest {

	
	public static void main(String[] args) {

/*		if(null == ""){
			System.out.println("son inguales");
		} else{
			System.out.println("no");
		}*/
		
//		 System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		
//		 System.out.println(1.0/0.0);
		
		 SendGrid sendgrid = new SendGrid("cladev", "e3w2q1q1w2e3");

		    SendGrid.Email email = new SendGrid.Email();
//		    email.addTo("cserrano_ex@bice.cl");
		    email.addTo("juan.delgado@bice.cl");
		    email.setFrom("no-responder@plataforma_captaciones.com");
		    email.setSubject("Platarforma captaciones ");
		    email.setText("Tiene una solicitud de aprobación pendiente");
		    
//		    for(int i = 0; i < 1; i++){
		    	try {
		    		SendGrid.Response response = sendgrid.send(email);
//		    		System.out.println(response.getMessage() + " : " + i);
		    		System.out.println(response.getMessage() );
		    	}
		    	catch (SendGridException e) {
		    		System.err.println(e);
		    	}
//		    }
			System.out.println("Hecho");
			System.out.println(new Date());
	}

}
