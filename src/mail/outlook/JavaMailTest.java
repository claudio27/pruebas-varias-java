package mail.outlook;



import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMailTest {
    public static void main(String[] args) {
//        String host="host";  
//    	String host="correo2010.bice.local";
    	String host="10.101.1.150";
        final String user="cserrano_ex@bice.cl";//change accordingly  
        String to="claudioserrano2@gmail.com";//change accordingly  

        //Get the session object  
        Properties props = new Properties();  
        props.put("mail.smtp.host",host);  
        props.put("mail.smtp.auth", "false");
//        props.put("mail.smtp.starttls.enable","true");
        
        /*
        properties.setProperty("mail.smtp.submitter", authenticator.getPasswordAuthentication().getUserName());
        properties.setProperty("mail.smtp.auth", "true");

        properties.setProperty("mail.smtp.host", "Mail.server.url");
        properties.setProperty("mail.smtp.port", "25");
*/
        Session session=Session.getDefaultInstance(props, null);
        session.setDebug(true);

        //Compose the message  
        try {
            MimeMessage message = new MimeMessage(session);
            message.saveChanges();
            message.setFrom(new InternetAddress(user));  
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
            message.setSubject("Test mail");  
            message.setText("This is test mail.");  

            //send the message
            Transport.send(message);

            System.out.println("message sent successfully...");
        }
        catch (MessagingException e) {e.printStackTrace();}

    }
}
