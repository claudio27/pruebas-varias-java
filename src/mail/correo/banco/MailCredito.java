package mail.correo.banco;

package com.bice.scc.modules.util;


import java.util.Properties;
import java.util.Vector;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.turbine.util.mail.SimpleEmail;

import com.sonda.bancos.logging.Logged;

	public class MailCredito {
	    private String path;
	    private String from;
	    private String to;
	    //private String cc;
	    private String mailhost;
	    private String asunto;
	    private String filename;	    
	    private String[ ] files = new String[3];
	    private String mensaje;

		public MailCredito() {
	    }


	    public boolean EnvioMailAdjunto() throws AddressException, MessagingException{
	        new MailCredito();
	        boolean OK = false;

	        Properties props = System.getProperties();
	        try{
	            // Setup mail server
	            props.put("mail.smtp.host", getMailhost());

	            // Get session
	            Session session = Session.getInstance(props, null);

	            // Define message
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(getFrom()));
	            message.addRecipient(Message.RecipientType.TO, 
	                    new InternetAddress(getTo()));
				/*
	            message.addRecipient(Message.RecipientType.CC, 
	                    new InternetAddress(getCc()));
	            */
	            message.setSubject(getAsunto());

	            // Create the message part 
	            BodyPart messageBodyPart = new MimeBodyPart();

	            // Fill the message
	            messageBodyPart.setText(getMensaje());

	            // Create a Multipart
	            Multipart multipart = new MimeMultipart();

	            // Add part one
	            multipart.addBodyPart(messageBodyPart);

	            //
	            // Part two is attachment
	            //
	            // Get the attachment
	            //DataSource source = new FileDataSource(getPath()+getFilename());
	            
	                       
	            
	            for (int x=0; x < getFiles().length; x++){
	            	String namefile = getFiles()[x].toString(); 	
	            
	            	Logged.info("Nombre File : "+getPath()+namefile + ", Posicion: "+x);
	            	addAttachment (multipart, getPath(), namefile);
	            	
	            }

	            // Put parts in message
	            message.setContent(multipart);

	            // Send the message
	            Transport.send(message);
	            OK=true;
	        }catch(Exception e){
	            OK=false;
	            System.out.println("Error "+e);
				Logged.info("MailCredito.EnvioMailAdjunto - Error al enviar correo:"+e.getMessage());
	        }
	        return OK;
	    }
	    
	    private static void addAttachment(Multipart multipart, String path, String filename)
	    {
	        DataSource source = new FileDataSource(path+filename);
	        BodyPart messageBodyPart = new MimeBodyPart();        
	        try {
				messageBodyPart.setDataHandler(new DataHandler(source));
		        messageBodyPart.setFileName(filename);
		        multipart.addBodyPart(messageBodyPart);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    
	    
	    public boolean EnvioMail() throws AddressException, MessagingException{
	        new MailCredito();
	        boolean OK = false;

	        Properties props = System.getProperties();
	        try{
	            // Setup mail server
	            props.put("mail.smtp.host", getMailhost());

	            // Get session
	            Session session = Session.getInstance(props, null);

	            // Define message
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(getFrom()));
	            message.addRecipient(Message.RecipientType.TO, 
	                    new InternetAddress(getTo()));
				
	            //message.addRecipient(Message.RecipientType.CC, 
	            //        new InternetAddress(getCc()));
	            message.setSubject(getAsunto());

	            // Create the message part 
	            BodyPart messageBodyPart = new MimeBodyPart();

	            // Fill the message
	            messageBodyPart.setText(getMensaje());

	            // Create a Multipart
	            Multipart multipart = new MimeMultipart();

	            // Add part one
	            multipart.addBodyPart(messageBodyPart);

	            // Put parts in message
	            message.setContent(multipart);

	            // Send the message
	            Transport.send(message);
	            OK=true;
	        }catch(Exception e){
	            OK=false;
	            System.out.println("Error "+e);
	        }
	        return OK;
	    }
	    
	    
	    public void sendMailGenerico(String fromMail, String mailCc, String mailTo, String subject, String msgEmail){
	    	
	    	SimpleEmail email = null;
	    	
	    	try{
	    		
	    		Logged.info("MailCredito.sendMailGenerico Parametros : fromMail: "+fromMail+" mailCc:"+mailCc+" mailTo:"+mailTo);
	    		
	    		if(fromMail != null && mailTo != null && subject != null && msgEmail != null){
	    			
	    			if(fromMail.equals("")){    			
	    				fromMail = "portal@bice.cl";
	    			}
	    			
	    			String nameFrom = "Portal Internet";
	    			
	    			//Contenido MAIL
	    			email = new SimpleEmail();
	    			email.addTo(mailTo, ""); //  Mail To
	    			
	    			if(mailCc != null && !mailCc.equals("")){
	    				email.addCc(mailCc, ""); //  Mail To	
	    			}	    			
	    			
	    	        email.setFrom(fromMail, nameFrom); // Mail From
	    	        email.setSubject(subject); // Subject
	    	        email.setMsg(msgEmail); // Message Body
	    	        email.send();	// Send	
	    		
	    		}else{
	    			Logged.error("SimuladorCredConsumoManager.sendMailGenerico : NO UN PARAMETRO");
	    			return;
	    		}
	    		
	    	}catch(MessagingException ex){
	    		Logged.info("SimuladorCredConsumoManager.sendMailGenerico ERROR : "+ex.getMessage());
	    	}
	    	
	    }


	    /**
	     * @return the path
	     */
	    public String getPath() {
	        return path;
	    }


	    /**
	     * @param path the path to set
	     */
	    public void setPath(String path) {
	        this.path = path;
	    }


	    /**
	     * @return the from
	     */
	    public String getFrom() {
	        return from;
	    }


	    /**
	     * @param from the from to set
	     */
	    public void setFrom(String from) {
	        this.from = from;
	    }


	    /**
	     * @return the to
	     */
	    public String getTo() {
	        return to;
	    }


	    /**
	     * @param to the to to set
	     */
	    public void setTo(String to) {
	        this.to = to;
	    }


	    /**
	     * @return the mailhost
	     */
	    public String getMailhost() {
	        return mailhost;
	    }


	    /**
	     * @param mailhost the mailhost to set
	     */
	    public void setMailhost(String mailhost) {
	        this.mailhost = mailhost;
	    }


	    /**
	     * @return the asunto
	     */
	    public String getAsunto() {
	        return asunto;
	    }


	    /**
	     * @param asunto the asunto to set
	     */
	    public void setAsunto(String asunto) {
	        this.asunto = asunto;
	    }


	    /**
	     * @return the filename
	     */
	    public String getFilename() {
	        return filename;
	    }


	    /**
	     * @param filename the filename to set
	     */
	    public void setFilename(String filename) {
	        this.filename = filename;
	    }


	    /**
	     * @return the mensaje
	     */
	    public String getMensaje() {
	        return mensaje;
	    }


	    /**
	     * @param mensaje the mensaje to set
	     */
	    public void setMensaje(String mensaje) {
	        this.mensaje = mensaje;
	    }


	    // For attached files
		public String[] getFiles() {
			return files;
		}


		public void setFiles(String[] files) {
			this.files = files;
		}


	    /**
	     * @return the cc
	     */
		/*
	    public String getCc() {
	        return cc;
	    }
	    */


	    /**
	     * @param cc the cc to set
	     */
		/*
	    public void setCc(String cc) {
	        this.cc = cc;
	    }
	    */

	    

}

