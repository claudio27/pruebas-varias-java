package ejecutar.procedimiento.almacenado;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

public class EjecutaProcedimientoAlmacenado {

	
	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@10.110.1.54:1522:orawpor";
	private static final String DB_USER = "CAP_ADMIN";
	private static final String DB_PASSWORD = "CAP_ADMIN";

	public static void init() {

		try {

			callOracleStoredProcCURSORParameter();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	private static void callOracleStoredProcCURSORParameter()
			throws SQLException {

		Connection dbConnection = null;
		CallableStatement callableStatement = null;
		ResultSet rs = null;

		String getDBUSERCursorSql = "{call getDBUSERCursor(?,?)}";

		try {
			dbConnection = getDBConnection();
			callableStatement = dbConnection.prepareCall(getDBUSERCursorSql);

			callableStatement.setString(1, "claudio");
			callableStatement.registerOutParameter(2, OracleTypes.CURSOR);

			// execute getDBUSERCursor store procedure
			callableStatement.executeUpdate();

			// get cursor and cast it to ResultSet
			rs = (ResultSet) callableStatement.getObject(2);

			while (rs.next()) {
				String userName = rs.getString("USERNAME");
				String tipo = rs.getString("TIPO");
				String fecha = rs.getString("FECHA");

				System.out.println("userName : " + userName);
				System.out.println("tipo : " + tipo);
				System.out.println("fecha : " + fecha);
				System.out.println();
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (rs != null) {
				rs.close();
			}

			if (callableStatement != null) {
				callableStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER); // Create to the heap, Oracle driver on D:\10g\jdbc\lib\classes12.jar

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}
	
}
