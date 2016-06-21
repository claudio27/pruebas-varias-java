package com.cla;

import org.apache.log4j.Logger;


/***
 * Para agregar log4j.jar al paquete.
 * Click derecho sobre la carpeta del proyecto. 
 * 	Build Path -> Configure Build Path... -> Library -> Add External Jars
 * 	
 * Para generar el .jar final con las librerias incluidas.
 * Click derecho sobre la carpeta del proyecto. 
 * Export -> Runable JAR file.
 * 
 * */

public class RegistroMain {

	final static Logger logger = Logger.getLogger("RegistroMain.class");
	/**
	 * @param args
	 */
	public static void init() {
		
		RegistroMain obj = new RegistroMain();
		obj.runMe("cl");
	}
	
	
	private void runMe(String parameter){
		
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter); 
		}
		
		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
		
		
        // now show stderr stack trace going to logger
        try {
            throw new RuntimeException("Test");
        } catch (Exception e) {
        	logger.error("Un error : ",e);
//            e.printStackTrace();
        }
		
		
	}

}
