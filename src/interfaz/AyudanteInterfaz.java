package interfaz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

public class AyudanteInterfaz {
	
	
	 /**
	  * Devuelve el texto de la nota en la ruta pasada como argumento, ejemplo:
	  * "C:\Documentos\nota.txt"
	  * @param ruta - La ruta del archivo.
	  * @return - El texto dentro de la nota.
	  */
	public void leerTextoPorLinea(String ruta){
		
//		String texto = "";
		boolean fin = false;
//		StringBuffer sbf = new StringBuffer();
		File archivo = new File(ruta);
//		String nl = System.getProperty("line.separator");

		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(fr);

			while(fin == false){

				String linea = buffer.readLine();

				if(linea != null){
//					sbf.append(linea + nl);
					this.leeLineaInterfaz(linea);
//					texto += this.escribeReporte(linea);
					
				}
				else{
					fin = true;
				}
			}

//			this.escribirArchivo(texto);
//			texto = sbf.toString();

		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

//		return texto;
	}

	
	public void leeLineaInterfaz(String linea){
		
//		linea = "008795929500000000000000000000000140202680962016030220160408E000296000000000000000054300000000000000000000000000000000016100000000000000000000000000000544610000012432EAN SDPF MICHELE RAFFAELE SILVESTRO LANERI            AV EL GOLF DE MANQUEHUE 9750 CASA 614   000000000121      00370000000000005430000000000000000000000000000000126000020160302000000000000000000000000 SDPI AIDA DEL CARMEN ARCE LUCO                                                            000000000121      00350000000000008056900000000000000000000000000000338000020130114000000000000000000000000 SDPF MICHELE RAFFAELE SILVESTRO LANERI            AV EL GOLF DE MANQUEHUE 9750 CASA 614   000000000121      00370000000000005430000000000000000000000000000000126000020160302000000000000000000000000 SDPF MICHELE RAFFAELE SILVESTRO LANERI            AV EL GOLF DE MANQUEHUE 9750 CASA 614   000000000121      00300000000000005300000000000000000000000000000000123000020160302000000000000000000000000";
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println("********************************************************\n\n");
		
		System.out.println("dti.setWSNURUT1      	     " + linea.substring(0   ,9  ) );     
        System.out.println("dti.setWS_DVRUT1     	     "    +    linea.substring(9   ,10 ));                
        System.out.println("dti.setWS_NURUT2     	     "    +    linea.substring(10  ,19 )); 
        System.out.println("dti.setWS_DVRUT2     	     "    +    linea.substring(19  ,20 ));                
        System.out.println("dti.setWS_NPORTFOLIO 	     "    +    linea.substring(20  ,32 ));    
        System.out.println("dti.setWS_SUCUR      	     "    +    linea.substring(32  ,34 ));                
        System.out.println("dti.setWS_TIPDE      	     "    +    linea.substring(34  ,37 ));                
       
                        
        System.out.println( "dti.setWS_FEDEP             "  +  linea.substring(44  ,52 ));                
        System.out.println( "dti.setWS_FEVEN             "  +  linea.substring(52  ,60 ));                
        System.out.println( "dti.setWS_CUSTODIA          "  +  linea.substring(60  ,61 ));
        
        String tasa = linea.substring(61  ,68 );
        tasa = tasa.substring(0,3) + '.' + tasa.substring(3); 	                    
        
       	System.out.println("dti.setWS_TASA         	     " +  tasa);
        System.out.println("dti.setWS_PERIODO_TASA       " +  linea.substring(68  ,71 ));
        //Para moneda Euro
    
      	System.out.println("dti.setWS_MONEDA             " +linea.substring(71  ,75 ) ); 
    
        	                    
        String capnominal   = linea.substring(75  ,92 );
        capnominal          = capnominal.substring(0,13)+ '.' +capnominal.substring(13);
        System.out.println("dti.setWS_CAPNONIMAL  	     " +	(capnominal) );
        
        String capequival   = linea.substring(92  ,109);
        capequival          = capequival.substring(0,13)+ '.' +capequival.substring(13);
        System.out.println("dti.setWS_CAPEQUIVAL         " +	(capequival) );	                    
        
        String interes   = linea.substring(109 ,126);
        interes          = interes.substring(0,13)+ '.' +interes.substring(13);
        System.out.println("dti.setWS_INTERES            " +	(interes) );

        String reajustes   = linea.substring(126 ,143);
        reajustes          = reajustes.substring(0,13)+ '.' +reajustes.substring(13);
        System.out.println( "dti.setWS_REAJUSTES         " + (reajustes) );
        
        String monnomivcto   = linea.substring(143 ,160);
        monnomivcto          = monnomivcto.substring(0,13)+ '.' +monnomivcto.substring(13);
        
        System.out.println("dti.setWS_MONNOMIVCTO        "  +  monnomivcto);	                       
        System.out.println("dti.setWS_CAPTADOR           "  +  linea.substring(160 ,166));	                    
        System.out.println("dti.setWS_EVENTO             "  +  linea.substring(166 ,167));                
        System.out.println("dti.setWS_ESTADO             "  +  linea.substring(167 ,168));                
        System.out.println("dti.setWS_ONPDEP             "  +  linea.substring(168 ,169));                
        System.out.println("dti.setWS_57BIS              "  +  linea.substring(169 ,170));                
        System.out.println("dti.setWS_ESDEP              "  +  linea.substring(170 ,171));                
        System.out.println("dti.setWS_TIPODEP            "  +  linea.substring(171 ,175));
        System.out.println("dti.setWS_FOLIO              " +   	(linea.substring(32  ,44 ) ) );
        
        
        // String Folio = String.valueOf(Integer.valueOf(dti.getWS_SUCUR()).intValue()).toString();
        // Folio = Folio + dti.getWS_TIPDE().trim() + (registro.substring(37  ,44 )).trim();
        // dti.setWS_FOLIO (Folio);

        System.out.println( "dti.setWS_FOLIO             "  +   	(linea.substring(37  ,44 )) );
        
        System.out.println( "dti.setWS_NOMBR             " + linea.substring(175 ,220));                
        System.out.println( "dti.setWS_DIREC             " + linea.substring(220 ,260));                
        System.out.println( "dti.setWS_TELEF             " + linea.substring(260 ,268));    
        System.out.println( "dti.setWS_ORISEC            " + linea.substring(268 ,272));    
        System.out.println( "dti.setWS_MANDATO           " + linea.substring(272 ,274));                
        System.out.println( "dti.setWS_FMUT              " + linea.substring(274 ,278));  
        System.out.println( "dti.setWS_PLAZO             " + linea.substring(279 ,283));	                    
        //dti.setWS_cod_moneda  	(registro.substring(283 ,287));
        System.out.println( "dti.setWS_MTO_PESOS         "  + linea.substring(287 ,304) );
        

        
        String monto_reajuste_deven =linea.substring(303 ,319);
        String monto_interes_deven =linea.substring(319 ,335);
        
        monto_interes_deven = monto_interes_deven.substring(0,12)+ '.' +monto_interes_deven.substring(12);	                    
        
        
        monto_reajuste_deven = monto_reajuste_deven.substring(0,12)+ '.' +monto_reajuste_deven.substring(12);

        System.out.println( "dti.setWS_MTO_INT_DEVE      " + (monto_interes_deven) ) ;
        System.out.println( "dti.setWS_MTO_REA_DEVE      " + (monto_reajuste_deven) );        
        System.out.println( "dti.setWS_FEC_APERTURA_DEP  " + (linea.substring(335 ,343)) );
        System.out.println( "dti.setWS_FEC_PRE_PAGO      " + (linea.substring(343 ,351)) );
        System.out.println( "monto_pre_pago 			 " + linea.substring(351 ,367) );
        
		System.out.println("\n\n********************************************************");
		System.out.println("********************************************************");
		System.out.println("********************************************************\n\n");

        

	}

	
	 /**
	  * Lanza JFileChooser para manejar la selección de la ruta del archivo que vamos a leer.
	  */
	 public  void lanzarSelector() {
		 String ruta = "";

		 // Carpeta de inicio (opcional).
		 File carpetaInicio = new File(System.getProperty("user.home"));

		 // Selector de archivo (carpetaIncio opcional).
		 JFileChooser jfc = new JFileChooser(carpetaInicio.toString());

		 // Asignamos al atributo 'resultado' el valor de la selección del
		 // usuario:
		 int resultado = jfc.showOpenDialog(null);

		 // Le damos un título al dialogo (opcional)
		 jfc.setDialogTitle("Seleccione un archivo para leer: ");

		 // Si se ha seleccionado un archivo:
		 if (resultado == JFileChooser.APPROVE_OPTION) {

			 // Asignamos a 'ruta' la dirección de archivo seleccionado:
			 ruta = jfc.getSelectedFile().toString();

			 if (ruta != null) {
				 this.leerTextoPorLinea(ruta);
			 } else {
				 System.err.println("Selección nula");
			 }

		 }
	 }



