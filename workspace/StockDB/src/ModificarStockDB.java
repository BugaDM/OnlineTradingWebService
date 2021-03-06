import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ModificarStockDB {
	
	private final static Logger logger = Logger.getLogger(ModificarStockDB.class);
	
	public static void main(String[] args){
		String[] stock = VerElementos();
		for(int i=0 ; i<stock.length ; i++){
			System.out.println(stock[i]);
		}
	}

	public static boolean AnadirElemento(String marca, String modelo, int precio) {
		PropertyConfigurator.configure("log4j.properties");
		logger.info(">AņadirElemento");
		Connection conexion = null;
		String url = "jdbc:mysql://localhost/ast";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(url, "Sergio", "cambiala");
			Statement s = conexion.createStatement();
			
			s.executeUpdate("INSERT INTO stock(marca,modelo,precio) VALUES('"+marca+"','"+modelo+"',"+precio+");");
			
		} catch (Exception e) {
			System.err.print("Error: No existe o no se pudo gestionar la BD");
			try {
				conexion.close();
				return false;
			} catch (SQLException e1) {
				System.err.print("Error: No se pudo cerrar la conexion");
				return false;
			} catch (Exception e2) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	public static boolean BorrarElemento(int id_elemento, int monedero) throws SQLException {
		Connection conexion = null;
		String url = "jdbc:mysql://localhost/ast";

		PropertyConfigurator.configure("log4j.properties");
		logger.info(">BorrarElemento");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(url, "Sergio", "cambiala");
			Statement s = conexion.createStatement();
			conexion.setAutoCommit(false);
			
			ResultSet result = s.executeQuery("SELECT Precio FROM stock WHERE ID_elemento="+id_elemento+";");
			int precio=0;
			if(result.next()) precio=result.getInt(1);

			conexion.setAutoCommit(false);
			s.executeUpdate("DELETE FROM stock WHERE ID_elemento="+ id_elemento + ";");

			if(precio>monedero) throw new Exception();

			conexion.commit();

			conexion.setAutoCommit(true);

		} catch (Exception e) {
			System.err.print("Error: No existe o no se pudo gestionar la BD");
			e.printStackTrace();
			conexion.rollback();
			conexion.setAutoCommit(true);
			try {
				conexion.close();
				return false;
			} catch (SQLException e1) {
				System.err.print("Error: No se pudo cerrar la conexion");
				return false;
			} catch (Exception e2) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	public static String[] VerElementos() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info(">VerElementos");
		
		Connection conexion = null;
		String url = "jdbc:mysql://localhost/ast";
		List<String[]> lista = new ArrayList<String[]>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(url, "Sergio", "cambiala");
			Statement s = conexion.createStatement();
			int num=0;
			ResultSet result = s.executeQuery("select * from stock;");
			while(result.next()){
  	     		 String[] elemento ={Integer.toString(result.getInt(1)),result.getString(2),result.getString(3),Integer.toString(result.getInt(4))}; 
  	     		 lista.add(elemento);
			}
			
			if(lista.size()>0){
				String[] retorno = new String[lista.size()];
				for(int i=0 ; i<lista.size() ; i++){
					String[] elemento = lista.get(i);
					retorno[i]="[ID: "+elemento[0]+" | Marca: "+elemento[1]+" | Modelo: "+elemento[2]+" | Precio: "+elemento[3]+"]";
				}
				return retorno;
			}else{
				String[] retorno = {"[empty set]"};
				return retorno;
			}
				
		} catch (Exception e) {
			System.err.print("Error: No existe o no se pudo gestionar la BD");
			try {
				conexion.close();
				String[] retorno={"[empty set]"};
				
				return retorno;
			} catch (SQLException e1) {
				System.err.print("Error: No se pudo cerrar la conexion");
				String[] retorno={"[empty set]"};
				
				return retorno;
			} catch (Exception e2) {
				e.printStackTrace();
				String[] retorno={"[empty set]"};
				
				return retorno;
			}
		}
	}
}
