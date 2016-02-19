package mail.correo.banco;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Main obj = new Main();
		obj.sendEmailClienteCredito(path, nameFile, contrato, anexo, emailCliente, montoLiqCred);
	}
	
	public String sendEmailClienteCredito(String path, String nameFile, String contrato, String anexo, String emailCliente, int montoLiqCred) throws Exception {

        String resultado = "";
        
		nameFile =  nameFile.substring(0,nameFile.length()-4) + "_firmado.pdf";
		
		if (!contrato.equals(""))
			contrato =  contrato.substring(0,contrato.length()-4) + ".pdf";
		
		if (!anexo.equals(""))
			anexo =  anexo.substring(0,anexo.length()-4) + ".pdf";
		
		Logged.info("SimuladorCredConsumoManager.sendEmailClienteCredito - emailCliente:["+emailCliente+"]");
		UtilCredito util = new UtilCredito();
		String subject = "";
		String body = "";
		boolean envioOK = false;
		int y = 0;
		String[ ] files = new String[3];

        try
        {
			subject = this.getParametroMailCliente(1, montoLiqCred);
			body    = this.getParametroMailCliente(2, montoLiqCred);
			if (emailCliente.equals("")) {
				resultado = "NO_REGISTRA_EMAIL";
			}
			else {
				if (util.isEmailValido(emailCliente) ) {
					MailCredito mail = new MailCredito();
					mail.setPath(path);
					
					if (!nameFile.equals(""))
						files[y] = nameFile;y++;
					if (!contrato.equals(""))
						files[y] = contrato;y++;
					if (!anexo.equals(""))
						files[y] = anexo;
					
					mail.setFiles(files);
					
					String mailFrom = TurbineResources.getString("smtp.mail.from", "");
					String mailTo 	= emailCliente;		
					String mailHost	= TurbineResources.getString("smtp.mail.host", "");
					
			        mail.setFrom(mailFrom);
			        mail.setTo(mailTo);
					mail.setMensaje(body);
			        mail.setMailhost(mailHost);
			        mail.setAsunto(subject);		
					envioOK = mail.EnvioMailAdjunto();
					Logged.info("SimuladorCredConsumoManager.sendEmailClienteCredito() envioOK:["+envioOK+"]");
					if (envioOK) 
						resultado = "OK";
					else
						resultado = "ERROR_ENVIO";
				}
				else {
					resultado = "EMAIL_INCORRECTO";
				}
			}			
			
  		}
  		catch(Exception e)
  		{
			if (e.getMessage().length() > 200) {
				resultado = e.getMessage().substring(0,200);
			}
			else {
				resultado = e.getMessage();
			}
  			Logged.error("SimuladorCredConsumoManager.sendEmailClienteCredito() : fallo al enviar correo ="+ e.getMessage());       
  		}
		
		return resultado;
    }
	//-------------------------------------------------------------------------------------------------------------------------

	

}