	public String escribeReporte(String linea){
		
		String texto = "";
		String n = System.getProperty("line.separator");
		StringBuffer sbf = new StringBuffer();
		
        sbf.append("********************************************************" + n);
		sbf.append("********************************************************" + n);
		sbf.append("********************************************************\n\n" );
		
		sbf.append("dti.setWSNURUT1      	     " + linea.substring(0   ,9  ) + n);     
        sbf.append("dti.setWS_DVRUT1     	     "    +    linea.substring(9   ,10 ) + n);                
        sbf.append("dti.setWS_NURUT2     	     "    +    linea.substring(10  ,19 ) + n); 
        sbf.append("dti.setWS_DVRUT2     	     "    +    linea.substring(19  ,20 ) + n);                
        sbf.append("dti.setWS_NPORTFOLIO 	     "    +    linea.substring(20  ,32 ) + n);    
        sbf.append("dti.setWS_SUCUR      	     "    +    linea.substring(32  ,34 ) + n);                
        sbf.append("dti.setWS_TIPDE      	     "    +    linea.substring(34  ,37 ) + n);                
       
                        
        sbf.append( "dti.setWS_FEDEP             "  +  linea.substring(44  ,52 ) + n);                
        sbf.append( "dti.setWS_FEVEN             "  +  linea.substring(52  ,60 ) + n);                
        sbf.append( "dti.setWS_CUSTODIA          "  +  linea.substring(60  ,61 ) + n);
        
        String tasa = linea.substring(61  ,68 );
        tasa = tasa.substring(0,3) + '.' + tasa.substring(3); 	                    
        
       	sbf.append("dti.setWS_TASA         	     " +  tasa + n);
        sbf.append("dti.setWS_PERIODO_TASA       " +  linea.substring(68  ,71 ) + n);
        //Para moneda Euro
    
      	sbf.append("dti.setWS_MONEDA             " +linea.substring(71  ,75 ) + n); 
    
        	                    
        String capnominal   = linea.substring(75  ,92 );
        capnominal          = capnominal.substring(0,13)+ '.' +capnominal.substring(13);
        sbf.append("dti.setWS_CAPNONIMAL  	     " +	(capnominal) + n);
        
        String capequival   = linea.substring(92  ,109);
        capequival          = capequival.substring(0,13)+ '.' +capequival.substring(13);
        sbf.append("dti.setWS_CAPEQUIVAL         " +	(capequival) + n);	                    
        
        String interes   = linea.substring(109 ,126);
        interes          = interes.substring(0,13)+ '.' +interes.substring(13);
        sbf.append("dti.setWS_INTERES            " +	(interes) + n);

        String reajustes   = linea.substring(126 ,143);
        reajustes          = reajustes.substring(0,13)+ '.' +reajustes.substring(13);
        sbf.append( "dti.setWS_REAJUSTES         " + (reajustes) + n);
        
        String monnomivcto   = linea.substring(143 ,160);
        monnomivcto          = monnomivcto.substring(0,13)+ '.' +monnomivcto.substring(13);
        
        sbf.append("dti.setWS_MONNOMIVCTO        "  +  monnomivcto + n);	                       
        sbf.append("dti.setWS_CAPTADOR           "  +  linea.substring(160 ,166) + n);	                    
        sbf.append("dti.setWS_EVENTO             "  +  linea.substring(166 ,167) + n);                
        sbf.append("dti.setWS_ESTADO             "  +  linea.substring(167 ,168) + n);                
        sbf.append("dti.setWS_ONPDEP             "  +  linea.substring(168 ,169) + n);                
        sbf.append("dti.setWS_57BIS              "  +  linea.substring(169 ,170) + n);                
        sbf.append("dti.setWS_ESDEP              "  +  linea.substring(170 ,171) + n);                
        sbf.append("dti.setWS_TIPODEP            "  +  linea.substring(171 ,175) + n);
        sbf.append("dti.setWS_FOLIO              "  + (linea.substring(32  ,44 ) ) + n );
        
        
        // String Folio = String.valueOf(Integer.valueOf(dti.getWS_SUCUR()).intValue()).toString();
        // Folio = Folio + dti.getWS_TIPDE().trim() + (registro.substring(37  ,44 )).trim();
        // dti.setWS_FOLIO (Folio);

        sbf.append( "dti.setWS_FOLIO             "  + (linea.substring(37  ,44 )) + n);
        
        sbf.append( "dti.setWS_NOMBR             " + linea.substring(175 ,220) + n);                
        sbf.append( "dti.setWS_DIREC             " + linea.substring(220 ,260) + n);                
        sbf.append( "dti.setWS_TELEF             " + linea.substring(260 ,268) + n);    
        sbf.append( "dti.setWS_ORISEC            " + linea.substring(268 ,272) + n);    
        sbf.append( "dti.setWS_MANDATO           " + linea.substring(272 ,274) + n);                
        sbf.append( "dti.setWS_FMUT              " + linea.substring(274 ,278) + n);  
        sbf.append( "dti.setWS_PLAZO             " + linea.substring(279 ,283) + n);	                    
        //dti.setWS_cod_moneda  	(registro.substring(283 ,287));
        sbf.append( "dti.setWS_MTO_PESOS         "  + linea.substring(287 ,304) + n);
        

        
        String monto_reajuste_deven =linea.substring(303 ,319);
        String monto_interes_deven =linea.substring(319 ,335);
        
        monto_interes_deven = monto_interes_deven.substring(0,12)+ '.' +monto_interes_deven.substring(12);	                    
        
        
        monto_reajuste_deven = monto_reajuste_deven.substring(0,12)+ '.' +monto_reajuste_deven.substring(12);

        sbf.append( "dti.setWS_MTO_INT_DEVE      " + (monto_interes_deven) + n) ;
        sbf.append( "dti.setWS_MTO_REA_DEVE      " + (monto_reajuste_deven) + n);        
        sbf.append( "dti.setWS_FEC_APERTURA_DEP  " + (linea.substring(335 ,343)) + n);
        sbf.append( "dti.setWS_FEC_PRE_PAGO      " + (linea.substring(343 ,351)) + n);
        sbf.append( "monto_pre_pago 			 " + linea.substring(351 ,367) + n);
        
		sbf.append("\n\n********************************************************" + n);
		sbf.append("********************************************************" + n);
		sbf.append("********************************************************\n\n");

		
		texto = sbf.toString();
		return texto;
		
	}
	

	 public void escribirArchivo(String texto){
		 FileWriter fichero = null;
	        PrintWriter pw = null;
	        try
	        {
	            fichero = new FileWriter("Reporte_Interfaz.txt");	            
	            pw = new PrintWriter(fichero);

	            System.out.println("Escribiendo archivo...");
	            
	            pw.print(texto);

	            System.out.println("Listo");
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           // Nuevamente aprovechamos el finally para 
	           // asegurarnos que se cierra el fichero.
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
	 }

	
	}
