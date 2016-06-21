import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ReestablecerUsersDB {

    public static void main(String[] args) throws ClassNotFoundException {
   	 
   	 Connection conexion=null;
   	 
   	 //Seleccionamos la Base de Datos
   	 String url="jdbc:mysql://localhost/ast";
   	 try{
        	//Comprobamos que tenemos la libreria
        	Class.forName("com.mysql.jdbc.Driver");
        	//Establecemos la conexion(ruta,user,pass)
        	conexion= DriverManager.getConnection(url,"Sergio","cambiala");       	 
        	//Instanciamos la clase para ejecutar las sentencias
        	Statement s = conexion.createStatement();
        	//Borramos las tablas en caso de que ya existan
        	s.executeUpdate("DROP TABLE IF EXISTS Users");
        	//Creamos las tablas
        	s.executeUpdate("CREATE TABLE Users ("+
                	"ID_user int(15) NOT NULL AUTO_INCREMENT,"+
                	"Nombre varchar(255) NOT NULL,"+
                	"Monedero int(15),"+
                	"Preferencias int(15),"+
                	"PRIMARY KEY (ID_user)"+
                	") ENGINE=InnoDB DEFAULT CHARSET=utf8");
        	s.executeUpdate("ALTER TABLE stock AUTO_INCREMENT = 1 ");
   	 }catch (SQLException e){
        	System.err.print("Error: No existe o no se pudo gestionar la BD");
    	}finally{
        	try {
            	//Cerramos la conexion
            	conexion.close();
        	} catch (SQLException e) {
            	System.err.print("Error: No se pudo cerrar la conexion");
        	} catch(Exception e){
       		 e.printStackTrace();
        	}
    	}
    }
}