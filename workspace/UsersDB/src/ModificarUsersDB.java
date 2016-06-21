import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModificarUsersDB {
	public static boolean AnadirUser(String nombre, int monedero, int preferencias) {
		Connection conexion = null;
		String url = "jdbc:mysql://localhost/ast";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(url, "Sergio", "cambiala");
			Statement s = conexion.createStatement();
			
			s.executeUpdate("INSERT INTO users(nombre,monedero,preferencias) VALUES('"+nombre+"',"+monedero+","+preferencias+");");
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

	public static boolean BorrarUser(int id) {
		Connection conexion = null;
		String url = "jdbc:mysql://localhost/ast";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(url, "Sergio", "cambiala");
			Statement s = conexion.createStatement();
			
			s.executeUpdate("DELETE FROM users WHERE ID_user="
					 + id + ";");
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

	public static String[] VerUsers() {
		Connection conexion = null;
		String url = "jdbc:mysql://localhost/ast";
		List<String[]> lista = new ArrayList<String[]>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(url, "Sergio", "cambiala");
			Statement s = conexion.createStatement();
			
			ResultSet result = s.executeQuery("select * from users;");
			while(result.next()){
  	     		 String[] user ={Integer.toString(result.getInt(1)),result.getString(2),Integer.toString(result.getInt(3)),Integer.toString(result.getInt(4))}; 
  	     		 lista.add(user);
			}

			if(lista.size()>0){
				String[] retorno = new String[lista.size()];
				for(int i=0 ; i<lista.size() ; i++){
					String[] elemento = lista.get(i);
					
					if(elemento[3].equals("1")) elemento[3]="USD";
					else elemento[3]="EUR";
					
					retorno[i]="[ID: "+elemento[0]+" | Nombre: "+elemento[1]+" | Monedero: "+elemento[2]+" | Preferencias: "+elemento[3]+"]";
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
