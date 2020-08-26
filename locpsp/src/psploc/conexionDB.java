package psploc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionDB {
	
	//Se carga el Driver de MYSQL-JDBC
		//Se conecta a la base de datos existente
		//Se autentica el usario en la base de datos
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    private static final String DB = "jdbc:mysql://localhost:3306/PSP";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";

    public Connection conectar() {
        Connection conexion = null;
        
        try {
            Class.forName(CONTROLADOR);
            conexion = DriverManager.getConnection(DB, USUARIO, CLAVE);
            System.out.println("Conexión OK");

        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
        }
        
        return conexion;
    }

    public static void main(String[] args) {

    }


}
