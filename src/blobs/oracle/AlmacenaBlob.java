package blobs.oracle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracletest.ConexionBd;

public class AlmacenaBlob {
	Connection conexion = null;
	
	
	public AlmacenaBlob() {
		ConexionBd obj = new ConexionBd();
		conexion = obj.getConexion();
	}
	
	public void guardaArchivoBd() throws SQLException, IOException{
		conexion.setAutoCommit(false);

//	    String sql = "INSERT INTO pictures (name, description, image) VALUES (?, ?, ?)";
		String sql = "insert into a_pruebas_archivos (id, nombre_archivo, tipo, archivo)"
				+ " values(?, ?, ?, ?)";
		
	    PreparedStatement stmt = conexion.prepareStatement(sql);
	    stmt.setInt(1, 1);
	    stmt.setString(2, "algo.pdf");
	    stmt.setString(3, "pdf");

	    File archivo = new File("D:\\JEETT.pdf");
	    
	    FileInputStream   fis = new FileInputStream(archivo);
	    stmt.setBinaryStream(4, fis, (int) archivo.length());
	    stmt.execute();

	    conexion.commit();
	    fis.close();
	    conexion.close();
	    
	    System.out.println("Archivo guardado con exito");
	    System.out.println(archivo.getParent());
	    System.out.println(archivo.getPath());
	    System.out.println(archivo.getName());
	    System.out.println(archivo.getAbsolutePath());
	    System.out.println(archivo.getCanonicalPath());
	    
	    if(archivo.delete()){
	    	System.out.println("Archivo borrado con exito " + archivo.getPath());
	    }
		
	}
	
	
	public void recuperaArchivoBD() throws SQLException, IOException{
//	    String sql = "SELECT name, description, image FROM pictures ";
		
		String sql = "select id , nombre_archivo , tipo, archivo from a_pruebas_archivos";
	    PreparedStatement stmt = conexion.prepareStatement(sql);
	    ResultSet resultSet = stmt.executeQuery();
	    int cont = 0;

	    while (resultSet.next()) {
	      String id = resultSet.getString(1);
	      String nombreArchivo = resultSet.getString(2);
	      String tipo = resultSet.getString(3);
	      
	      File archivo = new File("D:\\java"+cont+".pdf");
	      FileOutputStream fos = new FileOutputStream(archivo);

	      byte[] buffer = new byte[1];
	      InputStream is = resultSet.getBinaryStream(4);
	      while (is.read(buffer) > 0) {
	        fos.write(buffer);
	      }
	      fos.close();
	      cont++;
	      
	      System.out.println(id +", "+ nombreArchivo +", "+ tipo +", "+ archivo.getPath());
	      
	    }
	    conexion.close();
	}

}
