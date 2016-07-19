package oracletest;

import java.sql.*;

/**
 * Para probar los sp, sin la necesidad de tener levantar toda la aplicacion
 * 
 *  - Donde esta el archivo TNSNAMES ----> D:\10g\NETWORK\ADMIN\tnsnames.ora
 *  - Donde esta el driver que se necesita agregar al proyecto 
 *   en %ORACLE_HOME%/jdbc/lib/* (classes12.jar) (implementacion de oracle)
 *   
 *   Equipo actual:
 *   
 *   D:\10g\jdbc\lib\classes12.jar
 *   
 *   Comando util, para listar :
 *   
 *   D:\10g\jdbc\lib>dir /s/b
 *
 *   - Como incluir en el proyecto 
 *   <click-der> [Carpeta del proyecto] <Properties> <Java Build Path> <Libraries> <Add External Jars>
 *   <Buscar el jar ...>
 *   
 *   Voila!
 *   
 *   
 * */

public class ConexionBd {
	
	private static final String driverMachine = "jdbc:oracle:thin:@10.110.1.54:1522:orawpor";
	private static final String userId = "CAP_ADMIN";
	private static final String password = "CAP_ADMIN";
	private Connection conn = null;
	
	public ConexionBd() {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

			// driver@machineName:port:SID, userid, password
			conn = DriverManager.getConnection(driverMachine, userId, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Usar en ambiente estatico, para crear la conexion y realizar una consulta basica.
	 * @throws SQLException
	 */
	public void init() throws SQLException {
		
		DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		
		// driver@machineName:port:SID,  userid,  password
	     conn = DriverManager.getConnection(driverMachine, userId, password);
	    
	    
	    consultaBasica(conn);

	  }
	
	public static void consultaBasica(Connection conn) throws SQLException {

		Statement stmt = conn.createStatement();
		ResultSet rset =
		// stmt.executeQuery("select BANNER from SYS.V_$VERSION");
		stmt.executeQuery("select * from tbl_det_deposito");
		// stmt.executeQuery("{call CAP_SP_CON_MANDATO }");

		while (rset.next())
			System.out.println(rset.getString("num_folio") + " "
					+ rset.getString("rut1")); // Print col 1
		stmt.close();

	}
	
	public Connection getConexion(){
		return conn;
	}

	

}
